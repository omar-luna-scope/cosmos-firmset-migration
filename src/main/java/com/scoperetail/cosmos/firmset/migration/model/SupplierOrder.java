package com.scoperetail.cosmos.firmset.migration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "supplier_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierOrder {
    @Id
    private Integer order_id;
    private Integer order_type_id;
    private String future_order;
    private String skip_routing;

    public SupplierOrder(Integer order_type_id, String future_order, String skip_routing) {
        this.order_type_id = order_type_id;
        this.future_order = future_order;
        this.skip_routing = skip_routing;
    }
}
