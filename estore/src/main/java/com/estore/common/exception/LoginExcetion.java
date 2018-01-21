package com.estore.common.exception;

/**
 * Created by zhaolg on 2018/1/21
 *
 * @return
 * @throws Exception
 */
public class LoginExcetion extends RuntimeException{
    public LoginExcetion() {
    }

    public LoginExcetion(String message) {
        super(message);
    }

    public LoginExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginExcetion(Throwable cause) {
        super(cause);
    }

    public LoginExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
