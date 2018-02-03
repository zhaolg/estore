package com.estore.dao.impl;

import com.estore.common.exception.UserInfoException;
import com.estore.dao.interfaces.IUserInfoDAO;
import com.estore.dao.interfaces.UserinfoRepository;
import com.estore.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * Created by zhaolg on 2018/1/21
 * @return
 * @throws Exception
 */
@Service
public class UserInfoDAOImpl implements IUserInfoDAO{

    private static transient Logger log = LoggerFactory.getLogger(IUserInfoDAO.class);

    @Autowired
    UserinfoRepository userinfoRepository ;

    @Override
    public void saveUserInfo(UserInfo userInfo) throws Exception{
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new UserInfoException("userInfo is null !!!");
        }
        UserInfo save = userinfoRepository.save(userInfo);
        if (log.isErrorEnabled()){
            log.error(save.getUserId()+"");
        }
    }

    @Override
    public void delUserInfo(UserInfo userInfo) {
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new UserInfoException("userInfo is null !!!");
        }
        userinfoRepository.delete(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new UserInfoException("userInfo is null !!!");
        }
        userinfoRepository.save(userInfo);
    }

    @Override
    public UserInfo queryUserInfo(String userName) {
        if (StringUtils.isEmpty(userName)) {
            throw new UserInfoException("userName is null !!!");
        }
        return userinfoRepository.findOneByUserName(userName);
    }

    @Override
    public UserInfo findAllByLoginName(String loginName) {
        if (StringUtils.isEmpty(loginName)) {
            throw new UserInfoException("loginName is null !!!");
        }
        return userinfoRepository.findOneByLoginName(loginName);
    }
}
