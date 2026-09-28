package entities;
//consumer
import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
//consumer
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}