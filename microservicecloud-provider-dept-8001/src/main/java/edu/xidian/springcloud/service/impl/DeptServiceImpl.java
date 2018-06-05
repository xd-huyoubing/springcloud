package edu.xidian.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.xidian.springcloud.dao.DeptDao;
import edu.xidian.springcloud.entities.Dept;
import edu.xidian.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	
	public boolean add(Dept dept) {
		
		return deptDao.addDept(dept);
	}

	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	public List<Dept> list() {
		return deptDao.findAll();
	}

}
