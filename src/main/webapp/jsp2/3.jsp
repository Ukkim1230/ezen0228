<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("name", "page");
request.setAttribute("name", "request");
session.setAttribute("name", "session");
application.setAttribute("name", "application");
%>
<h3>표현식으로 scope값 출력</h3>
page : <%=pageContext.getAttribute("name")%><br>
request : <%=request.getAttribute("name") %><br>
session : <%=session.getAttribute("name") %><br>
application : <%=application.getAttribute("name") %><br>

<h3>el태그로 scope값 출력</h3>
page : ${pageScope.name}<br>
request : ${requestScope.name}<br>
session : ${sessionScope.name}<br>
application : ${applicationScope.name}<br>
<%=pageContext.getAttribute("name")%><!-- page --><br>
<%//${requestScope.name}<!--page,request,session,application 키값만 출력 변수명x -->%>
