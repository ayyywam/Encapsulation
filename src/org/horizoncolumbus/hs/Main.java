package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee farah = new Employee();
        System.out.println(farah.getSalary());

        farah.setSalary(1000000);
//java: Salary has private access in org.horizoncolumbus.hs.Employee        System.out.println(farah.Salary);
        System.out.println(farah.getSalary());

        farah.setSalary(1000000*1.1);
        System.out.println(farah.getSalary());
    }
}
