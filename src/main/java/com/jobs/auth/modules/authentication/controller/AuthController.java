package com.jobs.auth.modules.authentication.controller;

import com.jobs.auth.common.constants.ApiUrls;
import com.jobs.auth.common.constants.StatusEnum;
import com.jobs.auth.common.models.rest.ApiResponse;
import com.jobs.auth.modules.authentication.Builder.ResponseBuilder;
import com.jobs.auth.modules.authentication.model.RegisterRequest;
import com.jobs.auth.modules.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class AuthController {

    @Autowired
    UserService userService;

    @Autowired
    ResponseBuilder responseBuilder;

    @PostMapping(ApiUrls.REGISTER)
   public ResponseEntity<ApiResponse> Register(@RequestBody @Valid RegisterRequest registerRequest, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return ResponseEntity.ok(
                    responseBuilder.getIndividualResponse(null,StatusEnum.FAILED)
            );
        }
    ApiResponse apiResponse = responseBuilder.getIndividualResponse(userService.register(registerRequest), StatusEnum.SUCCESS);
    return ResponseEntity.ok(apiResponse);
}


}
