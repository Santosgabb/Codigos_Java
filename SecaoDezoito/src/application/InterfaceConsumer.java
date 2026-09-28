package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class InterfaceConsumer {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("ABACAXI", 1500.00));
		
		//list.forEach(new PriceUpdate()); 1metodo de como utilizar
		//list.forEach(Product::staticPriceUpdate); 2° Maneira
		//list.forEach(Product::nonstaticProductPredicate);3°
		
		//4°Maneira      da funç~so declarada 
		double factor = 1.1;
		/*Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice()*  factor);
		};
		*/
		list.forEach(p -> p.setPrice(p.getPrice()*  factor));//inline 
		
		
		list.forEach(System.out::println);//saida de um consumer
	}

}
