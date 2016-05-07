package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import models.products;
import dao.productDAOImpl;

@Transactional
@Service 
public class ProductService {

	@Autowired
    productDAOImpl dao;
	
	
	@Transactional
    public List<products> viewProduct(){
    	return dao.viewProduct();
    }
}
