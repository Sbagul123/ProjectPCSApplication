package daoImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import config.JDBCConnection;
import dao.ISkillDao;
import model.Skill;

public class SkillDaoImpl implements ISkillDao {

	Connection conn=null;
	
	public SkillDaoImpl() {
		conn=JDBCConnection.getDBConnection();
	}
	
	@Override
	public List<Skill> getAllSkill() {
		List<Skill> sklList=new ArrayList<Skill>();
		try
		{
			String query="Select * from Skill";
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery(query);
			if(rst!=null)
			{
				while(rst.next())
				{
					Skill skl=new Skill();
					skl.setSkillId(rst.getInt(1));
					skl.setSkillName(rst.getString(2));
					skl.setSkillDescription(rst.getString(3));
					skl.setActive(rst.getString(4));
					sklList.add(skl);
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return sklList;
	}

	@Override
	public void addSkill(Skill skl) {
		try
		{
			String query="insert into Skill(SkillName, SkillDescription, Active) values(?, ?, ?)";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setString(1, skl.getSkillName());
			pst.setString(2, skl.getSkillDescription());
			pst.setString(3, skl.getActive());
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
	public Skill getSkillById(int id) {
		Skill skl=new Skill();
		try
		{
			String query="Select * from Skill where SkillId=?";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setInt(1,  id);
			ResultSet rst=pst.executeQuery();
			if(rst!=null)
			{
				
				while(rst.next())
				{
					skl.setSkillId(rst.getInt(1));
					skl.setSkillName(rst.getString(2));
					skl.setSkillDescription(rst.getString(3));
					skl.setActive(rst.getString(4));
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return skl;
		
	}

	@Override
	public void updateSkill(Skill skl) {
		try
		{
			String query="UPDATE Skill SET SkillName=?, SkillDescription=? WHERE SkillId=?";
			
			PreparedStatement statement=conn.prepareStatement(query);
			statement.setString(1, skl.getSkillName());
			statement.setString(2, skl.getSkillDescription());
			statement.setInt(3, skl.getSkillId());
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
	public void deactivateSkill(Skill skl) {
		try
		{
			//Creating PreparedStatement object by passing query string
			PreparedStatement pst=conn.prepareStatement("update Skill set Active=? where SkillId=?");
			pst.setString(1, "Deactive");
			pst.setInt(2, skl.getSkillId());
			int i=pst.executeUpdate();
			if(i==1)
			{
				System.out.println("Employee deactivated....");
			}
			else
			{
				System.out.println("updation failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void activateSkill(Skill skl) {
		try
		{
			PreparedStatement pst=conn.prepareStatement("update Skill set Active=? where SkillId=?");
			pst.setString(1, "Active");
			pst.setInt(2, skl.getSkillId());
			int i=pst.executeUpdate();
			if(i==1)
			{
				System.out.println("Employee Activated....");
			}
			else
			{
				System.out.println("updation failed...");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void deleteSkill(int id) {
		try
		{
			//Creating PreparedStatement object by passing query string
			PreparedStatement pst=conn.prepareStatement("delete from Skill where SkillId=?");
			pst.setInt(1, id);
			int i=pst.executeUpdate();
			if(i==1)
			{
				System.out.println("Skill deleted....");
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
