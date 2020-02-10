<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! Date Today = new Date();
		SimpleDateFormat JpFormat = new SimpleDateFormat("yyyy年MM月dd日");

		int AccessCount = 0;
 	%>

	<p><% out.print("訪問回数： " + AccessCount++); %></p>
 	<p><%= "今日の日付： " + JpFormat.format(Today) %></p>
</body>

</html>
