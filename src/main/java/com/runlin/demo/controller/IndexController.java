package com.runlin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName : IndexController
 * @Description :
 * @Author : RunLin
 * @Date: 2020-07-20 14:27
 */

@Controller
public class IndexController {

    /**
     * index
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("/index")
    public Object getCarRouteForTima(HttpServletRequest request, ModelAndView mv) {

        mv.setViewName("index");
        return mv;
    }
    /**
     * 首页1
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("/page/welcome")
    public Object welcome(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/welcome-1");
        return mv;
    }

    /**
     * 首页1
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("/page/welcome2")
    public Object welcome2(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/welcome-2");
        return mv;
    }

    /**
     * 首页1
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("/page/welcome3")
    public Object welcome3(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/welcome-3");
        return mv;
    }
    /**
     * 菜单管理
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/menu")
    public Object menu(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/menu");
        return mv;
    }


    /**
     * 系统设定
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/setting")
    public Object setting(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/setting");
        return mv;
    }

    /**
     * 表格示列
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/table")
    public Object table(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/table-1");
        return mv;
    }

    /**
     * 普通表单
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/form1")
    public Object form1(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/form-1");
        return mv;
    }

    /**
     * 分步表单
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/formStep")
    public Object formStep(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/form-step");
        return mv;
    }

    /**
     * 登录1
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/login1")
    public Object login1(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/login-1");
        return mv;
    }

    /**
     * 登录1
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/login2")
    public Object login2(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/login-2");
        return mv;
    }

    /**
     * 404
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/page404")
    public Object page404(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/404");
        return mv;
    }


    /**
     * 按钮示例
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/button")
    public Object button(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/button");
        return mv;
    }

    /**
     * 弹出层
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping("page/layer")
    public Object layer(HttpServletRequest request, ModelAndView mv) {
        mv.setViewName("page/layer");
        return mv;
    }





}
