package com.example.demo.global.apiPayload.code.status;

import com.example.demo.global.apiPayload.code.BaseCode;
import com.example.demo.global.apiPayload.code.ReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {

    // 보안 2000
    MEMBER_EMAIL_REGISTER_OK(HttpStatus.OK, "AUTH001", "회원 가입이 완료되었습니다."),
    MEMBER_EMAIL_LOGIN_OK(HttpStatus.OK, "AUTH002", "회원 로그인이 완료되었습니다."),
    MEMBER_DELETE_OK(HttpStatus.OK, "AUTH003", "회원 탈퇴가 완료되었습니다."),
    MEMBER_REFRESH_OK(HttpStatus.OK, "AUTH004", "토큰 재발급이 완료되었습니다."),

    ;

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build()
                ;
    }
}