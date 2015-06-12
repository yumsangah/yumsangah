package com.java.address.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.address.dto.AddressDto;

@Component
public class AddressDaoImpl implements AddressDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int write(AddressDto addressDto) {
		return sqlSession.insert("dao.AddressMapper.write", addressDto);
	}

	@Override
	public AddressDto select(String name) {
		return sqlSession.selectOne("dao.AddressMapper.select", name);
	}

	@Override
	public int updateOk(AddressDto addressDto) {
		return sqlSession.update("dao.AddressMapper.update", addressDto);
	}

	@Override
	public int deleteOk(String name) {
		return sqlSession.delete("dao.AddressMapper.delete", name);
	}
	
}
