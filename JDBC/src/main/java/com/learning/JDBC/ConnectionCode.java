package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionCode {
    private static final String jdbc_url = "jdbc:mysql://localhost:3306/jdbcapp";
    private static final String username = "root";
    private static final String password = "root";
    private static Connection con = null;
    public static Connection getConnection(){
    	try{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		if(con==null){
    			con = DriverManager.getConnection(jdbc_url,username,password);
    		}
    		return con;
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return con;
    }
    
    public static String getTable(){
    	String sql = "create table eshop (productId int(10) primary key,productName varchar(20),"
    			  +"productPrice varchar(20))";
    	try{
    	Connection con = getConnection();
    	Statement stmt = con.createStatement();
    	stmt.execute(sql);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "Table created successfully";
    }
    
    public static String addProduct(){
    	String sql = "insert into eshop values (102,'Mobiles','46000')";
    	try{
    	Connection con = getConnection();
    	Statement stmt = con.createStatement();
    	int i = stmt.executeUpdate(sql);
    	
    	if(i>0){
    		return "Product added successfully";
    	}
    	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "Something went wrong";
    }
    
    public static void getProductById(int productId){
    	
    	String sql = "select * from eshop as e where e.productId="+productId;
    	try{
    		Connection con = getConnection();
    		Statement stmt = con.createStatement();
    		ResultSet resultSet = stmt.executeQuery(sql);
    		System.out.println("Product based on Id:");
    		System.out.println("______________________________");
    		while(resultSet.next()){
    			System.out.println("ProductId :"+resultSet.getInt(1));
    			System.out.println("ProductName :"+resultSet.getString(2));
    			System.out.println("ProductPrice :"+resultSet.getString(3));
    		}
    		System.out.println("____________________________________________");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public static void getAll(){

    	String sql = "select * from eshop";
    	try{
    		Connection con = getConnection();
    		Statement stmt = con.createStatement();
    		ResultSet resultSet = stmt.executeQuery(sql);
    		System.out.println("Product details:");
    		System.out.println("______________________________");
    		while(resultSet.next()){
    			System.out.println("ProductId :"+resultSet.getInt(1));
    			System.out.println("ProductName :"+resultSet.getString(2));
    			System.out.println("ProductPrice :"+resultSet.getString(3));
    			System.out.println("----------------------------------------");
    		}
    		System.out.println("____________________________________________");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public static String updateProduct(int productId,String productPrice){
    	String sql = "update eshop as e set e.productPrice ="+productPrice+
    			" where e.productId="+productId;
    	
    	try{
    		Connection con = getConnection();
    		Statement stmt = con.createStatement();
    		int i = stmt.executeUpdate(sql);
    		if(i>0){
    			return "Product updated successfully";
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "Something went wrong";
    	
    }
    
    public static String deleteProduct(int productId){
    	String sql = "delete from eshop where productId="+productId;
    	try{
    		Connection con = getConnection();
    		Statement stmt = con.createStatement();
    		int i = stmt.executeUpdate(sql);
    		if(i>0){
    			return "Product deleted successfully";
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "Something went wrong";
    }
    
	public static void main(String[] args) {
		//System.out.println(getConnection());
		//System.out.println(getTable());
         //System.out.println(addProduct());
		
		//getProductById(101);
		//getAll();
		
		//System.out.println(updateProduct(102, "78000"));
		System.out.println(deleteProduct(102));
		getAll();
		
	}

}
