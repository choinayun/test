package test;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int num, salary;
		String name, grade;
		double tariff;
	
		CompanyServiceImpl impl = new CompanyServiceImpl();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. ��� ���");
			System.out.println("2. ��� ��� ���");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ��� ���� �˻�");
			System.out.println("5. ����");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			
			case 1 : 
				
				CompanyDTO dto = new CompanyDTO();
				System.out.println("���� �̸�");
				name = input.next();
				System.out.println("���� �Է�");
				grade = input.next(); 
				
				dto.setName(name);
				dto.setGrade(grade);
				
				impl.saveWorker(dto);		
				
				break;
				
			case 2 :  
				
				impl.output();
				
				break;
				
			case 3 :  // ���� ���� (���� ����) 
				break;
				
			case 4 : // ���� �˻� 
				
				System.out.println("���� �̸�");
				name = input.next();
			
				impl.search(name);
				
				break;
				
			case 5 : 
				System.exit(0);
				break;

			
			}
		}
		
		
	}
}
