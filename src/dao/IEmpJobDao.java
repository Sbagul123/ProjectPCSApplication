package dao;

import java.util.List;

import model.EmpJob;

public interface IEmpJobDao {

	void updateEmpJob(EmpJob emp);

	void deleteEmpJob(int id);

	EmpJob getEmpJobById(int id);

	void addEmpJob(EmpJob emp);

	List<EmpJob> getAllEmpJobs();

}
