package com.odianyun.internship.mapper;

import com.odianyun.internship.model.DTO.SoDTO;
import com.odianyun.internship.model.VO.SoVO;

import java.util.List;

/**
 * @description:
 * @author: EDZ
 * @time: 10:29
 * @date: 2021/7/16
 */
public interface SoMapper {
    List<SoVO> list(SoDTO dto);

    SoVO get(SoDTO dto);

    List<SoVO> choose(SoDTO dto);
}
