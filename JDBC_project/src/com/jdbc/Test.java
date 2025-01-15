package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter salary:");
		int salary=sc.nextInt();
		try {
			//step 1: load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2:established the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			//normal statement
//			//step 3:create the statement
//			Statement st=con.createStatement();
//			//step 4:create query
//			String q="delete from emp where id=2";
//			//step 4:execute the query
//			st.execute(q);//DDL
//			//close the connection
//			con.close();
			
			
			//prepared statement(executeUpdate)
			String q="insert into emp values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int x=ps.executeUpdate();//increase count if query is successful//DML
			if(x>0)
			{
				System.out.println("Data inserted successfully");
			}
			else
			{
				System.out.println("Data not inserted");
			}
			
			//prepared statement(executeQuery)
			String q1="select*from emp";
			PreparedStatement ps1=con.prepareStatement(q1);
			ResultSet rs=ps1.executeQuery();//when you want to work with select//DQL
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id"));
				System.out.println("name: "+rs.getString("name"));
				System.out.println("Salary: "+rs.getInt("salary"));
				System.out.println("***************************************");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
