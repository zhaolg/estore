package com.estore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhaolg on 2018/1/1
 *
 * @return
 * @throws Exception
 */
@Controller
public class TemplateController {

    @RequestMapping("/helloHtml")
    public String template()throws Exception{
        return"/template/index.html";
    }

    @RequestMapping("/helloFtl")
    public String helloFtlp(){
        return"/template/index.html";
    }

}
