package com.saas.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class Base {
    @Id
    private Long id;
    private Long create_user_id;
    private String create_date;
    private Long update_user_id;
    private String update_date;
}
