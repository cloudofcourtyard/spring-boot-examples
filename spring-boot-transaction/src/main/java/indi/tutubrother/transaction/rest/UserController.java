package indi.tutubrother.transaction.rest;

import indi.tutubrother.transaction.po.UserPo;
import indi.tutubrother.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/19 21:50
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<UserPo> list() {
        return userService.list();
    }
}
