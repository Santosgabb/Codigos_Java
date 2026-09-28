package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o caminho do arquivo");
		String path = sc.nextLine();
		
		//para saber onde estar o arquivo 
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			//para contar os usuarios unicos 
			Set<LogEntry> set = new HashSet<LogEntry>();
			
			String line = br.readLine();
			while(line != null) {
				//recortar o arquivo informado e guardar
				String [] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				//vai inserir os dados no LogEntry
				set.add(new LogEntry(username, moment));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());//saida da qtd de usuario de acordo com o que foi feito nos codigos
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
