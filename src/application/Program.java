package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: seller findAll");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

//		System.out.println("=== TEST 4: seller insert");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("inserted: New ID = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller update");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println(seller.getName());
		System.out.println("update completed");
		
		
		System.out.println("=== TEST 6: seller delete");
		sellerDao.deleteById(8);
		System.out.println("delete completed");
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== TEST 1: Department insert");
//		Department departments = new Department(5, "Engine Power");
//		departmentDao.insert(departments);
//		System.out.println("inserted: New ID = " + departments.getName());
	
		
				
		System.out.println("=== TEST 2: Department FindByID");
		System.out.println(departmentDao.findById(1));
		System.out.println("FindById completed");
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list1 = departmentDao.findAll();
		for (Department d : list1) {
			System.out.println(d);
		}
		
		System.out.println("=== TEST 6: seller delete");
		departmentDao.deleteById(6);
		System.out.println("delete completed");
		
	}
}
