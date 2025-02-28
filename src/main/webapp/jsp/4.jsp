<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%="안녕하세요"%>
<%
//RequestDispatcher 
pageContext.setAttribute("name", "page");
request.setAttribute("name", "request");
session.setAttribute("name", "session");
application.setAttribute("name", "application");

RequestDispatcher rd = request.getRequestDispatcher("/jsp/4-1.jsp");
rd.forward(request, response);
System.out.println("안녕하세요");
%>