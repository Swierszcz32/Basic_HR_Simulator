package pl.java.company;

import java.util.Scanner;

public class HumanResources {
		
//		int tmp = 2;
		Employer[] employers; 
		
		public HumanResources(int tmp) {
			employers = new Employer[tmp];
		}
		public static Employer createEmployer() {
			System.out.println("Give name");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			System.out.println("Give surname");
			String surname = scanner.nextLine();
			System.out.println("Give age");
			int age=0;
			try {
			age = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException n) { 
				System.out.println("Oczekiwany wiek");
			}
//			scanner.close();
			return new Employer(name,surname,age);
		}
		public void addingEmployer() {
			
			for(int i = 0; i<employers.length; i ++) {
				employers[i] = createEmployer();
			}
//			for(Employer tmp:employers) {
//				tmp = createEmployer();
//			}
		}
		public void printing() {
			for(Employer tmp:employers) {
				System.out.println(tmp.toString());
			}
		}

		
	}

