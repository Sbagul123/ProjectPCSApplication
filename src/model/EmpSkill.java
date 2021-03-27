package model;

public class EmpSkill {
	
	private int empSkillId;
	private int employeeId;
	private int skillId;
	private int experience;
	public EmpSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpSkill(int empSkillId, int employeeId, int skillId, int experience) {
		super();
		this.empSkillId = empSkillId;
		this.employeeId = employeeId;
		this.skillId = skillId;
		this.experience = experience;
	}
	public EmpSkill(int employeeId, int skillId, int experience) {
		super();
		this.employeeId = employeeId;
		this.skillId = skillId;
		this.experience = experience;
	}
	public int getEmpSkillId() {
		return empSkillId;
	}
	public void setEmpSkillId(int empSkillId) {
		this.empSkillId = empSkillId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	

}
