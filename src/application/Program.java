package application;

import java.util.Scanner;
import services.PrintService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<Integer>();
		PrintService<String> pss = new PrintService<String>();
		
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		System.out.println("---------------------");
		
		System.out.println("How many names? ");
		int names = sc.nextInt();
		
		for (int i=0; i < names; i++) {
			String value = sc.next();
			pss.addValue(value);
		}
		
		pss.print();
		System.out.println("First: " + pss.first());
		
		sc.close();
	}

}
