package dao;

import java.util.List;

import model.EmpSkill;

public interface IEmpSkillDao {

	List<EmpSkill> getAllEmpSkills();
	void addEmpSkill(EmpSkill emps);
	EmpSkill getEmpSkillById(int id);
	void updateEmpSkill(EmpSkill emps);
	void deleteEmpSkill(int id);
}
