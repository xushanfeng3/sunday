package SundayTest;

public class Main {
	public static void main(String[] args) {
		Company company = new Company();
		company.setName("leTv");
		company.setAddress("朝阳公园");
		System.out.println("hello world!");
		System.out.println(company.getName()+company.getAddress());
	}

}
