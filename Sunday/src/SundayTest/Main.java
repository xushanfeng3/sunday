package SundayTest;

import java.awt.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		System.out.println(list);
		System.out.println(list.size());
		
		
		Dept dept = new Dept();
		dept.setDeptNo(020);
		dept.setdName("乐视车联");
		dept.setLoc("北京");
		
		Employee empa = new Employee();
		Employee empb = new Employee();
		Employee empc = new Employee();
		dept.setEmps(new Employee[]{empa,empb,empc});
		empa.setDept(dept);
		empc.setDept(dept);
		empb.setDept(dept);
		
		empa.seteName("zhang");
		empb.seteName("wang");
		empc.seteName("li");
		
		empa.setEmpNo(100);
		empb.setEmpNo(101);
		empc.setEmpNo(102);
		
		empa.setJob("manager");
		empb.setJob("headman");
		empc.setJob("staff");
		
		empa.setSla(10000.00);
		empb.setSla(5000.00);
		empc.setSla(2500.00);
		
		empa.setComm(0.9);
		empb.setComm(0.45);
		empc.setComm(0.2);
		
		empb.setMgr(empa);
		empc.setMgr(empb);
		
		
		for(int i=0;i<dept.getEmps().length;i++){
			if(dept.getEmps()[i].getMgr()!=null){
				System.out.println(dept.getDeptNo()+"\n");
				System.out.println(dept.getEmps()[i].getInfo());
				System.out.println("\t"+dept.getEmps()[i].getMgr().getInfo());
			}
			else{
				System.out.println(dept.getEmps()[i].geteName()+" is boss\n");
			}
			
			
		}
	}

}
