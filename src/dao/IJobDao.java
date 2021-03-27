package dao;
import java.util.List;

import model.Job;

public interface IJobDao {
	
	List<Job> getAllJobs();
	void addJob(Job job);
	Job getJobById(int id);
	void updateJob(Job job);
	void deactiveJob(Job job);
	void activeJob(Job job);
	void deleteJob(int job);

}
