package com.jpa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.musicservice;
import com.jpa.Music;

@Controller
public class IndexController {
	
	@Autowired
	private musicservice service;

	@GetMapping("/index")
	public String index(Model m)
	{
		return "index";
	}
	
	// call the form
	@GetMapping("/adminpanel")
	public String adminpanel(Model m)
	{
		m.addAttribute("music", new Music());
		return "AdminForn";
	}
	// insert data
	@PostMapping("/insert")
	public String insert(@RequestParam("musicname") String musicname ,@RequestParam("musicaudio") MultipartFile file) throws IOException
	{
		Music m = new Music();
		m.setMusicname(musicname);
		m.setMusic(file.getBytes());
		service.insert(m);
		return "redirect:/adminpanel";
	}
	
	// get all data
	@GetMapping("/selectall")
	public String selectalldata(Model m1)
	{
		List<Music> listalldata = service.getalldata();
		
		List<String> Audios = new ArrayList<>();
		String Image;
		for (Music list : listalldata) {
	        if (list.getMusic() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getMusic());
	            Audios.add(Image);
	        }
	    }
		m1.addAttribute("listalldata",listalldata);
		m1.addAttribute("Audios",Audios);
		return "listaudios";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(name="id") int id)
	{
		service.delete(id);
		return "redirect:/selectall";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam(name="id") int id,Model m)
	{
		Music getbyid=service.getbyid(id);
		m.addAttribute("getbyid", getbyid);
		return "Edit";
	}
	
	@PostMapping("update")
	public String update(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("audio") MultipartFile audio)throws IOException
	{
		service.updatemusic(id, name, audio.getBytes());
		return "redirect:/selectall";
	}
	
}
