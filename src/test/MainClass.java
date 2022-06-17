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
			
			System.out.println("1. 사원 등록");
			System.out.println("2. 모든 사원 출력");
			System.out.println("3. 사원 정보 수정");
			System.out.println("4. 사원 정보 검색");
			System.out.println("5. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			
			case 1 : 
				
				CompanyDTO dto = new CompanyDTO();
				System.out.println("직원 이름");
				name = input.next();
				System.out.println("직급 입력");
				grade = input.next(); 
				
				dto.setName(name);
				dto.setGrade(grade);
				
				impl.saveWorker(dto);		
				
				break;
				
			case 2 :  
				
				impl.output();
				
				break;
				
			case 3 :  // 정보 수정 (문제 없음) 
				break;
				
			case 4 : // 정보 검색 
				
				System.out.println("직원 이름");
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
