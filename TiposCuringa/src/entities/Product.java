package entities;

import java.util.Objects;
//foi add o comparable
public class Product implements Comparable<Product> {
	private String name;
	private Double price;

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
//criação do hashCode e Equals para encontrar eles no programa pricipal
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	//foi criado o toString

	@Override
	public String toString() {
		return "Product [name= " + name + ", price= " + price + "]";
	}

	//atraves da implements foi criado esse metodo que vwi comparar o elemento com outro
	@Override
	public int compareTo(Product other) {	
		return name.toUpperCase().compareTo(other.getName().toUpperCase());//esta comparando o nome do produto com outro produto
	}
	
	
	
}
