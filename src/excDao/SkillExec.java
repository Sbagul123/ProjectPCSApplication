package excDao;

import java.io.*;
import java.util.List;

import controller.SkillController;
import model.Skill;

public class SkillExec {

	SkillController sklController=null;
	
	public SkillExec()
	{
		sklController=new SkillController();
	}
	
	public void getAllSkill()
	{
		List<Skill> sklList=sklController.getAllSkill();
		for(Skill skl:sklList)
		{
			System.out.println(skl);
		}
	}
	
	public void getSkillById()
	{
		int id=0;
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Skill id whose record you want to view : ");
			id=Integer.parseInt(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		Skill skl=sklController.getSkillById(id);
		System.out.println(skl);
	}
	
	public void addSkill()
	{
		Skill skl=new Skill();
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Skill Details : ");
			System.out.println("Skill Name : ");
			skl.setSkillName(reader.readLine());
			System.out.println("Skill Description : ");
			skl.setSkillDescription(reader.readLine());
			System.out.println("Active/Deactive : ");
			skl.setActive(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		sklController.addSkill(skl);
	}
	
	public void updateSkill()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			String sName, sDes;
			System.out.println("Enter SkillId whose record you want to update : ");
			id=Integer.parseInt(reader.readLine());
			Skill skl=sklController.getSkillById(id);
			System.out.println("Enter your new Skill Name : ");
			sName=reader.readLine();
			System.out.println("Enter your new Description : ");
			sDes=reader.readLine();
			skl.setSkillName(sName);
			skl.setSkillDescription(sDes);
			sklController.updateSkill(skl);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deactiveSkill()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter SkillId whose record you want to deactivate : ");
			id=Integer.parseInt(reader.readLine());
			Skill skl=sklController.getSkillById(id);
			sklController.deactivateSkill(skl);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void activeSkill()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter SkillId whose record you want to activate : ");
			id=Integer.parseInt(reader.readLine());
			Skill skl=sklController.getSkillById(id);
			sklController.activateSkill(skl);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deleteSkill()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter SkillId whose record you want to delete : ");
			id=Integer.parseInt(reader.readLine());
			sklController.deleteSkill(id);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
