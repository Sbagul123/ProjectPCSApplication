package controller;

import java.util.List;

import dao.ISkillDao;
import daoImpl.SkillDaoImpl;
import model.Skill;

public class SkillController {

	ISkillDao sklDao=null;
	
	public SkillController()
	{
		sklDao=new SkillDaoImpl();
	}
	
	public List<Skill> getAllSkill()
	{
		List<Skill> empList=sklDao.getAllSkill();
		return empList;
	}
	
	public void addSkill(Skill skl)
	{
		sklDao.addSkill(skl);
	}
	
	public Skill getSkillById(int id)
	{
		Skill skl=sklDao.getSkillById(id);
		return skl;
	}
	
	public void updateSkill(Skill skl)
	{
		sklDao.updateSkill(skl);
	}
	
	public void deleteSkill(int id)
	{
		sklDao.deleteSkill(id);
	}
	
	public void deactivateSkill(Skill skl)
	{
		sklDao.deactivateSkill(skl);
	}
	
	public void activateSkill(Skill skl)
	{
		sklDao.activateSkill(skl);
	}
}
