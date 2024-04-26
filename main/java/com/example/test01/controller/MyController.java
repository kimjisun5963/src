package com.example.test01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test01.dao.IMemberDao;
import com.example.test01.domain.MemberDto;

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
	
	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	//@PostMapping("/write")
	public String write(HttpServletRequest request, String id, String pw, String name) {
		String ids = request.getParameter("id");
		String pws = request.getParameter("pw");
		String names = request.getParameter("name");

		
		//파라미터 받아서 DB에 등록하기
		dao.write3(ids,pws,names);
		
		
		return "redirect:list";
	}
	
	
	//@PostMapping("/write")
		public String write(@RequestParam("id")String id,@RequestParam("pw") String pw, @RequestParam("name") String name) {
			//String ids = request.getParameter("id");
			//String pws = request.getParameter("pw");
			//String names = request.getParameter("name");

			
			//파라미터 받아서 DB에 등록하기
			dao.write3(id,pw,name);
			
			
			return "redirect:list";
		}
	
	//@PostMapping("/write")
	public String write(MemberDto dto) {
		
		//파라미터 받아서 DB에 등록하기
		dao.write3(dto.getId(), dto.getPw(), dto.getName());
		
		
		return "redirect:list";
	}
	
	@PostMapping("/write")
	public String write4(MemberDto dto) {
		
		//파라미터 받아서 DB에 등록하기
		dao.write4(dto);
		
		
		return "redirect:list";
	}
	
	@GetMapping("/command")
	public String command(MemberDto memberDto) {
		System.out.println(memberDto.getId());
	
		return "command";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("id") String id, Model model) {
		
		model.addAttribute("dto", dao.getDto(id));
		
		return "detail";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") String id, Model model) {
		
		dao.delete(id);
		
		return "redirect:list";
	}
	
	
}
