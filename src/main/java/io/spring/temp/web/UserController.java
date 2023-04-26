package io.spring.temp.web;

import io.spring.temp.base.BaseController;
import io.spring.temp.base.Result;
import io.spring.temp.service.UserService;
import io.spring.temp.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController implements BaseController<UserVO> {

    private final UserService userService;

    @Override
    public ResponseEntity<Result> findAll() {

        List<UserVO> result = userService.findAll();

        return ResponseEntity.ok(new Result(result));
    }

    @Override
    public ResponseEntity<Result> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Result> insert(UserVO userVO) {

        userService.insert(userVO);

        return ResponseEntity.ok(new Result());
    }

    @Override
    public ResponseEntity<Result> update(Long id, UserVO userVO) {
        return null;
    }

    @Override
    public ResponseEntity<Result> deleteById(Long id) {
        return null;
    }
}
