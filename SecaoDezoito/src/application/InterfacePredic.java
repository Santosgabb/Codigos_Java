package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class InterfacePredic {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("ABACAXI", 1500.00));
		
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;//declaração
		Predicate<Product> predi = p -> p.getPrice() >= min; //de outra forma
		
		
		/*removendo pelo predicate
		 *  list.removeIf(p -> p.getPrice() >= 100);
		 * poderia ser desse modo , mas vamos criar uma classe 
			AI FOI ATUALIZADO O DA LINHA 27
		 */
		// 1° 
		//list.removeIf(new ProductPredicate());//ai nao foi precisso utilizar esse modo de cima 
		//2
		//list.removeIf(Product:: staticProductPredicate);//2° Modelo de como utilizar
		//3°
	//	list.removeIf(Product ::nonstaticProductPredicate);
		
		//4° expressao lambda declarada
	//	list.removeIf(pred);
		// list.removeIf(p -> p.getPrice() >= 100); 5°versao
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
		
		
		
	}