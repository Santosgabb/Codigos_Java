package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Permite a entrada de dados
		
		//criação dos HashSet abc para armazenar os numeros 
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		//Criação dos for para armazenar os numeros 
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		//Quantos alunos faz parte do curso B
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}
		//Quantos alunos faz parte do curso C
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		//base A 
		Set<Integer> total = new HashSet<>(a); //foi criado o total atraves da base 
		total.addAll(b);//o addAll permite que os elementos se unem sem uma possivel repetição 
		total.addAll(c);

		System.out.println("Total students: " + total.size());//o size permite o tamanho do conjuto de acordo com ototal

		sc.close();
	}
	}


