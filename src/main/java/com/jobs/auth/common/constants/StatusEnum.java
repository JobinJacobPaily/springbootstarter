package com.jobs.auth.common.constants;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum StatusEnum {

    SUCCESS(2000, "Success"),
    FAILED(2001,"Failed"),
    NO_DATA(2004,"Not found");

    private final Integer code;
    private final String message;

    StatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
