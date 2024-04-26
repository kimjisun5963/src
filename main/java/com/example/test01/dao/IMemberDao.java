package com.example.test01.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.test01.domain.MemberDto;

@Mapper
public interface IMemberDao {

	public List<MemberDto> getList();
	public MemberDto getDto(@Param("id") String id);
	public void write(String id, String pw, String name);	
	public void write2(String id, String pw, String name);	
	public void write3(@Param("id") String id, @Param("pw") String pw, @Param("name") String name);	
	public void write4(@Param("dto") MemberDto dto);	
	public void delete(@Param("id") String id);
}
