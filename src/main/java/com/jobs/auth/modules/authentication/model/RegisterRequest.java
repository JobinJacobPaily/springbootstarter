package com.jobs.auth.modules.authentication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest extends AbstractView {

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;

}
