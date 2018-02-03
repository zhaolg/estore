package com.estore.controller;

import com.estore.service.interfaces.IUserLoginSV;
import io.swagger.annotations.ApiOperation;
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
    IUserLoginSV userLoginSV;

    @ApiOperation(value="登录界面", notes="初始化登录界面")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        try {
            userLoginSV.userLogin("", "");
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error(e.getMessage());
            }
        }
        return "login";
    }

    @ApiOperation(value="首页", notes="初始化首页界面")
    @RequestMapping(value = "/index")
    public String login(Model model, String username, String passwd) {
        try {
            if (userLoginSV.userLogin(username, passwd)) {
                return "index";
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error(e.getMessage());
            }
        }
        return "index";
    }


}
