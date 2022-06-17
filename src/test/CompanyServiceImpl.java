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
	//Ư�� ��� ��� �޼ҵ�
	
		if(dto.getGrade().equals("����")) {
			dto.setSalary(300); 
			dto.setTariff(0.01);
	
		}else if (dto.getGrade().equals("����")) {
			dto.setSalary(400); 
			dto.setTariff(0.02);
		
		}else if (dto.getGrade().equals("å��")) {
			dto.setSalary(600);
			dto.setTariff(0.03);
		}	
		
		arr.add(dto);
		
		System.out.println("��� ������ ���� �Ǿ����ϴ�.");	
	}

	@Override
	public void modify(CompanyDTO dto) {
	//Ư�� ����� ����,�⺻��,���� ���� �޼ҵ�	
	}

	@Override
	public CompanyDTO search(String name) {
	//Ư�� ��� �˻�. �̸� �� ���� �ش� ���� ���� ���� ã���� ��� ���� main���� ����Ѵ�.	
		
		for(int i = 0; i < arr.size(); i++) {
			dto = arr.get(i);
			if(dto.getName().equals(name)) {
				System.out.println("�̸� : " + dto.getName());
				System.out.println("���� : " + dto.getGrade());
				System.out.println("���� : " + dto.getSalary());
				System.out.println("���� : " + dto.getTariff());
			}
		}
		return null;
	}

	@Override
	public void output() {
	//��� ��� ���	
		
		if(arr.size() == 0) {
			System.out.println("����� ������ �����ϴ�.");
			
		}else {
			
			for(int i = 0; i < arr.size(); i++) {
				dto = arr.get(i);
				System.out.println("�̸� : " + dto.getName());
				System.out.println("���� : " + dto.getGrade());
				System.out.println("���� : " + dto.getSalary());
				System.out.println("���� : " + dto.getTariff());
				System.out.println("----------------");
			}
		}
	}
	
}
