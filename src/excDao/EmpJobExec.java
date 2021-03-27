package excDao;

import java.io.*;
import java.util.List;

import controller.EmpJobController;
import model.EmpJob;

public class EmpJobExec {

	EmpJobController empController=null;
	
	public EmpJobExec()
	{
		empController=new EmpJobController();
	}
	
	public void getAllEmpJobs()
	{
		List<EmpJob> empList=empController.getAllEmpJobs();
		for(EmpJob emp:empList)
		{
			System.out.println(emp);
		}
	}
	
	public void getEmpJobById()
	{
		int id=0;
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter empJob id whose record you want to view : ");
			id=Integer.parseInt(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		EmpJob emp=empController.getEmpJobById(id);
		System.out.println(emp);
	}
	
	public void addEmpJob()
	{
		EmpJob emp=new EmpJob();
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Job Details : ");
			System.out.println("Enter Employee Id : ");
			emp.setEmployeeId(Integer.parseInt(reader.readLine()));
			System.out.println("Enter Job Id : ");
			emp.setJobId(Integer.parseInt(reader.readLine()));
			System.out.println("Enter Recruited : ");
			emp.setRecruited(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		empController.addEmpJob(emp);
	}
	
	public void updateEmpJob()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id, job;
			System.out.println("Enter EJID whose record you want to update : ");
			id=Integer.parseInt(reader.readLine());
			EmpJob emp=empController.getEmpJobById(id);
			System.out.println("Enter your new Job id : ");
			job=Integer.parseInt(reader.readLine());
			emp.setJobId(job);
			empController.updateEmpJob(emp);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deleteEmpJob()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter EJID whose record you want to delete : ");
			id=Integer.parseInt(reader.readLine());
			empController.deleteEmpJob(id);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
