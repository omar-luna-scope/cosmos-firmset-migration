package com.scoperetail.cosmos.firmset.migration.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class OrderResponse {
    //orderHeader
    Long srcOrderId;
    String srcOrderCreateTimestamp;
    String orderTypeCode;
    Character orderHoldForFuture;
    Integer routeId;
    Integer routeCode;
    Integer stopId;
    String comment;
    Integer srcOrderId2;
    Integer supplierIds;
    Character notifyInd;
    Character skipRouting;
    String sosMode;

    //lines
    Long productId;
    Integer orderedItemQuantity;

    //customer
    Integer corpId;
    Integer divisionId;
    Long customerId;
}
