package site.pointman.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.pointman.login.mapper.UserMapper;

@Service
public class UserLogin {
    @Autowired
    UserMapper userMapper;

    public void testXML(){
        System.out.println("-----------sever start");
        String testTXT = userMapper.testXML();
        System.out.println("TIMESTAMP: " + testTXT);
    }

}
