package SundayTest;

public class Dept {
	private int depNo;
	private String depName;
	private String address;
	private Employee[] emps;

	public Employee[] getEmps() {
		return emps;
	}
	public void setEmps(Employee[] emps) {
		this.emps = emps;
	}
	public int getDepNo() {
		return depNo;
	}
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Dept(int depNo,String depName,String address){
		this.depNo = depNo;
		this.depName = depName;
		this.address = address;
	}
	public Dept(){
		
	}
	public String getInfo(){
		return "公司代码："+this.depNo+"，公司名称"+this.depName+"，公司位置"+this.address;
	}


}
