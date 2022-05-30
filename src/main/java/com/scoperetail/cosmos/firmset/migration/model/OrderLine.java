package com.scoperetail.cosmos.firmset.migration.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "order_line")
public class OrderLine {
    @Id
    private Integer line_nbr;
    private Integer order_id;
    private Integer order_line_status_id;
    private Integer change_reason_id;
    private Long product_id;
    private Long orig_product_id;
    private Integer ordered_item_qty;
    private BigDecimal ordered_item_wgt;
    private String ordered_uom;
    private Timestamp create_ts;
    private String created_by;
    private Timestamp last_modified_ts;
    private String last_modified_by;
    private Integer rejct_rsn_code;
    private Integer expired_product_id;
    private String orig_product_desc;
}
