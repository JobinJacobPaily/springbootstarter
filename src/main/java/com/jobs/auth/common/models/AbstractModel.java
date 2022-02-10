package com.jobs.auth.common.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.math.BigInteger;

@Getter
@Setter
public class AbstractModel {

    private static  final long serialVersionUID = 1L;


}
