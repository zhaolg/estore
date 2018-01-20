package com.estore.service.impl;

import com.estore.service.interfaces.IUserLoginSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by zhaolg on 2018/1/20
 *
 * @return
 * @throws Exception
 */
@Service
public class UserLoginSVImpl implements IUserLoginSV{

    private static transient Logger log = LoggerFactory.getLogger(IUserLoginSV.class);

    @Override
    public boolean userLogin(String username, String passwd) throws Exception {
        if(log.isErrorEnabled()){
            log.error("login:username:"+username+" ,passwd:"+passwd);
        }
        return true;
    }

    @Override
    public boolean userlogout(String username) throws Exception {
        if(log.isErrorEnabled()){
            log.error("logout:username:"+username);
        }
        return true;
    }
}
