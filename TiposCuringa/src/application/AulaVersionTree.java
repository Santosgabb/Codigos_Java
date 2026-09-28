package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class AulaVersionTree {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();//trocou o hashset para treeset
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		
		/*foi criado o equal e hashcode na classe product para encontrar ou comparar se existe com o conteudo  
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
		*/
		//foi criado o for 
		for (Product p : set) {
			System.out.println(p);
		}
		
	}

}
