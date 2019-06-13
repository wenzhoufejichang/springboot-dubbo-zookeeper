package com.hzm.dao;

import com.hzm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface DubboTestDao {
	@Select("select * from product ")
	public abstract List<Product> get();
}
