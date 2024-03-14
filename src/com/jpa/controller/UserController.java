package com.jpa.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.Music;
import com.jpa.dao.musicservice;
@Controller
public class UserController {
	
	@Autowired
	private musicservice user;
	
	@GetMapping("User")
	public String User(Model m)
	{
		List<Music> AdminData = user.getalldata();
		m.addAttribute("AdminData",AdminData);
		return "UserShow";
		
	}
	
	@GetMapping("UserMusic")
	public String User(@RequestParam("id") int id,Model m)
	{
		Music AdminDataId = user.getbyid(id);
		m.addAttribute("Music",Base64.getEncoder().encodeToString(AdminDataId.getMusic()));
		return "UserMusic";
		
	}

}
