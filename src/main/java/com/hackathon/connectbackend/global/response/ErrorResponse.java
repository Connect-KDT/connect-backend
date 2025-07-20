package com.hackathon.connectbackend.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private final boolean success = false;
    private String errorCode;

    public static ErrorResponse fail(ErrorCode errorCode){
        return new ErrorResponse(errorCode.getCode());
    }
}
