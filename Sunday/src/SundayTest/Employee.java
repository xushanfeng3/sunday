package SundayTest;

public class Employee {
	private int empNo;
	private String eName;
	private String job;
	private double sla;
	private double comm;
	private Dept dept;
	private Employee mgr;
	public Employee getMgr() {
		return mgr;
	}
	public void setMgr(Employee mgr) {
		this.mgr = mgr;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSla() {
		return sla;
	}
	public void setSla(double sla) {
		this.sla = sla;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public String getInfo(){
		return "雇员编号："+this.empNo+",雇员姓名："+this.eName+"，职位"+this.job+"，薪水"+this.sla+"，佣金"+this.comm;
	}
	
	
}
