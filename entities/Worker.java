package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	
	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getbaseSalary() {
		return baseSalary;
	}

	public void setbaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartment() {
		return departament;
	}

	public void setDepartament(Departament department) {
		this.departament = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}


	public void addContract (HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income (int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
