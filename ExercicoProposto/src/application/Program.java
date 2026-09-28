package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//foi utizado o LinkedHashMap pq TEM VELOCIDADE INTERMEDIARIA e posue ordem de elementos de como eles foi addicionados
		Map<String, Integer> votes = new LinkedHashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();// ler a linha

			while (line != null) {
				String[] fields = line.split(",");// para separar o arquivo
				String name = fields[0]; // guardar o arquivo q vai ser chamado de name do vetor da posição 0
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				} else {
					votes.put(name, count);
				}

				line = br.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}