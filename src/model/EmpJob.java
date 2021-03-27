package model;

public class EmpJob {
	
	private int empJobId;
	private int employeeId;
	private int jobId;
	private String recruited;
	public EmpJob() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpJob(int empJobId, int employeeId, int jobId, String recruited) {
		super();
		this.empJobId = empJobId;
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.recruited = recruited;
	}
	public EmpJob(int employeeId, int jobId, String recruited) {
		super();
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.recruited = recruited;
	}
	public int getEmpJobId() {
		return empJobId;
	}
	public void setEmpJobId(int empJobId) {
		this.empJobId = empJobId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getRecruited() {
		return recruited;
	}
	public void setRecruited(String recruited) {
		this.recruited = recruited;
	}
	
	
	
	

}
