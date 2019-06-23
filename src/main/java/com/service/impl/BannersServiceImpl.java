package com.service.impl;

import com.dao.BannersMapper;
import com.pojo.Banners;
import com.service.BannersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannersServiceImpl implements BannersService {

    @Autowired
    private BannersMapper bannersMapper;

    @Override
    public List<Banners> getall() {
        return bannersMapper.getall();
    }
}
