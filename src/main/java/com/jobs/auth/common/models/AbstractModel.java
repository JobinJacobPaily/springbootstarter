package com.jobs.auth.common.models;

import lombok.Data;

import javax.persistence.Column;
import java.math.BigInteger;

@Data
public class AbstractModel {

    @Column(name = "created")
    private BigInteger created;


    @Column(name = "updated")
    private BigInteger updated;
}
