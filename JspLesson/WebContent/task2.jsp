<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
	<%! int NumA = 125;
		int NumB = 15;
		int NumC = 17;
		int NumD = 21;
		int NumE(int NumA, int NumB) {
			return NumA - NumB;
		}
	%>

	<P><%= NumA + "-" + NumB + "=" + NumE(NumA, NumB) %></P>
	<P><%= NumC + "-" + NumD + "=" + NumE(NumC, NumD) %></P>


</body>
</html>