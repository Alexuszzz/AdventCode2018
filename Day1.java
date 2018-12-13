package aod2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("C:\\Users\\ejanihz\\Desktop\\day1input.txt"));


		int sum = 0;

		while (sc.hasNextInt()) {
			sum+= sc.nextInt();
		}

		System.out.println(sum);
		sc.close();


	}

}
