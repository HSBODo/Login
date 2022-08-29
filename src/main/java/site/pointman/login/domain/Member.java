package site.pointman.login.domain;


import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;

public class Member {
   private String id  ;
   private String pwd ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
