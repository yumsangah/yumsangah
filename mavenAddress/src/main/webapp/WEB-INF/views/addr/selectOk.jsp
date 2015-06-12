<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="root" value="${pageContext.request.contextPath }"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록</title>
</head>
<body>
	<%-- <jsp:include page="${root }/view/addr/index.jsp"/><br/><br/> --%>
	
	<c:if test="${addr==null }">
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="300">
			<tr>
				<td height="30">해당 데이터가 존재하지 않습니다.</td>
			</tr>	
		</table>
	</c:if>
	
	<c:if test="${addr!=null }">
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="300">
			<tr>
				<td height="30"> 이름</td>
				<td height="30">
					<input type="hidden" name="num" value="${addr.num }"/>
					<input type="text" name="name"  value="${addr.name }" disabled="disabled" />
				</td>
			</tr>
			
			<tr>
				<td height="30">전화번호</td>
				<td height="30">
					<input type="text" name="phone" value="${addr.phone }" disabled="disabled"/>
				</td>
			</tr>
			
			<tr>
				<td height="30">이메일</td>
				<td height="30">
					<input type="text" name="email" value="${addr.email }" disabled="disabled"/>
				</td>
			</tr>
		</table>
	</c:if>
</body>
</html>