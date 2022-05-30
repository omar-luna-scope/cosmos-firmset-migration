package com.scoperetail.cosmos.firmset.migration.model;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "order_customer")
public class OrderCustomer {
    @Id
    private Integer order_id;
    private Integer cust_order_id;
    private Integer batch_id;
    private Long supplier_id;
    private Integer supplier_type_id;
    private String supplier_name;
    private Integer order_type_id;
    private Integer order_status_id;
    private Integer order_sched_status_id;
    private Integer change_reason_id;
    private Timestamp sys_ord_release_ts;
    private Timestamp create_ts;
    private String created_by;
    private Timestamp last_modified_ts;
    private String last_modified_by;
    private String dist_center_id;
    private String phys_whse_id;
    private Character is_b2b;
    private String b2_transfer_format;
    private Character is_locked_for_edit;
    private Character future_order;
    private String supp_division_id;
    private Character enrichment_status;
    private Character veto;
    private Character skip_routing;
    private String timezone_cd;
    private String lookup_strategy;
    private Date minimum_process_date;
    private Character exact_match;
}
