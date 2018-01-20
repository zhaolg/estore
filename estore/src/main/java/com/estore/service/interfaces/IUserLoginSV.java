package com.estore.service.interfaces;

/**
 * Created by zhaolg on 2018/1/20
 *
 * @return
 * @throws Exception
 */
public interface IUserLoginSV {

    boolean userLogin(String username,String passwd)throws Exception;

    boolean userlogout(String username)throws Exception;


}
