package com.estore.service.interfaces;

/**
 * Created by zhaolg on 2018/1/4
 *
 * @return
 * @throws Exception
 */
public interface ISendMailSV {

    public boolean sendMial(String mailAddr,String content)throws Exception;

    public boolean sendSms(String mailAddr,String content)throws Exception;

}
