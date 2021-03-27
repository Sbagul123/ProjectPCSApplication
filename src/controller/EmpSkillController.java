package controller;

import java.util.List;

import dao.IEmpSkillDao;
import daoImpl.EmpSkillDaoImpl;
import model.EmpSkill;

public class EmpSkillController {

	IEmpSkillDao empsDao=null;
	
	public EmpSkillController()
	{
		empsDao=new EmpSkillDaoImpl();
	}
	
	public List<EmpSkill> getAllEmpSkills()
	{
		List<EmpSkill> empsList=empsDao.getAllEmpSkills();
		return empsList;
	}
	
	public void addEmpSkill(EmpSkill emps)
	{
		empsDao.addEmpSkill(emps);
	}
	
	public EmpSkill getEmpSkillById(int id)
	{
		EmpSkill emps=empsDao.getEmpSkillById(id);
		return emps;
	}
	
	public void updateEmpSkill(EmpSkill emps)
	{
		empsDao.updateEmpSkill(emps);
	}
	
	public void deleteEmpSkill(int id)
	{
		empsDao.deleteEmpSkill(id);
	}
}
