package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import config.JDBCConnection;
import dao.IEmpJobDao;
import model.EmpJob;

public class EmpJobDaoImpl implements IEmpJobDao {

	Connection conn=null;
	
	public EmpJobDaoImpl()
	{
		conn=JDBCConnection.getDBConnection();
	}
	
	@Override
	public List<EmpJob> getAllEmpJobs() {
		List<EmpJob> empList=new ArrayList<EmpJob>();
		try
		{
			String query="select * from EmpJob";
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery(query);
			if(rst!=null)
			{
				while(rst.next())
				{
					EmpJob emp=new EmpJob();
					emp.setEmpJobId(rst.getInt(1));
					emp.setEmployeeId(rst.getInt(2));
					emp.setJobId(rst.getInt(3));
					emp.setRecruited(rst.getString(4));
					empList.add(emp);
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return empList;
	}	
		@Override
		public void addEmpJob(EmpJob emp) {
	 
			try {
				String query="insert int EmpJob(EmployeeId, JobId, Recruited) values(?,?,?)";
				PreparedStatement pst=conn.prepareStatement(query);
				pst.setInt(1, emp.getEmployeeId());
				pst.setInt(2, emp.getJobId());
				pst.setString(3, emp.getRecruited());
				int i=pst.executeUpdate();
			    if(i==1)
			    {
			    	System.out.println("I record inserted....");
			    }
			    else {
			    	System.out.println("Insertion Failed...");
			    }
			}
		catch(SQLException ex)
			{
			System.out.println(ex);
			}
		}
	
		
		
		@Override
		public EmpJob getEmpJobById(int id) {
			EmpJob emp=new EmpJob();
			try {
				String query="select * from EmplJob Where EmpJobID=?";
				PreparedStatement pst=conn.prepareStatement(query);
				pst.setInt(1, id);
				ResultSet rst=pst.executeQuery();
				if(rst!=null)
				{
					while(rst.next())
					{
						emp.setEmpJobId(rst.getInt(1));
						emp.setEmployeeId(rst.getInt(2));
						emp.setJobId(rst.getInt(3));
						emp.setRecruited(rst.getString(4));
					}
				}
			}
		
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			return emp;
		}

		
		
		
	@Override
	public void updateEmpJob(EmpJob emp) {
		try
		{
			String query="UPDATE EmpJob SETJobId=? WHERE EmpJobID=?";
			PreparedStatement statement=conn.prepareStatement(query);
			statement.setInt(1, emp.getJobId());
			statement.setInt(2, emp.getEmpJobId());
			int rowsUpdated=statement.executeUpdate();
			if(rowsUpdated>0)
			{
				System.out.println("An existing user was updated successfully!");
			}
			else {
				System.out.println("UPdation failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}

	@Override
	public void deleteEmpJob(int id) {
		try
		{
			PreparedStatement pst=conn.prepareStatement("delete from EmpJob where EmpJobID=?");
			pst.setInt(1,id);
			int i=pst.executeUpdate();
			if(i==1)
			{
				System.out.println("Employee deleted....");
			}
			else
			{
				System.out.println("deletion failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}
	}
	
	
	



	
