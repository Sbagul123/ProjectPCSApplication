package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import config.JDBCConnection;
import dao.IEmpSkillDao;
import model.EmpSkill;

public class EmpSkillDaoImpl implements IEmpSkillDao{

	Connection conn=null;
	public EmpSkillDaoImpl()
	{
		conn=JDBCConnection.getDBConnection();
	}
	
	@Override
	public List<EmpSkill> getAllEmpSkills() {
		List<EmpSkill> empsList=new ArrayList<EmpSkill>();
		try
		{
			String query="Select * from EmpSkill";
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery(query);
			if(rst!=null)
			{
				while(rst.next())
				{
					EmpSkill emps=new EmpSkill();
					emps.setEmpSkillId(rst.getInt(1));
					emps.setEmployeeId(rst.getInt(2));
					emps.setSkillId(rst.getInt(3));
					emps.setExperience(rst.getInt(4));
					empsList.add(emps);
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return empsList;	
	}

	@Override
	public void addEmpSkill(EmpSkill emps) {
		try
		{
			String query="insert into EmpSkill(EmployeeId, SkillId, Experience) values(? ,?, ?)";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setInt(1, emps.getEmployeeId());
			pst.setInt(2, emps.getSkillId());
			pst.setInt(3, emps.getExperience());
			int i=pst.executeUpdate();
			if(i==1)
			{
				System.out.println("1 record inserted...");
			}
			else
			{
				System.out.println("Insertion Failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}	
	}

	@Override
	public EmpSkill getEmpSkillById(int id) {
		EmpSkill emps=new EmpSkill();
		try
		{
			String query="Select * from EmpSkill where EsId=?";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setInt(1,  id);
			ResultSet rst=pst.executeQuery();
			if(rst!=null)
			{
				while(rst.next())
				{
					emps.setEmpSkillId(1);
					emps.setEmployeeId(rst.getInt(2));
					emps.setSkillId(rst.getInt(3));
					emps.setExperience(rst.getInt(4));
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return emps;
	}

	@Override
	public void updateEmpSkill(EmpSkill emps) {
		try
		{
			String query="UPDATE EmpSkill SET EmployeeId=?, SkillId=? WHERE ESId=?";
			PreparedStatement statement=conn.prepareStatement(query);
			statement.setInt(1, emps.getEmployeeId());
			statement.setInt(2, emps.getSkillId());
			statement.setInt(3, emps.getEmpSkillId());
			int rowsUpdated=statement.executeUpdate();
			if(rowsUpdated>0)
			{
				System.out.println("An existing user was updated successfully!");
			}
			else
			{
				System.out.println("updation failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}	
	}

	@Override
	public void deleteEmpSkill(int id) {
		try
		{
			PreparedStatement pst=conn.prepareStatement("delete from EmpSkill where EsId=?");
			pst.setInt(1, id);
			int i=pst.executeUpdate();
			if(i==1)
			{
				System.out.println("Employee Skill deleted....");
			}
			else
			{
				System.out.println("deletion failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
