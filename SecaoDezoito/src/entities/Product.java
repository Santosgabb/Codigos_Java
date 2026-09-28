package entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	/*
	//2° maneira de como fazer o consumer
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	//3° Maneira do consumer
	public void nonstaticPriceUpdate() {
		setPrice (getPrice() * 1.1);//vai mexer com o Price do proprio objeto
	// ou price= price *1.1;
	}
	
	
	//2° Modelo de como fazer  predicate
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100; 
	}
	//3° sem ser static predicate
	public  boolean nonstaticProductPredicate (){
		return price >= 100; //está acessando o atributo dessa class
	}
	*/
	
	
//String.format("%.2f",
	@Override
	public String toString() {
		return  name + String.format(" %.2f ", price);
	}

}
