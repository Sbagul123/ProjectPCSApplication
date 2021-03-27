package excDao;

import java.io.*;
import java.util.List;

import controller.EmpSkillController;
import model.EmpSkill;

public class EmpSkillExec {

	EmpSkillController empsController=null;
	
	public EmpSkillExec()
	{
		empsController=new EmpSkillController();
	}
	
	public void getAllEmpSkills()
	{
		List<EmpSkill> empsList=empsController.getAllEmpSkills();
		for(EmpSkill emps:empsList)
		{
			System.out.println(emps);
		}
	}
	
	public void getEmpSkillById()
	{
		int id=0;
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Skill id whose record you want to view : ");
			id=Integer.parseInt(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		EmpSkill emps=empsController.getEmpSkillById(id);
		System.out.println(emps);
	}
	
	public void addEmpSkill()
	{
		EmpSkill emps=new EmpSkill();
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Skill Details : ");
			System.out.println("Employee Id : ");
			emps.setEmployeeId(Integer.parseInt(reader.readLine()));
			System.out.println("Skill Id : ");
			emps.setSkillId(Integer.parseInt(reader.readLine()));
			System.out.println("Experiance : ");
			emps.setExperience(Integer.parseInt(reader.readLine()));
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		empsController.addEmpSkill(emps);
	}
	
	public void updateEmpSkill()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int empId, skillId, id;
			System.out.println("Enter EmpSkill Id whose record you want to update : ");
			id=Integer.parseInt(reader.readLine());
			EmpSkill emps=empsController.getEmpSkillById(id);
			System.out.println("Enter your new Employee Id : ");
			empId=Integer.parseInt(reader.readLine());
			System.out.println("Enter your new Skill Id : ");
			skillId=Integer.parseInt(reader.readLine());
			emps.setEmployeeId(empId);
			emps.setSkillId(skillId);
			empsController.updateEmpSkill(emps);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deleteEmpSkill()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter EmpSkill Id whose record you want to delete : ");
			id=Integer.parseInt(reader.readLine());
			empsController.deleteEmpSkill(id);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
