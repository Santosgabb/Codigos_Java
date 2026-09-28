package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();//recebe o arquivo
//vai ler o arquivo recebido e 
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();//vetor p armazenar os dados obtidos pelo arquivo

			String line = br.readLine();//pra ler a proxima linha
			while (line != null) {
				String[] fields = line.split(",");//separar o arquivo onde tem a virgula
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));//o que foi obtido do arquivo vai ser armazenado nos vetor com suas posiçao o da posicao 1 possui uma conversao de string para double
				line = br.readLine();//vai ler a proxima linha ate o ultimo do arquivo
			}
			//soma dos preco do produto
			double avg = list.stream()//gerou uma nova lista so com os preco do produtos
					.map(p -> p.getPrice())//vai pegar so o preco pq é para saber a media 
					.reduce(0.0, (x, y) -> x + y) / list.size();// Pegou a soma de todos e vai dividir pelo tamanho da lista

			System.out.println("Average price: " + String.format("%.2f", avg));//vai sair o preço medio de todos os produtos

			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());//comparador de String independentes de letras Maiuscula ou minuscula

			List<String> names = list.stream()//criou uma nova lista 
					.filter(p -> p.getPrice() < avg)//vai pegar o nomes dos produto que estao abaixo da media Total
					.map(p -> p.getName())//VAi pegar o nome de todos os produtos que foram filtrados
					.sorted(comp.reversed()).collect(Collectors.toList());//ordem decrescente de maneira reversa 

			names.forEach(System.out::println);//saida do resultado

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
