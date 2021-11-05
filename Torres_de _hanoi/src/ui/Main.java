package ui;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	private static int [] tower;
	private static int [] disk;

	public static void main (String [] args) {
		scanner= new Scanner(System.in);
		tower = new int[3];

		System.out.println("Enter the number of tries ");
		int m=scanner.nextInt();
		scanner.nextLine();
		disk = new int[m];
		enterDisk(0);
	}

	public static void enterDisk(int i) {
		if(i<disk.length) {
			disk[i]=scanner.nextInt();
			enterDisk(i+1);
		}
	}
	
}
