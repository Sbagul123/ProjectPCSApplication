package controller;

import java.util.List;

import dao.IEmpJobDao;
import daoImpl.EmpJobDaoImpl;
import model.EmpJob;

public class EmpJobController {

	IEmpJobDao empDao=null;
	
	public EmpJobController()
	{
		empDao=new EmpJobDaoImpl();
	}
	
	public List<EmpJob> getAllEmpJobs()
	{
		List<EmpJob> empList=empDao.getAllEmpJobs();
		return empList;
	}
	
	public void addEmpJob(EmpJob emp)
	{
		empDao.addEmpJob(emp);
	}
	
	public EmpJob getEmpJobById(int id)
	{
		EmpJob emp=empDao.getEmpJobById(id);
		return emp;
	}
	
	public void updateEmpJob(EmpJob emp)
	{
		empDao.updateEmpJob(emp);
	}
	
	public void deleteEmpJob(int id)
	{
		empDao.deleteEmpJob(id);
	}
}
