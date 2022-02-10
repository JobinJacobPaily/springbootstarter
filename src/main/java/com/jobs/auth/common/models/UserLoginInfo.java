package com.jobs.auth.common.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tbl_user_login_info")
public class UserLoginInfo extends AbstractModel {

    private static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_login_id", nullable = false)
    private Long userLoginId;

    @Column(name = "user_id")
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private  User user;

    @Column(name = "app_id")
    private Long appId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_info_app_id", insertable = false, updatable = false)
    private  AppInfo appInfo;

    @Column(name = "token")
    private String token;



}
