package application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Aula 184
public class AulaOneEightFour {
/* HashSet  - é extramente rapido mais nao mantem  a ordem||	//implementacao mais rapida 
 * TreeSet -  ordena os dados em ordem alfabetica
 * LinkedHashSet - Manteve a ordem que os elementos foram inseridos no programa aqui foi a tv
 */
	
	public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<>(); 	//foi alterando cada uma 	
	//add os elementos no set que foi criado de acordo com o seu tipo
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		// Vai tesstar para ver se existe o elemnto notebook atraves do set.contains("Notebook") 
		//System.out.println(set.contains("Notebook"));
		
		//Vamos testar os remove 
		set.remove("Tablet");
		set.removeIf(x -> x.charAt(0) == 'T');//remove de acordo com uma condição
		
		
		//vai imprimir os elementos do conjunto
		for (String p : set) {
			System.out.println(p);
		}	
	}

}
