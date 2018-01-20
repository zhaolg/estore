package com.estore.controller;

import com.estore.service.interfaces.IUserLoginSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by zhaolg on 2018/1/20
 *
 * @return
 * @throws Exception
 */
@Controller
@EnableAutoConfiguration
public class UserConleController {

    private static transient Logger log = LoggerFactory.getLogger(UserConleController.class);

    @Autowired
    IUserLoginSV userLoginSV ;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model) throws Exception {
        userLoginSV.userLogin("","");
        return "login";
    }

    @RequestMapping(value = "/index")
    public String login(Model model,String username,String passwd) throws Exception {
        if(userLoginSV.userLogin(username,passwd)){
            return "index";
        }
        return "index";
    }

    @RequestMapping(value = "/logout")
    public String logout() throws Exception {
        //userLoginSV.userlogout();
        return "login";
    }


}