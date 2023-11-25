package com.human.unicorn.Productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.human.unicorn.Productdao.ProductDAO;
import com.human.unicorn.Productdto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

//	EmpDAO empDAO = new EmpDAOImpl();
	@Autowired
	ProductDAO productDAO;

	@Override
	public List productList() {
		List productList = productDAO.productList();

		return productList;
	}
	
	@Override
    public List<ProductDTO> getTop10List() {
        // ProductService���� �ʿ��� ���� �߰� (��: popularity�� ���� ���� 10���� ��ǰ ��� ��������)
        return productDAO.selectTop10List();
    }
	
	@Override
	public void increasePopularity(int productNo) {
	    productDAO.increasePopularity(productNo);
	}
	
	

}
