package io.spring.temp.mapper;

import io.spring.temp.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserVO> selectUserList();
    int insertUser(UserVO userVO);
}
