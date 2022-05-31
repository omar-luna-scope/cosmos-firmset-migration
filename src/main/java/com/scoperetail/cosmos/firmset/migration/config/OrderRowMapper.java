package com.scoperetail.cosmos.firmset.migration.config;

import com.scoperetail.cosmos.firmset.migration.dto.OrderResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setSrc_order_id(rs.getString("src_order_id"));
        orderResponse.setSrcOrderCreateTimestamp(rs.getTimestamp("src_order_create_ts"));
        orderResponse.setOrderTypeID(rs.getInt("order_type_id"));
        orderResponse.setOrderHoldForFuture(rs.getString("future_order"));
        orderResponse.setRouteId(rs.getInt("route_id"));
        orderResponse.setStopId(rs.getInt("stop_id"));
        orderResponse.setComment(rs.getString("comment_txt"));
        orderResponse.setSrcOrderId2(rs.getInt("src_order_id_2"));
        orderResponse.setSupplierIds(rs.getString("src_supp_id"));
        orderResponse.setNotifyInd(rs.getString("notify_ind"));
        orderResponse.setSkipRouting(rs.getString("skip_routing"));
        orderResponse.setProductId(rs.getLong("product_id"));
        orderResponse.setOrderedItemQuantity(rs.getInt("ordered_item_qty"));
        orderResponse.setDivisionId(rs.getInt("division_id"));
        orderResponse.setCustomerId(rs.getLong("customer_id"));

        return orderResponse;
    }
}
