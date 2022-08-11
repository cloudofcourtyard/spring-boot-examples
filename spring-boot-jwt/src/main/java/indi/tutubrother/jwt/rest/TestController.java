package indi.tutubrother.jwt.rest;

import indi.tutubrother.jwt.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tutubrother
 * @description
 * @date 2020/7/19 22:34
 */
@RestController
@RequestMapping
public class TestController {

    @GetMapping("login")
    public String login(@RequestParam String name) {
        return JwtUtil.createToken(name);
    }

    @GetMapping("get")
    public String get(@RequestParam String token) {
        return "success";
    }
}
