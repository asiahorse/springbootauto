package com.atguigu.springboot.springbootauto.service.impl;

import com.atguigu.springboot.springbootauto.bean.TAdmin;
import com.atguigu.springboot.springbootauto.mapper.AdminMapper;
import com.atguigu.springboot.springbootauto.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Asia
 * @create 2020-03-23 下午 4:13
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public TAdmin getAdminById(Integer id) {
        return adminMapper.getAdminById(id);
    }

    @Override
    public List<TAdmin> getAdminList() {
        return adminMapper.getAdminList();
    }
}
