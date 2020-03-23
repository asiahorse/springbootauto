package com.atguigu.springboot.springbootauto.controller;

import com.atguigu.springboot.springbootauto.bean.TAdmin;
import com.atguigu.springboot.springbootauto.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping("/admin/{id}")
	public String getAdminById(@PathVariable("id") Integer id, Model model) {
		TAdmin admin = adminService.getAdminById(id);

		Map<String, String> maps = new HashMap<>();
		maps.put("1", "o");
		maps.put("2", "g");
		maps.put("3", "a");
		maps.put("4", "j");
		model.addAttribute("maps", maps);
		model.addAttribute("admin", admin);
		
		List<TAdmin> list = adminService.getAdminList();
		model.addAttribute("admins", list);
		return "admin";
	}

	@RequestMapping("/list")
	public String getAdminList(Model model) {
		List<TAdmin> list = adminService.getAdminList();
		Map<String, String> maps = new HashMap<>();
		maps.put("1", "o");
		maps.put("2", "g");
		maps.put("3", "a");
		maps.put("4", "j");
		model.addAttribute("maps", maps);
		
		model.addAttribute("admins", list);
		return "list";
	}
}
