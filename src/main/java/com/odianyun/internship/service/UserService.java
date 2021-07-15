package com.odianyun.internship.service;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.UUser;

import java.util.List;

public interface UserService {
    UUser getById(Long id);

    void update(UUserDTO dto);
}
