package application;

import java.util.ArrayList;
import java.util.List;
/*esse codigo é um exemplo de cvarancia pq so da erro na saida que é a Linha 17
 * 
 */
public class ProgramCovariancia {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		 
		List<? extends Number > list = intList;
		Number x = list.get(0);
	//	list.add(20);
		
		
		
	}

}
