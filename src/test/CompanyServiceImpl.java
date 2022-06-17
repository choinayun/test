package test;

import java.util.ArrayList;

public class CompanyServiceImpl implements CompanyService {
	
	CompanyDTO dto = new CompanyDTO();
	
	private ArrayList<CompanyDTO> arr;

	public CompanyServiceImpl() {
		arr = new ArrayList<CompanyDTO>(); 
	}

	@Override
	public void saveWorker(CompanyDTO dto) {
	//특정 사원 등록 메소드
	
		if(dto.getGrade().equals("인턴")) {
			dto.setSalary(300); 
			dto.setTariff(0.01);
	
		}else if (dto.getGrade().equals("선임")) {
			dto.setSalary(400); 
			dto.setTariff(0.02);
		
		}else if (dto.getGrade().equals("책임")) {
			dto.setSalary(600);
			dto.setTariff(0.03);
		}	
		
		arr.add(dto);
		
		System.out.println("사원 정보가 저장 되었습니다.");	
	}

	@Override
	public void modify(CompanyDTO dto) {
	//특정 사원의 직급,기본급,수당 수정 메소드	
	}

	@Override
	public CompanyDTO search(String name) {
	//특정 사원 검색. 이름 값 으로 해당 값을 가진 직원 찾기은 결과 값을 main에서 출력한다.	
		
		for(int i = 0; i < arr.size(); i++) {
			dto = arr.get(i);
			if(dto.getName().equals(name)) {
				System.out.println("이름 : " + dto.getName());
				System.out.println("직급 : " + dto.getGrade());
				System.out.println("월급 : " + dto.getSalary());
				System.out.println("세율 : " + dto.getTariff());
			}
		}
		return null;
	}

	@Override
	public void output() {
	//모든 사원 출력	
		
		if(arr.size() == 0) {
			System.out.println("저장된 정보가 없습니다.");
			
		}else {
			
			for(int i = 0; i < arr.size(); i++) {
				dto = arr.get(i);
				System.out.println("이름 : " + dto.getName());
				System.out.println("직급 : " + dto.getGrade());
				System.out.println("월급 : " + dto.getSalary());
				System.out.println("세율 : " + dto.getTariff());
				System.out.println("----------------");
			}
		}
	}
	
}
