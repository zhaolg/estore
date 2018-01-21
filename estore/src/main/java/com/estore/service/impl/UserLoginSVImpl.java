package com.estore.service.impl;

import com.estore.common.exception.LoginExcetion;
import com.estore.dao.interfaces.IUserInfoDAO;
import com.estore.model.UserInfo;
import com.estore.service.interfaces.IUserLoginSV;
import com.estore.util.MD5Util;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Created by zhaolg on 2018/1/20
 *
 * @return
 * @throws Exception
 */
@Service
@Transactional
public class UserLoginSVImpl implements IUserLoginSV{

    private static transient Logger log = LoggerFactory.getLogger(IUserLoginSV.class);

    @Autowired
    IUserInfoDAO userInfoDAO;

    @Override
    public boolean userLogin(String username, String passwd) throws Exception {
        if(log.isErrorEnabled()){
            log.error("login:username:"+username+" ,passwd:"+passwd);
        }
        if(StringUtils.isEmpty(username)){
             throw new LoginExcetion("loginName is null !!!");
        }
        if(StringUtils.isEmpty(passwd)){
            throw new LoginExcetion("passwd is null !!!");
        }
        String md5Pass = MD5Util.MD5(passwd);
        UserInfo allByLoginName = userInfoDAO.findAllByLoginName(username);
        if(!ObjectUtils.isEmpty(allByLoginName)){
            if (md5Pass.equals(allByLoginName.getLoginPasswd())){
                return true;
            }else {
                throw new LoginExcetion("密码错误！！！");
            }
        }
        return false;
    }

    @Override
    public boolean userlogout(String username) throws Exception {
        if(log.isErrorEnabled()){
            log.error("logout:username:"+username);
        }
        return true;
    }

    @Override
    public void saveUserInfo(UserInfo userInfo) throws Exception {
        userInfoDAO.saveUserInfo(userInfo);
        throw new Exception("yyyy");
    }

    @Override
    public void delUserInfo(UserInfo userInfo) {
        userInfoDAO.delUserInfo(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoDAO.updateUserInfo(userInfo);
    }

    @Override
    public UserInfo queryUserInfo(String userName) {
        return userInfoDAO.queryUserInfo(userName);
    }

    @Override
    public UserInfo findAllByLoginName(String loginName) {
        return userInfoDAO.findAllByLoginName(loginName);
    }
}
