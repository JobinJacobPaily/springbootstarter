package com.jobs.auth.modules.authentication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterResponse extends AbstractView{

    private Long userId;
}
