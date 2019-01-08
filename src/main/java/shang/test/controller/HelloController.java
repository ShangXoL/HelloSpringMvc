package main.java.shang.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author shangXoL
 * @Date 2019/1/8 15:04
 **/
@org.springframework.stereotype.Controller
public class HelloController{
    @RequestMapping("/hello")
    public ModelAndView hello(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

    @RequestMapping("/jump")
    public ModelAndView jump() {
        //地址会变
        ModelAndView mav = new ModelAndView("redirect:/hello");
        return mav;
    }

    @RequestMapping("/test")
    public ModelAndView test(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("test");
        return mav;
    }

    @RequestMapping("/param")
    public ModelAndView getParam(HttpServletRequest request,
                                 HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        System.out.println(userName);
        System.out.println(password);
        return null;
    }

}
