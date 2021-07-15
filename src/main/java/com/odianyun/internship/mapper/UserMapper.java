package com.odianyun.internship.mapper;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.UUser;

public interface UserMapper {
    UUser getById(Long id);

    void update(UUserDTO dto);
}
