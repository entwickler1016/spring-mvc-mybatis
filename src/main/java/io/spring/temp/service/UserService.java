package io.spring.temp.service;

import io.spring.temp.mapper.UserMapper;
import io.spring.temp.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<UserVO> selectUserList(){
        return userMapper.selectUserList();
    }

    public int insertUser(UserVO userVO){
        return userMapper.insertUser(userVO);
    }
}
