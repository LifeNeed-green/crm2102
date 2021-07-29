package com.bjpowernode.controller;

import com.bjpowernode.pojo.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Date {
    @RequestMapping("/one")
    public String getdate(String name, int age) {
        System.out.println("姓名：" + name + "，年龄：" + age);
        return "main";
    }


        @RequestMapping("/two")
        public String getdate2(User user) {
            System.out.println("姓名：" + user.getName() + "，年龄：" + user.getAge());
            return "main";
        }


        @RequestMapping("/three/{name}/{age}")
        public String getdate3(
                @PathVariable
                String name,
                @PathVariable
                int age) {
            System.out.println("姓名：" + name+ "，年龄：" +age);
            System.out.println("动态占位符获取");
            return "main";
        }

    @RequestMapping("/four")
    public String getdate4(
            @RequestParam("name")
            String enname,
            @RequestParam("age")
            int enage) {
        System.out.println("姓名：" + enname + "，年龄：" + enage);
        System.out.println("请求参数名称与形参名称不一致");
        return "main";
    }

    @RequestMapping("/five")
    public String getdate5(HttpServletRequest request) {
        String name=request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));
        System.out.println("姓名：" + name + "，年龄：" + age);
        System.out.println("使用传统方式");
        return "main";
    }
}
