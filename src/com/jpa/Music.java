package com.jpa;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
@Entity
@Table(name="ADMINMUSIC")
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="musicname")
	private String musicname;
	@Column(name="music")
	@Lob
    private byte[] music;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMusicname() {
		return musicname;
	}
	public void setMusicname(String musicname) {
		this.musicname = musicname;
	}
	public byte[] getMusic() {
		return music;
	}
	public void setMusic(byte[] music) {
		this.music = music;
	}
	@Override
	public String toString() {
		return "Music [id=" + id + ", musicname=" + musicname + ", music=" + Arrays.toString(music) + "]";
	}
	public Music(int id, String musicname, byte[] music) {
		super();
		this.id = id;
		this.musicname = musicname;
		this.music = music;
	}
	public Music() {
	}
    
    
    
    
}
