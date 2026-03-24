<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="jakarta.tags.functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Functions Tags</h1>
<c:set value="Spring FrameWork is frameworks supports Ai" var="data"></c:set>
<c:out value="${data }"></c:out>
<c:if test="${fn:contains(data, 'supports') }">
<p>In the data varialbles contains SUPPORTS  keyWord.</p>
</c:if>
<c:if test="${fn:contains(data, 'frameworks') }">
<p>In the data varialbles contains <b>frameworks</b>  keyWord.</p>

</c:if>
<c:if test="${fn:containsIgnoreCase(data, 'frameworks') }">
<p>In the data varialbles Ignore Case <b>frameworks</b>  keyWord.</p>

</c:if>
<c:out value="${fn:toUpperCase(data) }"></c:out>
</body>
</html>