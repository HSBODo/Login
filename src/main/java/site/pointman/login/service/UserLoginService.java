package site.pointman.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.pointman.login.domain.MemberVO;
import site.pointman.login.mapper.UserMapper;

@Service
public class UserLoginService {
     @Autowired
     private UserMapper userMapper;

     public int validationLogin(MemberVO member) {
         int result =  userMapper.validationLogin(member);
          System.out.println(result);
          return result;
     }
}
