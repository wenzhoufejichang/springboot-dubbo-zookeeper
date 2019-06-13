package  com.hzm.service.impl;


import com.hzm.domain.Product;

import java.util.List;

public interface DubboTestInterface {

	public abstract String returnString(String name);

	public abstract List<Product> getProducts();

}
