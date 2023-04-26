package io.spring.temp.service;

import io.spring.temp.base.BaseService;
import io.spring.temp.mapper.UserMapper;
import io.spring.temp.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements BaseService<UserVO> {

    private final UserMapper userMapper;

    @Override
    public List<UserVO> findAll() {
        return userMapper.selectUserList();
    }

    @Override
    public UserVO findById(int id) {
        return null;
    }

    @Override
    public void insert(UserVO userVO) {
        userMapper.insertUser(userVO);
    }

    @Override
    public void update(int id, UserVO userVO) {

    }

    @Override
    public void deleteById(int id) {

    }
}
