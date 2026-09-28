package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			List<Product> list = new ArrayList<>();

			list.add(new Product("TV", 900.00));
			list.add(new Product("Notebook", 50.00));
			list.add(new Product("Tablet", 350.50));
			list.add(new Product("ABACAXI", 80.90));
			
			/*
			list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
			for (Product p : list) {
				System.out.println(p);
			}
			*/
			ProductService ps = new ProductService();
			
			double sum = ps.filteredSum(list, p ->p.getName().charAt(0) == 'T');
			
			System.out.println("Sum = " + String.format("%.2f", sum));
			
			
		}
	
	}