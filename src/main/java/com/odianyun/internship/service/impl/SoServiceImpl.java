package com.odianyun.internship.service.impl;

import com.odianyun.internship.mapper.SoMapper;
import com.odianyun.internship.model.DTO.SoDTO;
import com.odianyun.internship.model.VO.SoVO;
import com.odianyun.internship.service.SoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: EDZ
 * @time: 10:28
 * @date: 2021/7/16
 */
@Service
public class SoServiceImpl implements SoService {

    @Resource
    private SoMapper soMapper;

    @Override
    public List<SoVO> list(SoDTO dto) {
        return soMapper.list(dto);
    }

    @Override
    public SoVO get(SoDTO dto) {
        return soMapper.get(dto);
    }

    @Override
    public List<SoVO> choose(SoDTO dto) {
        return soMapper.choose(dto);
    }
}
