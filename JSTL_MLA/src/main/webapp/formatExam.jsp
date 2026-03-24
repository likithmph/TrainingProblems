<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="jakarta.tags.fmt" prefix="fmt" %>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Format Tags</title>
</head>
<body>
 	<c:set var="today" value = "<%= new Date() %>"></c:set>
 	<p>Time <strong><fmt:formatDate type="time" value="${today }" /></strong></p><br><br>
 	<p>Date <strong><fmt:formatDate type="date" value="${today }"/> </strong></p>
 	<p>Date &amp; Time : <strong><fmt:formatDate type="both" value="${today }"/> </strong></p>
 	<p>Date &amp; Time short :<strong><fmt:formatDate type="both" dateStyle="short" value="${today }"/> </strong> </p>
 	 <p>Date &amp; Time Medium :<strong><fmt:formatDate type="both" dateStyle="medium" value="${today }"/> </strong> </p>
 	 <p>Date &amp; Time Long :<strong><fmt:formatDate type="both" dateStyle="long" value="${today }"/> </strong> </p>
 	 
 	 <p>Date Pattern: <strong><fmt:formatDate pattern="yyyy-MM-dd" value="${today }"/> </strong></p>
 	
</body>
</html>