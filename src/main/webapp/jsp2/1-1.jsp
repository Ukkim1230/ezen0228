<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
이 페이지는 1-1.jsp
<%
List<Map<String,String>> list = (List<Map<String, String>>) request.getAttribute("list");
//(List<Map<String, String>>)캐스팅 request.getAttribute("list");
for(Map<String, String> map : list){
	out.println(map+"<br>");
}
%>