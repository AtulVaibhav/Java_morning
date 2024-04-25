package com.learning.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
    public static void multipleStatements() throws SQLException{
    	String sql1 = "insert into eshop values(101,'p1',34000)";
    	String sql2 = "insert into eshop values(102,'p2',44000)";
    	String sql3 = "insert into eshop values(103,'p3',54000)";
    	String sql4 = "insert into eshop values(104,'p4',64000)";
    	
    	Connection con = ConnectionCode.getConnection();
    	Statement stmt = con.createStatement();
    	stmt.addBatch(sql1);
    	stmt.addBatch(sql2);
    	stmt.addBatch(sql3);
        stmt.addBatch(sql4);
        
        int[] rows = stmt.executeBatch();
        if(rows.length>0){
        	System.out.println(rows.length+ " affected");
        }else{
        	System.out.println("Soething went wrong");
        }
        
    }
	public static void main(String[] args) throws SQLException {
		multipleStatements();

	}

}
