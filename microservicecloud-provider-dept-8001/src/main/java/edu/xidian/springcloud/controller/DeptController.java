package edu.xidian.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.xidian.springcloud.entities.Dept;
import edu.xidian.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@PostMapping("/dept/add")
	public boolean add(@RequestBody Dept dept)
	{
		return deptService.add(dept);
	}

	@GetMapping(value = "/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> list() {
		return deptService.list();
	}
}
