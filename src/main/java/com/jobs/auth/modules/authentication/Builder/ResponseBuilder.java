package com.jobs.auth.modules.authentication.Builder;

import com.jobs.auth.common.constants.StatusEnum;
import com.jobs.auth.common.models.rest.ApiResponse;
import com.jobs.auth.common.models.rest.Status;
import com.jobs.auth.modules.authentication.model.AbstractView;
import org.springframework.stereotype.Component;

@Component
public class ResponseBuilder {

   public ApiResponse getIndividualResponse(AbstractView data, StatusEnum statusEnum) {
        return buildIndividualResponse(data, statusEnum);
    }

    private ApiResponse<AbstractView> buildIndividualResponse(AbstractView data, StatusEnum statusEnum) {
        final ApiResponse<AbstractView> apiResponse = new ApiResponse<>();
        final Status status = new Status();
        if (data == null) {
            statusEnum = StatusEnum.FAILED;
        } else {
            apiResponse.setData(data);
        }
        status.setStatusMessage(statusEnum.getMessage());
        status.setStatusCode(statusEnum.getCode());
        apiResponse.setStatus(status);
        return apiResponse;
    }
}
