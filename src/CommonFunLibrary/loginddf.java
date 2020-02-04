package CommonFunLibrary;

public class loginddf{

	public static void main(String[] args) throws Throwable {
		ERP_Functions d=new ERP_Functions();
       String result= d.lanuchApp("http://webapp.qedge.com/login.php");
        String logintest=d.login("admin", "master")	;
        System.out.println(result);
        System.out.println(logintest);
        
     String reslutofsuppliers=   d.suppliers("anil", "nalgonda", "hyd", "india", "87854548", "9642228568", "charagundlaanil@gmail.com", "584621254", "hi world");
     System.out.println(reslutofsuppliers);
    String logoutfun= d.logout();
    System.out.println(logoutfun);
    d.closebrw();
	}
  
}