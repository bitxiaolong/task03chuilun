package com.service.impl;

import com.dao.FirstAndSecondDao;
import com.pojo.FirstAndSecond;
import com.service.FirstAndSecondMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FirstAndSecondMapperServiceImpl implements FirstAndSecondMapperService {
    @Autowired
    private FirstAndSecondDao firstAndSecondMapper;
    @Override
    public List<FirstAndSecond> showAll() {
        return firstAndSecondMapper.showAll();
    }

    @Override
    public List<FirstAndSecond> searchsecond(String name) {
        return firstAndSecondMapper.searchsecond(name);
    }
}
