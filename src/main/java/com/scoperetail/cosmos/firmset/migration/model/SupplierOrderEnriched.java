package com.scoperetail.cosmos.firmset.migration.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "supplier_order_enriched")
@Data
@NoArgsConstructor
public class SupplierOrderEnriched {
    @Id
    private Integer order_id;
    private String src_order_id;
    private Timestamp create_ts;
    private Integer route_id;
    private String route_code;
    private Integer stop_id;
    private String comment_txt;
    private String src_order_id_2;
    private String src_supp_id;
    private Character notify_ind;

    public SupplierOrderEnriched(String src_order_id, Timestamp create_ts, Integer route_id, String route_code, Integer stop_id, String comment_txt, String src_order_id_2, String src_supp_id, Character notify_ind) {
        this.src_order_id = src_order_id;
        this.create_ts = create_ts;
        this.route_id = route_id;
        this.route_code = route_code;
        this.stop_id = stop_id;
        this.comment_txt = comment_txt;
        this.src_order_id_2 = src_order_id_2;
        this.src_supp_id = src_supp_id;
        this.notify_ind = notify_ind;
    }
}
