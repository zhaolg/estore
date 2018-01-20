package com.estore.service.impl;

import com.estore.service.interfaces.ISendMailSV;

/**
 * Created by zhaolg on 2018/1/4
 *
 * @return
 * @throws Exception
 */
public class SendMailSVImpl implements ISendMailSV{



    @Override
    public boolean sendMial(String mailAddr, String content) throws Exception {
        return false;
    }

    @Override
    public boolean sendSms(String mailAddr, String content) throws Exception {
        return false;
    }
}
