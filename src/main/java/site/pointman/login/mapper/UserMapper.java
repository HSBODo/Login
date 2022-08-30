package site.pointman.login.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.pointman.login.domain.MemberVO;


@Mapper
public interface UserMapper {
 int validationLogin(MemberVO member);
}
