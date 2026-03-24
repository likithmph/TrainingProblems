<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri = "jakarta.tags.core" prefix= "c" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<c:forEach var="a" begin="1" end = "10">
<c:out value="${a}"></c:out>
</c:forEach>
<br>
<%
List<String> listNames = Arrays.asList("Rohit","Virat","Dhoni","SKY");
application.setAttribute("names", listNames);
%>
<c:forEach items="${names}" var="data"><br>
<c:out value="${data}"><br></c:out>
</c:forEach>
<br><br>
<c:set var="age" value="${19 }"> </c:set>
<c:out value="${age }"></c:out>
<c:choose>

<c:when test="${age == 18 }">
<c:out value="Just Eligible"></c:out>
</c:when>
<c:when test="${age > 18 }">
<c:out value="Eligible"></c:out>
</c:when>
<c:otherwise>
<c:out value="Not Eligible"></c:out>
</c:otherwise>
</c:choose>
<br><br>
<c:forTokens items="Rohit,Virat,Kohli,SKY,Axar.All are Players-for-India" delims=",.-" var="names">
<c:out value="${names }"></c:out>
</c:forTokens>
</body>
</html>