package com.hackathon.connectbackend.global.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    //공통(DB, 서버 내부 예외 등 전체적인 시스템 오류)
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"S000","서버오류"),

    //auth
    //user
    //chatting
    //counsel
    //mission
;

    private final HttpStatus status;
    private final String code;
    private final String message;

}
