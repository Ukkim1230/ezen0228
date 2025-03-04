<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//jsp 액션태그
//1.jsp 액션태그는 앞에 <jsp: 로 시작
//2. forward 액션태그
request.setAttribute("name", "request");
//6.jsp와 똑같은데 5개의 map을 만들고
//그 값은
// name=홍길동,age=30,고향=서울
// name=김철수,age=20,고향=대전
// name=홍철이,age=41,고향=대구
// name=박철수,age=22,고향=부산
// name=천둥이,age=33,고향=광주
// 위에서 만들어진 map을 list에 담아 1-1.jsp에서
// 출력해주시면 됩니다.
List<Map<String,String>> list = new ArrayList<>();

Map<String,String> map1 = new HashMap<>();
map1.put("name", "홍길동");
map1.put("age", "30");
map1.put("고향", "서울");

Map<String,String> map2 = new HashMap<>();
map2.put("name", "김철수");
map2.put("age", "20");
map2.put("고향", "대전");

Map<String,String> map3 = new HashMap<>();
map3.put("name", "홍철이");
map3.put("age", "41");
map3.put("고향", "대구");

Map<String,String> map4 = new HashMap<>();
map4.put("name", "박철수");
map4.put("age", "22");
map4.put("고향", "부산");

Map<String,String> map5 = new HashMap<>();
map5.put("name", "천둥이");
map5.put("age", "33");
map5.put("고향", "광주");

list.add(map1);
list.add(map2);
list.add(map3);
list.add(map4);
list.add(map5);

request.setAttribute("list", list);
%>
<jsp:forward page ="/jsp2/1-1.jsp" />