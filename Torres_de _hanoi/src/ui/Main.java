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
		start(0);
	}

	public static void enterDisk(int i) {
		if(i<disk.length) {
			disk[i]=scanner.nextInt();
			enterDisk(i+1);
		}
	}

	public static void start(int i) {
		if(i<disk.length) {
			tower[0]=disk[i];
			tower[1]=0;
			tower[2]=0;
			showTowers();
			process(disk[i],0,1,2);
			System.out.println("");
			start(i+1);
		}

	}

	public static void process( int disks,int origin,int aux, int finish ) {

		
			if(disks==1) {
				tower[origin]--;
				tower[finish]++;
				showTowers();
			}
			else {
				process(disks-1, origin , finish ,aux);
				tower[origin]--;
				tower[finish]++;
				showTowers();
				process(disks-1, aux, origin ,finish);
			}	
		
	}

	public static void showTowers() {
		System.out.println(tower[0]+" "+tower[1]+" "+tower[2]);
	}
}
