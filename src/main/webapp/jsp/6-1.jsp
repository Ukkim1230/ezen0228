<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<Map<String, String>> list = (List<Map<String, String>>) request.getAttribute("list");
for(Map<String, String> map : list){
	out.println(map+"<br>");
}
%>