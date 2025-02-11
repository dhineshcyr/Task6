package task7;

import java.util.ArrayList;

public class Question7 {
	
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        // Converting to array
	        String[] array = list.toArray(new String[0]);

	        System.out.println("Array elements:");
	        for (String color : array) {
	            System.out.println(color);
	        }
	    }
	}

//Output
//Array elements:
//Red
//Green
//Blue