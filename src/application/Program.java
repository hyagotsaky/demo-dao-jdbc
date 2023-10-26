package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println("--------------FindById");
		System.out.println(seller);
		System.out.println("--------------");
		
	}

}
