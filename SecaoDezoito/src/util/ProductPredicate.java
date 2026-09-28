package util;

import java.util.function.Predicate;

import entities.Product;

/*Foi criado para que o predicate viesse para car ao inves de colocar ele no programa completo
 * ai vai ser Implementado da cçlasse Product
 */

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return  p.getPrice() >= 100;
	}

}
