package grouping;

import org.testng.annotations.Test;

public class TestNGGroup {
	
	@Test(groups= {"smoke","system","regression"})
	public void add1() {
		System.out.println("Method 1");
	}
	
	@Test(groups={"system","regression"})
	
	public void add2() {
		System.out.println("Method 2");
	}
	
	@Test(groups={"smoke"})
	public void add3() {
		System.out.println("Method 3");
	}
	
	@Test(groups={"system"})
	public void add4() {
		System.out.println("Method 4");
	}
	
	@Test(groups={"smoke", "system"})
	public void add5() {
		System.out.println("Method 5");
	}
}

class TestNG2{
	@Test(groups= {"smoke"})
	
	public void add6() {
		System.out.println("Method 6");
	}
}
//smoke-->build verification testing,coz exit criteria of smoke testing 100% basic and critical feature of application
//intergration  and system or end to end
//canary deployment: it is only acceesible to dev test manager.. status code need to check
//system  -> 
//integration
//component--->regression
//testng has feature to run failed test cases
//63-fail
//13 pass next time: if front or backend build deployed,  or s/w h/w issue,env not stable
//development
//tester
//beta--> prod  env but not with real traffic(onlydev,test,cust,manageraccess)
//production