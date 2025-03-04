<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
http://localhost/jsp2/5.jsp?name=홍길동&nmae=김철수
물음표(?)를 기준으로
왼쪽(http://localhost/jsp2/5.jsp)이 요청주소
오른쪽(name=홍길동&nmae=김철수)이 key=value들인데
현재는 name이라는 키값으로 value 2개를 보낸상황
*/
String[] names = request.getParameterValues("name");
%>
request.getParameterValues : <%
for(String name : names){
	out.print(name + ",");	
}
%>

<br>
paramValues.name : ${paramValues.name[0]},${paramValues.name[1]}<br>