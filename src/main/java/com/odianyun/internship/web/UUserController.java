package com.odianyun.internship.web;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.UUser;
import com.odianyun.internship.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description:
 * @author: EDZ
 * @time: 14:35
 * @date: 2021/7/15
 */
@RestController
@RequestMapping("uuser")
public class UUserController {

    @Resource
    private UserService userService;

    @GetMapping("getById")
    public UUser getById(Long id) {
        return userService.getById(id);
    }

    @PostMapping("update")
    public UUser update(@RequestBody UUserDTO dto){
        userService.update(dto);
        return userService.getById(dto.getId());
    }
}
