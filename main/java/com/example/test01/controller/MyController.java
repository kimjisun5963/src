package com.example.test01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test01.dao.IMemberDao;

@Controller
public class MyController {

	@Autowired
	private IMemberDao dao;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Hi!";
	}
	
	@GetMapping("/main")
	public String mainPage() {
		return "main";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", dao.getList());
		
		return "list";
	}
}
