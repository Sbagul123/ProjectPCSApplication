package excDao;

import java.io.*;
import java.util.List;

import controller.JobController;
import model.Job;

public class JobExec {

	JobController jobController=null;
	
	public JobExec()
	{
		jobController=new JobController();
	}
	
	public void getAllJobs()
	{
		List<Job> jobList=jobController.getAllJobs();
		for(Job job:jobList)
		{
			System.out.println(job);
		}
	}
	
	public void getJobById()
	{
		int id=0;
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Job id whose record you want to view : ");
			id=Integer.parseInt(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		Job job=jobController.getJobById(id);
		System.out.println(job);
	}
	
	public void addJob()
	{
		Job job=new Job();
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Job Details : ");
			System.out.println("Job Title : ");
			job.setJobTitle(reader.readLine());
			System.out.println("Job Description : ");
			job.setJobDescription(reader.readLine());
			System.out.println("Company Name : ");
			job.setCompanyName(reader.readLine());
			System.out.println("Location : ");
			job.setLocation(reader.readLine());
			System.out.println("Key Skill : ");
			job.setKeySkill(reader.readLine());
			System.out.println("Salary : ");
			job.setSalary(Integer.parseInt(reader.readLine()));
			System.out.println("Experience : ");
			job.setExperience(Integer.parseInt(reader.readLine()));
			System.out.println("Active/Deactive : ");
			job.setActive(reader.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		jobController.addJob(job);
	}
	
	public void updateJob()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			String cName, location;
			int salary, exp;
			System.out.println("Enter JobId whose record you want to update : ");
			id=Integer.parseInt(reader.readLine());
			Job job=jobController.getJobById(id);
			System.out.println("Enter your new Company Name : ");
			cName=reader.readLine();
			System.out.println("Enter your new Company Location : ");
			location=reader.readLine();
			System.out.println("Enter your new Salary : ");
			salary=Integer.parseInt(reader.readLine());
			System.out.println("Enter your Experiance : ");
			exp=Integer.parseInt(reader.readLine());
			job.setCompanyName(cName);
			job.setLocation(location);
			job.setSalary(salary);
			job.setExperience(exp);
			jobController.updateJob(job);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deactiveJob()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter JobId whose record you want to deactivate : ");
			id=Integer.parseInt(reader.readLine());
			Job job=jobController.getJobById(id);
			jobController.deactivateJob(job);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void activeJob()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter JobId whose record you want to activate : ");
			id=Integer.parseInt(reader.readLine());
			Job job=jobController.getJobById(id);
			jobController.activateJob(job);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deleteJob()
	{
		try
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter JobId whose record you want to delete : ");
			id=Integer.parseInt(reader.readLine());
			jobController.deleteJob(id);
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
