package dao;

import java.util.List;

import model.Skill;

public interface ISkillDao {
	
	List<Skill> getAllSkill();
	void addSkill(Skill skl);
	Skill getSkillById(int id);
	void updateSkill(Skill skl);
	void deactivateSkill(Skill skl);
	void activateSkill(Skill skl);
	void deleteSkill(int id);

}
