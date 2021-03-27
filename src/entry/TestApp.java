package entry;

import java.sql.SQLException;
import java.util.Scanner;

import config.JDBCConnection;
import excDao.EmpSkillExec;
import excDao.EmployeeExec;
import excDao.JobExec;
import excDao.SkillExec;
import excDao.EmpJobExec;

public class TestApp {
	
	public void testConnection()
	{
		try
		{
			if(JDBCConnection.getDBConnection().isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("Connection is opened");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void processMenuEmployee()
	{
		EmployeeExec obj=new EmployeeExec();
		Scanner sc=new Scanner(System.in);
		int option=0;
		char ch='y';
		do
		{
			System.out.println("-------------CRUD Operation--------------");
			System.out.println("1. View all Employees");
			System.out.println("2. View single Employee");
			System.out.println("3. Add Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Deactivate Employee");
			System.out.println("7. Activate Employee");
			System.out.println("8. Quit");
			System.out.println("__________________________");
			System.out.println("Enter your choice : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					obj.getAllEmployees();
					break;
				case 2:
					obj.getEmployeeById();
					break;
				case 3:
					obj.addEmployee();
					break;
				case 4:
					obj.updateEmployee();
					break;
				case 5:
					obj.deleteEmployee();
					break;
				case 6:
					obj.deactiveEmployee();
					break;
				case 7:
					obj.activeEmployee();
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input!");
					break;
			}
			System.out.println("Do you want to continue(y/n)?");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	
	public void processMenuSkill()
	{
		SkillExec obj=new SkillExec();
		Scanner sc=new Scanner(System.in);
		int option=0;
		char ch='y';
		do
		{
			System.out.println("-------------CRUD Operation--------------");
			System.out.println("1. View all Skills");
			System.out.println("2. View single Skill");
			System.out.println("3. Add Skill");
			System.out.println("4. Update Skill");
			System.out.println("5. Delete Skill");
			System.out.println("6. Deactivate Skill");
			System.out.println("7. Activate Skill");
			System.out.println("8. Quit");
			System.out.println("__________________________");
			System.out.println("Enter your choice : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					obj.getAllSkill();
					break;
				case 2:
					obj.getSkillById();
					break;
				case 3:
					obj.addSkill();
					break;
				case 4:
					obj.updateSkill();
					break;
				case 5:
					obj.deleteSkill();
					break;
				case 6:
					obj.deactiveSkill();
					break;
				case 7:
					obj.activeSkill();
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input!");
					break;
			}
			System.out.println("Do you want to continue(y/n)?");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	
	public void processMenuJob()
	{
		JobExec obj=new JobExec();
		Scanner sc=new Scanner(System.in);
		int option=0;
		char ch='y';
		do
		{
			System.out.println("-------------CRUD Operation--------------");
			System.out.println("1. View all Jobs");
			System.out.println("2. View single Job");
			System.out.println("3. Add Job");
			System.out.println("4. Update Job");
			System.out.println("5. Delete Job");
			System.out.println("6. Deactivate Job");
			System.out.println("7. Activate Job");
			System.out.println("8. Quit");
			System.out.println("__________________________");
			System.out.println("Enter your choice : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					obj.getAllJobs();
					break;
				case 2:
					obj.getJobById();
					break;
				case 3:
					obj.addJob();
					break;
				case 4:
					obj.updateJob();
					break;
				case 5:
					obj.deleteJob();
					break;
				case 6:
					obj.deactiveJob();
					break;
				case 7:
					obj.activeJob();
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input!");
					break;
			}
			System.out.println("Do you want to continue(y/n)?");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	
	public void processMenuEmpSkill()
	{
		EmpSkillExec obj=new EmpSkillExec();
		Scanner sc=new Scanner(System.in);
		int option=0;
		char ch='y';
		do
		{
			System.out.println("-------------CRUD Operation--------------");
			System.out.println("1. View all EmpSkill");
			System.out.println("2. View single EmpSkill");
			System.out.println("3. Add EmpSkill");
			System.out.println("4. Update EmpSkill");
			System.out.println("5. Delete EmpSkill");
			System.out.println("6. Quit");
			System.out.println("__________________________");
			System.out.println("Enter your choice : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					obj.getAllEmpSkills();
					break;
				case 2:
					obj.getEmpSkillById();
					break;
				case 3:
					obj.addEmpSkill();
					break;
				case 4:
					obj.updateEmpSkill();
					break;
				case 5:
					obj.deleteEmpSkill();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input!");
					break;
			}
			System.out.println("Do you want to continue(y/n)?");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	
	public void processMenuEmpJob()
	{
		EmpJobExec obj=new EmpJobExec();
		Scanner sc=new Scanner(System.in);
		int option=0;
		char ch='y';
		do
		{
			System.out.println("-------------CRUD Operation--------------");
			System.out.println("1. View all EmpJob");
			System.out.println("2. View single EmpJob");
			System.out.println("3. Add EmpJob");
			System.out.println("4. Update EmpJob");
			System.out.println("5. Delete EmpJob");
			System.out.println("6. Quit");
			System.out.println("__________________________");
			System.out.println("Enter your choice : ");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					obj.getAllEmpJobs();
					break;
				case 2:
					obj.getEmpJobById();
					break;
				case 3:
					obj.addEmpJob();
					break;
				case 4:
					obj.updateEmpJob();
					break;
				case 5:
					obj.deleteEmpJob();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input!");
					break;
			}
			System.out.println("Do you want to continue(y/n)?");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	
	public static void main(String[] args) {
		
		TestApp test=new TestApp();
		//test.testConnection();
		//test.processMenuEmployee();
		//test.processMenuSkill();
		test.processMenuJob();
		//test.processMenuEmpSkill();
		//test.processMenuEmpJob();
	}

}
