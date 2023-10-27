package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Department;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println("--------------FindById");
		System.out.println(seller);
		
		
		System.out.println("--------------FindByDepartment");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println("--------------");
		
		
		System.out.println("--------------FindAll");
		List<Seller> listFind = new ArrayList<>();
		listFind = sellerDao.findAll();
		listFind.forEach(System.out::println);
		
		
		System.out.println("--------------FindAll");
		Seller newSeller = new Seller(null, "Maria", "maria@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("inserido com o id:" + newSeller.getId());

	}

}
