package com.estore.service.interfaces;

import com.estore.model.UserInfo;

/**
 * Created by zhaolg on 2018/1/20
 *
 * @return
 * @throws Exception
 */
public interface IUserLoginSV {

    boolean userLogin(String username,String passwd)throws Exception;

    boolean userlogout(String username)throws Exception;

    void saveUserInfo(UserInfo userInfo) throws Exception;

    void delUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    UserInfo queryUserInfo(String userName);

    UserInfo findAllByLoginName(String loginName);


}
