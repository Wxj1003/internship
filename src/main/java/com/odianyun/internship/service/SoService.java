package com.odianyun.internship.service;

import com.odianyun.internship.model.DTO.SoDTO;
import com.odianyun.internship.model.VO.SoVO;

import java.util.List;

public interface SoService {
    List<SoVO> list(SoDTO dto);

    SoVO get(SoDTO dto);

    List<SoVO> choose(SoDTO dto);
}
