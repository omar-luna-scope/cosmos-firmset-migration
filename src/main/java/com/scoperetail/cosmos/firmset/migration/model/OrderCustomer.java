package com.scoperetail.cosmos.firmset.migration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.*;

@Data
@Entity
@Table(name = "order_customer")
@AllArgsConstructor
@NoArgsConstructor
public class OrderCustomer {
    @Id
    private Integer order_id;
    private Integer division_id;

    public OrderCustomer(Integer division_id, Integer customer_id) {
        this.division_id = division_id;
        this.customer_id = customer_id;
    }

    private Integer customer_id;
}
