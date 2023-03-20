package io.spring.temp.controller;

import io.spring.temp.service.UserService;
import io.spring.temp.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public ResponseEntity<List<UserVO>> selectUserList(){
        return ResponseEntity.ok(userService.selectUserList());
    }
}
