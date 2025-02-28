<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/* Map<String,String>을 3개 만들고 각각의 값은
name=홍길동, age =22
name=유관순, age =33
name=임꺽정, age =40
이 map들을 list에 저장한 후
해당 list를 request scope에 저장합니다.
6-1.jsp로 포워딩 시킨뒤에
6-1.jsp에서 해당 list를 반복문으로 출력해주시면 됩니다.
*/ 
%>
<%
List<Map<String, String>> list = new ArrayList<>();

Map<String,String> map1 = new HashMap<>();
map1.put("name","홍길동");
map1.put("age", "22");

Map<String,String> map2 = new HashMap<>();
map2.put("name", "유관순");
map2.put("age", "33");

Map<String,String> map3 = new HashMap<>();
map3.put("name", "임꺽정");
map3.put("age", "40");

list.add(map1);
list.add(map2);
list.add(map3);

request.setAttribute("list", list);
RequestDispatcher rd = request.getRequestDispatcher("/jsp/6-1.jsp");
rd.forward(request, response);
%>
