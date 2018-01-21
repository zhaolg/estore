package com.estore.common.exception;

/**
 * Created by zhaolg on 2018/1/21
 *
 * @return
 * @throws Exception
 */
public class UserInfoException extends RuntimeException {

    public UserInfoException() {
    }

    public UserInfoException(String message) {
        super(message);
    }

    public UserInfoException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInfoException(Throwable cause) {
        super(cause);
    }

    public UserInfoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
