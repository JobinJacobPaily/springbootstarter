package com.jobs.auth.modules.authentication.model;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LoginRequest extends AbstractView {

    @NotNull(message = "Email is required")
    private String email;

    @NotNull (message = "Password is required")
    private String password;

}
