package site.pointman.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import site.pointman.login.domain.Member;
import site.pointman.login.service.UserLoginService;

@Controller
public class LoginController {
    private UserLoginService userLoginService;
    @Autowired
    public LoginController(UserLoginService userLoginService){
        this.userLoginService=userLoginService;
    }

    @GetMapping("/")
    public String loginIndex(){
        System.out.println("login");
        return "/Gp/login/login";
    }
    @RequestMapping("/")
    public String loginValidation(@RequestParam("id") String id ,@RequestParam("pwd") String pwd){
        Member member = new Member();
        member.setId(id);
        member.setPwd(pwd);
        userLoginService.validationLogin(member);
        System.out.println("index");
        System.out.println("ID: "+member.getId());
        System.out.println("PWD: "+member.getPwd());
        return "/Gp/index";
    }
}
