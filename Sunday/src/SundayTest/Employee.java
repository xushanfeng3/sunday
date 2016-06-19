package SundayTest;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name,int id,double salary){
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public  String getInfo() {
		return "姓名："+this.name+",工号："+this.id+"，薪水"+this.salary;
		
	}

}
