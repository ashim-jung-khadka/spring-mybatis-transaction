package com.ashim.springmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.springmybatis.bean.Person;
import com.ashim.springmybatis.mapper.PersonMapper;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PersonService {

	@Autowired
	private PersonMapper personMapper;

	public void insert() throws Exception {
		Person person = new Person("ashim", "dhapasi");
		personMapper.insert(person);

		personMapper.insert(new Person()); // this will throw an exception
	}
}
