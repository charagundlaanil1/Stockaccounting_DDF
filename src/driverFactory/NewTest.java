package driverFactory;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonFunLibrary.ERP_Functions;
import Utilities.ExcelFileUtil;

public class NewTest 
{

	ERP_Functions erp=new ERP_Functions();
	
	@BeforeTest
	public void admintest() throws Throwable{
		erp.lanuchApp("http://webapp.qedge.com/login.php");
		erp.login("admin", "master");
	}
	@Test
	public void f() throws Throwable{
		
		ExcelFileUtil exl=new ExcelFileUtil();
	
		int rc=exl.rowCount("supplier");
	       
		for(int i=1;i<=rc;i++)
		{
			String sname=exl.getData("supplier", i, 0);
			String address=exl.getData("supplier", i, 1);
			String city=exl.getData("supplier", i, 2);
			String country=exl.getData("supplier", i, 3);
			String cperson=exl.getData("supplier", i, 4);
			String pnumber=exl.getData("supplier", i, 5);
			String mail=exl.getData("supplier", i, 6);
			String mnumber=exl.getData("supplier", i, 7);
			String note=exl.getData("supplier", i, 8);
			
			
		    String result=erp.suppliers(sname, address, city, country, cperson, pnumber, mail, mnumber, note);
		  
			exl.setData("supplier", i, 9, result);
	
		}
     }
     @AfterTest
	public void logout() throws Throwable{
    	 
    	 erp.logout();
    	 erp.closebrw();
     }
     
	}

