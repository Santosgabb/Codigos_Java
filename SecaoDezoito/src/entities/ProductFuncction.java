package entities;

public class ProductFuncction {
	private String name;
	private Double price;

	public ProductFuncction() {
	}

	public ProductFuncction(String name, Double price) {
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
	//versao 2
	public static String staticUpperCaseName(ProductFuncction p) {
		return p.getName().toUpperCase();	
	}
	//3VERSÂOS
	public String nonstaticUpperCaseName() {
		return name.toUpperCase();
		
	}
	
	
	@Override
	public String toString() {
		return  name + String.format(" %.2f ", price);
	}

}
