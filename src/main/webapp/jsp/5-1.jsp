<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<String> list = (List<String>) request.getAttribute("list");
for(String str : list){
	out.println(str + "<br>");
}
%>