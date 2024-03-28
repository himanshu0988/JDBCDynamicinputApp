package in.dynamicinput.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) throws SQLException
	{
		Connection connection=null;
		Statement statement=null;
		String url="jdbc:mysql:///detail";
		String user="root";
		String password="9852451029";
		
		connection=DriverManager.getConnection(url,user,password);
		
		statement=connection.createStatement();
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("enter the id ");
		 int id=scan.nextInt();
		 
		 System.out.println(" enter the student name ");
		 String name=scan.next();
		 
		 System.out.println(" enter the student age ");
		 int age=scan.nextInt();
		 
		 String Query=String.format("insert into studnet(sid,`sname`,sage)values (%d,'%s',%d)",id,name,age);
		 
		 int RowAffect=statement.executeUpdate(Query);
		 System.out.println("total row affected is "+RowAffect);
		
		 connection.close();
		 statement.close();
	}

}
