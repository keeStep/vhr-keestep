package org.kee.vhr01.controller;

import org.kee.vhr01.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author： 羽子少年
 * @Date： 2020/6/14 21:19
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public Response login() {
        return Response.ok("请登录8");
    }
}
