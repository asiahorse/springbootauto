package com.atguigu.springboot.springbootauto.mapper;

import com.atguigu.springboot.springbootauto.bean.TAdmin;

import java.util.List;

/**
 * @author Asia
 * @create 2020-03-23 下午 8:44
 */
public interface AdminMapper {
    TAdmin getAdminById(Integer id);

    List<TAdmin> getAdminList();
}
