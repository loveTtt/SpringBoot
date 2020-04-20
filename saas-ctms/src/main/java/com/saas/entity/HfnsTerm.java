package com.saas.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="t_ctms_hfns_term")
public class HfnsTerm implements Serializable {
    @Id
    private Long id;
    private Long create_user_id;
    private String create_date;
    private Long update_user_id;
    private String update_date;
    @Column(name ="baseid")
    private Long baseId;
    private String base_name;
    @Column(name = "merchant_account_id")
    private Long account_id;
    @Column(name = "merchant_hfns_id")
    private Long hfnsId;
    @Column(name = "orgid")
    private Long orgId;
    private String org_name;
    private String term_div;
    private String type;
}
