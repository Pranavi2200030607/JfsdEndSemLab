package ConstructorDi;

import java.util.List;

public class Employee {
	private int eid;
	private String ename;
	private String esalary;
	private String edepartment;
	private List<String> skills;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", edepartment=" + edepartment
				+ ", skills=" + skills + "]";
	}
	public Employee(int eid, String ename, String esalary, String edepartment, List<String> skills) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.edepartment = edepartment;
		this.skills = skills;
	}

}
