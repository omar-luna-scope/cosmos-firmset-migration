package com.scoperetail.cosmos.firmset.migration.dto;

import lombok.*;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    //orderHeader
    String src_order_id;
    Timestamp srcOrderCreateTimestamp;
    Integer orderTypeID;
    String orderHoldForFuture;
    Integer routeId;
    Integer routeCode;
    Integer stopId;
    String comment;
    Integer srcOrderId2;
    String supplierIds;
    String notifyInd;
    String skipRouting;
    String sosMode;

    //lines
    Long productId;
    Integer orderedItemQuantity;

    //customer
    Integer corpId;
    Integer divisionId;
    Long customerId;
}
