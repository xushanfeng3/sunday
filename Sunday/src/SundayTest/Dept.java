package SundayTest;

public class Dept {
	private int deptNo;
	private String dName;
	private String loc;
	private Employee emps[];
	
	

	public Employee[] getEmps() {
		return emps;
	}
	public void setEmps(Employee[] emps) {
		this.emps = emps;
	}


	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getInfo(){
		return "部门编号:"+this.deptNo+"，部门名称："+this.dName+"，所在位置："+this.loc;
	}
	

}
