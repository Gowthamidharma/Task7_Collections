package task7;


import java.util.Map.Entry;
import java.util.TreeMap;


public class Task7Employeetreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeMap of employee id and name
		TreeMap<String,Integer> employee = new TreeMap<>();
		
		//add employee detail to tree map
		employee.put("Mithun",105);
		employee.put("Biju",102);
		employee.put("Ajay",103);
		employee.put("Sian",101);
		employee.put("Yuvraj",104);
		employee.put("Neelam",106);		
		
		
		// print in alphabetic order
		System.out.println("Employee names in alphabetical order : ");
		for(Entry<String, Integer> entry : employee.entrySet()) {
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
		}		
			
	}
}




