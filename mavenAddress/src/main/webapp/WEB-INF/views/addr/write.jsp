<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="root" value="${pageContext.request.contextPath }"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${root }/css/addr/addr.css"/>
<script type="text/.javascript" src="${root }/css/addr/addr.js"></script>
<title>주소록 작성</title>
</head>
<body>	
	
	<form action="${root }/addr/write.do" method="post" onsubmit="return checkForm(this)">
			<table border="0" align="center" cellpadding="0" cellspacing="0" 
					width="300">
				<tr>
					<td height="30"> 이름</td>
					<td height="30">
						<input type="text" name="name"/>
					</td>
				</tr>
				
				<tr>
					<td height="30">전화번호</td>
					<td height="30">
						<input type="text" name="phone"/>
					</td>
				</tr>
				
				<tr>
					<td height="30">이메일</td>
					<td height="30">
						<input type="text" name="email"/>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center" height="30">
						<input type="submit" value="주소록작성"/>
						<input type="reset" value="취소"/>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>