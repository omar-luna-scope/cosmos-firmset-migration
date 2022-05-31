package com.scoperetail.cosmos.firmset.migration.config;

import com.scoperetail.cosmos.firmset.migration.dto.OrderResponse;
import com.scoperetail.cosmos.firmset.migration.processor.OrderItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcCursorItemReader<OrderResponse> reader(){
        JdbcCursorItemReader<OrderResponse> cursorItemReader = new JdbcCursorItemReader<>();
        cursorItemReader.setDataSource(dataSource);
        cursorItemReader.setSql("SELECT " +
                        "soe.src_order_id," +
                        "soe.src_order_create_ts," +
                        "so.order_type_id," +
                        "so.future_order," +
                        "soe.route_id," +
                        "soe.route_code," +
                        "soe.stop_id," +
                        "soe.comment_txt," +
                        "soe.src_order_id_2," +
                        "soe.src_supp_id," +
                        "soe.notify_ind," +
                        "so.skip_routing," +
                        "ol.product_id," +
                        "ol.ordered_item_qty," +
                        "oc.division_id," +
                        "oc.customer_id " +
                        "from sop.dbo.supplier_order so " +
                        "join sop.dbo.order_customer oc on oc.order_id = so.order_id " +
                        "join sop.dbo.supplier_order_enriched soe on soe.order_id = so.order_id " +
                        "join sop.dbo.order_line ol on ol.order_id = so.order_id " +
                        "where so.future_order = 'Y'");
        cursorItemReader.setRowMapper(new OrderRowMapper());
        return cursorItemReader;
    }

    @Bean
    public OrderItemProcessor processor(){
        return new OrderItemProcessor();
    }

    @Bean
    public StaxEventItemWriter<OrderResponse> writer(){
        StaxEventItemWriter<OrderResponse> writer = new StaxEventItemWriter<OrderResponse>();
        writer.setResource(new ClassPathResource("firmSetOrder.xml"));

        Map<String,String> aliasesMap = new HashMap<>();
        aliasesMap.put("OrderCustomer", "com.scoperetail.firmsetordermigration.model.OrderCustomer");
        XStreamMarshaller marshaller = new XStreamMarshaller();
        marshaller.setAliases(aliasesMap);
        writer.setMarshaller(marshaller);
        writer.setRootTagName("firmSetOrders");
        writer.setOverwriteOutput(true);
        return writer;
    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("step1").<OrderResponse, OrderResponse>chunk(10).reader(reader()).processor(processor()).writer(writer()).build();
    }

    @Bean
    public Job exportOrdersJob(){
        return jobBuilderFactory.get("exportOrdersJob").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
    }
}

/*

 */