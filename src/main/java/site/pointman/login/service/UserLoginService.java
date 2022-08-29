package site.pointman.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import site.pointman.login.domain.Member;
import site.pointman.login.mapper.UserMapper;

@Service
public class UserLoginService {
     @Autowired
     private UserMapper userMapper;

     public Member validationLogin(Member member) {
          Member result =  userMapper.validationLogin(member);
          System.out.println("조회id: "+userMapper.validationLogin(member).getId());
          System.out.println("조회pwd: "+userMapper.validationLogin(member).getPwd());
          return result;
     }
}
