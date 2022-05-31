package com.scoperetail.cosmos.firmset.migration.repository;

import com.scoperetail.cosmos.firmset.migration.dto.OrderResponse;
import com.scoperetail.cosmos.firmset.migration.model.SupplierOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierOrderRepo extends JpaRepository<SupplierOrder, Integer>{

    @Query(value = "SELECT" +
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
            "oc.customer_id" +
            "FROM sop..supplier_order so " +
            "JOIN sop..order_customer oc on oc.order_id = so.order_id" +
            "JOIN sop..supplier_order_enriched soe on soe.order_id = so.order_id" +
            "JOIN sop..order_line ol on ol.order_id = so.order_id" +
            "WHERE so.future_order = 'Y'",  nativeQuery = true)
    List<OrderResponse> getAllFirmSetOrders();
}


