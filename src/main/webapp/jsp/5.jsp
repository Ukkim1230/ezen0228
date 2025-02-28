<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<String> list = new ArrayList<>();
list.add("대한민국");
list.add("중국");
list.add("미국");
list.add("태국");

request.setAttribute("list", list);
RequestDispatcher rd = request.getRequestDispatcher("/jsp/5-1.jsp");
rd.forward(request, response);
%>