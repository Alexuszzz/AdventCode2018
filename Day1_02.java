package aod2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day1_02 {

	public static void main(String[] args) throws FileNotFoundException  {

		System.out.println(foundTheDuplicate());

	}

	public static int foundTheDuplicate() throws FileNotFoundException{

		Set<Integer> seenfrequencies = new HashSet<>();
		int frequency = 0;

		while(true){

			Scanner sc = new Scanner(new File("C:\\Users\\ejanihz\\Desktop\\day1input.txt"));

			while(sc.hasNextInt()) {
				frequency += sc.nextInt();

				if(seenfrequencies.contains(frequency)) {
					sc.close();
					return frequency;	

				}
				seenfrequencies.add(frequency);

			}

			sc.close();
		}


	}
}




	    	

