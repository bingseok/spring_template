package com.example.demo.global.apiPayload.exception;

import com.example.demo.global.apiPayload.code.BaseErrorCode;

public class AuthException extends GeneralException {
    public AuthException(BaseErrorCode code) {
        super(code);
    }
}
