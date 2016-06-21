package SundayTest;

public class Main {
	public static void main(String[] args) {
		Dept dept = new Dept(100, "leTv", "姚家园");
		Employee empa = new Employee(10001, "zhang", "boss",10000.0, 0.8);
		Employee empb = new Employee(10002, "wang", "manager",5000.0, 0.4);
		Employee empc = new Employee(10003, "li", "staff",2500.0, 0.2);
		empa.setDept(dept);
		dept.setEmps(new Employee[] {empa,empb,empc} );
		empb.setMgr(empa);
		empc.setMgr(empb);
//		System.out.println(empa.getDept().getInfo());
//		System.out.println("\t-|"+empa.getInfo());
		System.out.println(dept.getDepName());
		for (int i = 0;i<dept.getEmps().length;i++){
			System.out.println("\t-|"+dept.getEmps()[i].getInfo());
		}
		
	}

}
