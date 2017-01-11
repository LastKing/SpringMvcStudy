package com.ltx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rain on 2017/1/11.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")  //此处控制浏览器里访问路径 具体为：/SpringDemo/helloworld
    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //输出字符串
        response.getWriter().append("hello world");
    }
}
