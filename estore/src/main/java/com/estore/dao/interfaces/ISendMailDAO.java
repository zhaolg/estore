package com.estore.dao.interfaces;

/**
 * Created by zhaolg on 2018/1/4
 *
 * @return
 * @throws Exception
 */
public interface ISendMailDAO {

    public boolean sendMial(String mailAddr,String content)throws Exception;

    public boolean sendSms(String mailAddr,String content)throws Exception;

}
