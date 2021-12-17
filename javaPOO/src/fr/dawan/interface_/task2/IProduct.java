package fr.dawan.interface_.task2;

import java.util.List;

public interface IProduct {
	
	//Liste l'ensemble des fonctionnalités du client
	void addPorduct(Product p);
	void deleteProduct(Product p);
	void updateProduct(Product p);
	List<Product> getAll();
	
}
