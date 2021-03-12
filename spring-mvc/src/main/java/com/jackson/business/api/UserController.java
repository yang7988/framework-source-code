package com.jackson.business.api;

import com.jackson.business.base.ApiResponse;
import com.jackson.business.dto.RegisterDTO;
import com.jackson.business.entity.User;
import com.jackson.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    @ResponseBody
    public ApiResponse register(@RequestBody RegisterDTO dto) {
        Object result = userService.register(dto);
        return ApiResponse.response(result);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update")
    @ResponseBody
    public ApiResponse update(@RequestBody User dto) {
        userService.update(dto);
        return ApiResponse.response();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/modify")
    @ResponseBody
    public ApiResponse modify(@RequestBody User dto) {
        userService.updateEmail(dto);
        return ApiResponse.response();
    }
}
