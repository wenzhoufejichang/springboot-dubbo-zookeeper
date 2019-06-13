package com.hzm.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hzm.dao.DubboTestDao;
import com.hzm.domain.Product;
import com.hzm.service.impl.DubboTestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DubboTestService implements DubboTestInterface {

	@Autowired
	private DubboTestDao dtd;

	@Override
	public String returnString(String name) {
		// TODO Auto-generated method stub
		return "接受" + name;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return dtd.get();
	}

}
