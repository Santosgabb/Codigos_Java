package application;

import entities.Clientes;

public class ProgramEquals {
	/*
	 * DA classe cliente Sobre HAshCode e Equals
	 */
	public static void main(String[] args) {
		Clientes c1 = new Clientes("Gabriel", "Gabriel@gmail.com");
		Clientes c2 = new Clientes("Gabriel", "Gabriel@gmail.com");
		
		String s4 = "Test";
		String s3 = "Test";
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));//compara o conteudo
		System.out.println(c1 == c2);//vai está procurando na memoria se estaó no mesmo lugar
		//vai da false pq nao está no mesmo lugar na memoria se o conteudo for igual
		
		System.out.println(s1 == s2);//ia da verdadeiro o do comentario
		System.out.println(s3 == s4);
	}

}
