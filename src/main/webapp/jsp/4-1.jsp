<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
page : <%=pageContext.getAttribute("name")%><br>
request : <%=request.getAttribute("name")%><br>
session : <%=session.getAttribute("name")%><br>
application : <%=application.getAttribute("name")%><br>