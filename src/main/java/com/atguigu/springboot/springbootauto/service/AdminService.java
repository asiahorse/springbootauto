package com.atguigu.springboot.springbootauto.service;

import com.atguigu.springboot.springbootauto.bean.TAdmin;

import java.util.List;

/**
 * @author Asia
 * @create 2020-03-23 下午 4:10
 */
public interface AdminService {

    TAdmin getAdminById(Integer id);

    List<TAdmin> getAdminList();
}
