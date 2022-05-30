package com.scoperetail.cosmos.firmset.migration.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "supplier_order_enriched")
public class SupplierOrderEnriched {
    @Id
    private Integer order_id;
    private String src_order_id;
    private Integer total_item_qty;
    private Float total_item_wgt;
    private Float total_pallet_qty;
    private Float total_cube_volume;
    private Date scheduled_cutoff_date;
    private Time scheduled_cutoff_time;
    private Date scheduled_release_date;
    private Time scheduled_release_time;
    private Date scheduled_delivery_date;
    private Date scheduled_process_date;
    private Date restricted_order_date;
    private Date shelf_availability_date;
    private Time auto_allocation_start_time;
    private Time auto_allocation_end_time;
    private Integer stop_id;
    private Integer route_id;
    private String route_code;
    private String po_ref_nbr;
    private String transfer_type_cd;
    private String comment_txt;
    private Timestamp create_ts;
    private String created_by;
    private Timestamp last_modified_ts;
    private String last_modified_by;
    private Character notify_ind;
    private BigDecimal total_case_qty;
    private BigDecimal total_item_cntr_wgt;
    private BigDecimal total_item_cntr_pallet;
    private BigDecimal total_item_cntr_cube_volume;
    private Timestamp scheduled_rel_start_time;
    private Timestamp scheduled_rel_end_time;
    private Integer schedule_id;
    private Integer total_ord_item_qty;
    private Timestamp src_order_create_ts;
    private Integer orig_cust_line_cnt;
    private Integer orig_supp_line_cnt;
    private String src_supp_id;
    private String src_order_id_2;
    private Long min_qty_rule_violation;
    private Long max_qty_rule_violation;
    private Long ssg_id;
    private Long srg_id;
    private String ssg_ids;
    private Integer offset_days;

}
