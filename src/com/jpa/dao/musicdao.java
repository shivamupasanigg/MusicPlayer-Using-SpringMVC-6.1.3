package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.Music;
@Repository
public interface musicdao extends JpaRepository<Music,Integer> {
	@Modifying
	@Query("UPDATE Music m SET m.musicname = :name, m.music = :audio WHERE m.id = :id")
	void updateMusic(@Param("id") int id,
	                @Param("name") String name,
	                @Param("audio") byte[] audio);
}
