package site.pointman.login.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import site.pointman.login.domain.Member;

import java.util.List;


@Mapper
public interface UserMapper {
 Member validationLogin(Member member);
}
