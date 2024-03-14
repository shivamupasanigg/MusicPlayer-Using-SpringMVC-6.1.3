package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Music;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class musicservice {
	
	@Autowired
	private musicdao dao;
	// insert
	public void insert(Music m)
	{
		dao.save(m);
	}
	// select
	public List<Music> getalldata()
	{
		return dao.findAll();
	}
	// get the id
	public Music getbyid(int id)
	{
		return dao.findById(id).get();
	}
	// delete
	public void delete(int id)
	{
		dao.deleteById(id);
	}
	
	public void updatemusic(int id , String musicname,byte[] music)
	{
		dao.updateMusic(id, musicname, music);
	}
	
}
