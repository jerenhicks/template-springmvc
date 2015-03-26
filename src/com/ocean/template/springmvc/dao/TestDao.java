package com.ocean.template.springmvc.dao;

import java.util.List;
import java.util.UUID;

import com.ocean.template.springmvc.model.Test;

public class TestDao extends HibernateDaoUtil implements Dao<Test> {
	
	@Override
	public Test create(Test model) {
		model.assignID();
		openCurrentSessionwithTransaction();
		getCurrentSession().save(model);
		closeCurrentSessionwithTransaction();
		return read(model.getId());
	}

	@Override
	public Test read(UUID id) {
		openCurrentSessionwithTransaction();
		Test value = (Test) getCurrentSession().get(Test.class, id);
		closeCurrentSessionwithTransaction();
		return value; 
	}
	
	@Override
	public List<Test> readAll() {
		openCurrentSessionwithTransaction();
		List<Test> books = (List<Test>) getCurrentSession().createQuery("from Test").list();
		closeCurrentSessionwithTransaction();
		return books;
	}

	@Override
	public Test update(Test model) {
		openCurrentSessionwithTransaction();
		getCurrentSession().update(model);
		closeCurrentSessionwithTransaction();
		return read(model.getId());
	}

	@Override
	public void delete(Test model) {
		openCurrentSessionwithTransaction();
		getCurrentSession().delete(model);
		closeCurrentSessionwithTransaction();
	}
}
