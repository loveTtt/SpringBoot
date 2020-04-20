package com.saas.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_ctms_fuiou_term")
public class FuiouTerm implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_date")
	private java.util.Date createDate;

	@Column(name = "create_user_id")
	private Long createUserId;

	@Column(name = "update_date")
	private java.util.Date updateDate;

	@Column(name = "update_user_id")
	private Long updateUserId;

	@Column(name = "term_contact_ph")
	private String termContactPh;

	@Column(name = "term_contact_ps")
	private String termContactPs;

	@Column(name = "term_county_cd")
	private String termCountyCd;

	@Column(name = "term_id")
	private String termId;

	@Column(name = "term_inst_area")
	private String termInstArea;

	@Column(name = "term_name")
	private String termName;

	@Column(name = "term_serial_no")
	private String termSerialNo;

	@Column(name = "merchant_fuiou_account_id")
	private Long merchantFuiouAccountId;

}
