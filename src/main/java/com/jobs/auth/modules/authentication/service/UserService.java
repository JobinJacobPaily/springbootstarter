package com.jobs.auth.modules.authentication.service;

import com.jobs.auth.modules.authentication.model.RegisterRequest;
import com.jobs.auth.modules.authentication.model.RegisterResponse;

public interface UserService {

RegisterResponse register(RegisterRequest registerRequest);



}
