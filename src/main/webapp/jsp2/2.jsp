<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
디렉티브(지시자)
page,include,taglib
-->
<%@ include file="/jsp2/sub/head.jsp"%>
난 2.jsp입니다.
<!--
jsp 액션태그 include
-->
<jsp:include page="/jsp2/sub/bottom.jsp" />
</body>
</html>