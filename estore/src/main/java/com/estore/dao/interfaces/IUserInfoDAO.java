package com.estore.dao.interfaces;

import com.estore.model.UserInfo;

/**
 * Created by zhaolg on 2018/1/21
 * @return
 * @throws Exception
 */
public interface IUserInfoDAO{

    void saveUserInfo(UserInfo userInfo)throws Exception;

    void delUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    UserInfo queryUserInfo(String userName);

    UserInfo findAllByLoginName(String loginName);

}
