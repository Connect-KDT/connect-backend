package com.hackathon.connectbackend.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private final boolean success = true;
    private T data;

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(data);
    }
}
