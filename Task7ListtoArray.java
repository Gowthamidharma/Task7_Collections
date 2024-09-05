package task7;

import java.util.ArrayList;
import java.util.List;


public class Task7ListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an list of arrays
		List<Integer[]> arryList = new ArrayList<Integer[]>();
		arryList.add(new Integer[] {1,2,3});
		arryList.add(new Integer[] {4,5,6});
		arryList.add(new Integer[] {7,8,9});
		arryList.add(new Integer[] {10,11,12});
		
		//convert list of array to list of list
		List<List<Integer>> listoflist = new ArrayList<List<Integer>>();
		for(Integer[] array:arryList) {
			 List<Integer> tempList = new ArrayList<Integer>();
	            for (int i : array) {
	                tempList.add(i);
	            }
	            listoflist.add(tempList);
	        }

	        // Print the List of Lists
		
		for (List<Integer> list : listoflist) {
            System.out.println(list);
        }


		}
		
		

	}


