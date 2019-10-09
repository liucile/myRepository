package com.hph.springcloud.service;

import com.hph.springcloud.dao.DeptDao;
import com.hph.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
  @Autowired
  private DeptDao dao ;
  
  @Override
  public boolean add(Dept dept)
  {
   return dao.addDept(dept);
  }
 
  @Override
  public Dept get(Long id)
  {
   return dao.findById(id);
  }
 
  @Override
  public List<Dept> list()
  {
	  List<Dept> ls = new ArrayList<Dept>();
	  ls = dao.findAll();
	  if(ls.size()>0) {
		 for(int i = 0 ; i<ls.size(); i++) {
			 ls.get(i).setDb_source("8002");
		 }
	  }
   return ls;
 
  }
}
