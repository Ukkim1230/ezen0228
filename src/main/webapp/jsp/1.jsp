<%//Directive 지시자 : <%@ %>
<%//종류 : <%@page, <%@include, <%@taglib %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%//Declaration 선언부 : <%!%>
<%!
int i = 1;
public void test(){
	
}
%>
<%//EXpression 표현식 : <%= %>
<%="asdfasdf"%>

<%//Scriptlet : <% %>
<%
int i = 1;
out.println(i);
%>