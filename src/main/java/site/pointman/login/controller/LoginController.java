package site.pointman.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import site.pointman.login.domain.MemberVO;
import site.pointman.login.service.UserLoginService;

import java.lang.reflect.Member;

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
        MemberVO member = new MemberVO();
        member.setId(id);
        member.setPwd(pwd);
        int result = userLoginService.validationLogin(member);
        if(result==1){
            return "/Gp/index";
        }else {
            return "/Gp/login/login";
        }

    }
}
