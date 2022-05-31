package com.scoperetail.cosmos.firmset.migration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "order_line")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLine {
    @Id
    private Integer line_nbr;
    private Long product_id;
    private BigDecimal ordered_item_wgt;

    public OrderLine(Long product_id, BigDecimal ordered_item_wgt) {
        this.product_id = product_id;
        this.ordered_item_wgt = ordered_item_wgt;
    }
}
