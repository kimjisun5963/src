package com.example.test01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test01.domain.MemberDto;

@Mapper
public interface IMemberDao {

	public List<MemberDto> getList();
	
}
