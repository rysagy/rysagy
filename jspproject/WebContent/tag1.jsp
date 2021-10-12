<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   
<!-- 선언태그 -->
    
<%!
    public int add(int a, int b){
	     int c = a+b;
	     return c;
    } 
    public int subtract(int a,int b){
    	int c= a-b;
    	return c;
    }
    public int multiply(int a, int b){
    	int c = a*b;
    	return c;
    }
%>
<% 
     int result1 = add(3,9); 
     int result2 = subtract(3,9);
     int result3 = multiply(10,25);

%>    
    
    3+9=<%= result1 %> <br>
    3-9=<%= result2 %> <br>
    10*25=<%= result3 %> <br>
    10*25=<%= multiply(10,25) %> <br>

    
    
    
    
    
    
    
    
    
    