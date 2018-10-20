package com.study.springbootthymeleaf.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "conf_icds_cat_list")
public class IcdsCat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id", nullable = false,unique = true)
    private Integer catId;
    @Column(name = "cat_pid")
    private int catPid;
    @Column(name = "cat_type")
    private int catType;
    @Column(name = "cat_name")
    private String catName;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "status")
    private int status;
}