package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map <String, String> cookies = new TreeMap<>();	
		
		//inserir elemento
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "994016141");
		
		
		
		//removeendo o que foi inserindo
		cookies.remove("email");
		cookies.put("phone", "94016133");//a saida vai ser essa pq foi atualizada  nao sai as duas 
		
		System.out.println("Contains 'phone' key : "+ cookies.containsKey("phone"));//para verificar se a 
		System.out.println("Phone number: " + cookies.get("phone"));//pegar o valor de phone e imprimiu
		System.out.println("Email: " + cookies.get("email")); //vai retorna o nulo
		
		//size
		System.out.println("Size: " + cookies.size());// vai ser só 2 pq removemos o email
		
		//saida de dados 
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
