package com.learning.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementTest {
    public static String addProduct(Scanner sc) throws SQLException{
    	System.out.println("Enter the productId");
    	int productId = sc.nextInt();
    	
    	System.out.println("Enter the productName");
    	String productName = sc.next();
    	
    	System.out.println("Enter the productPrice");
    	String productPrice = sc.next();
    	
    	PreparedStatement ps = ConnectionCode.getConnection()
    			.prepareStatement("insert into eshop values (?,?,?)");
    	
    	ps.setInt(1, productId);
    	ps.setString(2, productName);
    	ps.setString(3, productPrice);
    	
    	
    	int i = ps.executeUpdate();
    	if(i>0){
    		return "Product added successfully";
    	}
    	
    	return "Something went wrong";
    }
	public static void main(String[] args) throws SQLException {
		Scanner sc  = new Scanner(System.in);
		System.out.println(addProduct(sc));

	}

}
