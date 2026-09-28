package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramContravariancia {
/*Na contravriancia o 
 * 
 */
	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0); nao pode acessar a variavel e guardar ela pq o tipo dessa list pode ser um Super tipo de number  
		
		
		
	}

}
