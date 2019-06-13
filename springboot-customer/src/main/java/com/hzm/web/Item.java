package com.hzm.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hzm.domain.Product;
import com.hzm.service.impl.DubboTestInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Item {

	@Reference
	private DubboTestInterface dubboTestInterface;

	@GetMapping("/dubbo/{name}")
	@ResponseBody
	public String gett(@PathVariable String name) {



		String returnString = dubboTestInterface.returnString(name);
		return returnString;
	}

	@GetMapping("/product")
	@ResponseBody
	public List<Product> product() {
		List<Product> products = dubboTestInterface.getProducts();
		return products;
	}
}
