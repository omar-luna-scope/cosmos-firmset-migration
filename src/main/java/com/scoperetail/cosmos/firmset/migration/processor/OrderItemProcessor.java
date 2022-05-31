package com.scoperetail.cosmos.firmset.migration.processor;

import com.scoperetail.cosmos.firmset.migration.dto.OrderResponse;
import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<OrderResponse, OrderResponse> {
    @Override
    public OrderResponse process(OrderResponse orderResponse) throws Exception {
        return orderResponse;
    }
}
