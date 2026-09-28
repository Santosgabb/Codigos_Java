package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.ProductFuncction;
import util.UpperCaseName;

public class InterfaceFuncction {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<ProductFuncction> list = new ArrayList<>();

		list.add(new ProductFuncction("TV", 900.00));
		list.add(new ProductFuncction("Notebook", 1200.00));
		list.add(new ProductFuncction("Mouse", 50.00));
		list.add(new ProductFuncction("HD Case", 80.00));
		list.add(new ProductFuncction("Tablet", 450.00));
		list.add(new ProductFuncction ("Abacaxi", 1500.00));
		
/*1°VERSÂO
		List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
2° VERSÂO
		List <String> names = list.stream().map(ProductFuncction::staticUpperCaseName).collect(Collectors.toList());
3° VERSÂO		
		List <String> names = list.stream().map(ProductFuncction::nonstaticUpperCaseName).collect(Collectors.toList());
4°EXPRESSÃO LAMBDA DECLARADA	
		Function<ProductFuncction, String> func = p -> p.getName().toUpperCase();
		List <String> names = list.stream().map(func ).collect(Collectors.toList());
5°VERSÂO JA DECLARADA 		
		List <String> names = list.stream().map( p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		*/
		
		

	}

}
