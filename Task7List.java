package task7;
import java.util.ArrayList;

public class Task7List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arlist = new ArrayList<String>();
		
		//add list to array
		
		arlist.add("Orange");
		arlist.add("Apple");
		arlist.add("Pineapple");
		arlist.add("Guava");
		arlist.add("Kiwi");
		arlist.add("apple");
		
		System.out.println("Array list before removing elements " + arlist);
		
		// remove elements from array
		
		arlist.clear();
		

		System.out.println("Array list after removing elements " + arlist);
		
	}

	}


