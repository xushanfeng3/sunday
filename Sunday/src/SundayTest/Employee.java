package SundayTest;

public class Employee {
	private int empNo;
	private String empName;
	private Dept dept;
	private String job;
	private double sla;
	private double comm;
	private Employee mgr;
	public Employee getMgr() {
		return mgr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
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
	public Employee(int empNo,String empName,String job,double sla,double comm){
		this.empName = empName;
		this.empNo = empNo;
		this.job = job;
		this.sla = sla;
		this.comm = comm;
		
	}
	public Employee(){
		
	}
	public String getInfo(){
		return "工号："+this.empNo+",姓名："+this.empName+"，工作:"+this.job+"，薪水:"+this.sla+"，佣金:"+this.comm;
	}
}
