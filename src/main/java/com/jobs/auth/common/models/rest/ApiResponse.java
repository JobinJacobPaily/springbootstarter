package com.jobs.auth.common.models.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jobs.auth.common.constants.StatusEnum;
import com.jobs.auth.modules.authentication.model.AbstractView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T extends AbstractView> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Status status;

    private T data;

    public ApiResponse(Status status, T data) {
        this.status = status;
        this.data = data;
    }

    public ApiResponse(StatusEnum statusEnum , T data) {
      this.status = new Status(statusEnum.getCode() , statusEnum.getMessage());
      this.data = data;
    }

    public ApiResponse(StatusEnum statusEnum, String statusMessage, T data) {
        this.status = new Status(statusEnum.getCode(), statusMessage);
        this.data = data;
    }
}
