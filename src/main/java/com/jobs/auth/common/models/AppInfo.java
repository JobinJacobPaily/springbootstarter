package com.jobs.auth.common.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tbl_app_info")
public class AppInfo extends  AbstractModel{

    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id", nullable = false)
    private Long appId;

    @Column(name = "device_id")
    private String deviceId;


}
