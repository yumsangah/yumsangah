<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>주소록</title>
</head>
<body>
	<c:set var="root" value="${pageContext.request.contextPath }"/>
	<br/><br/>
	
	
	<a href="${root }/addr/write.do">주소록 작성</a> &nbsp;&nbsp;
	<a href="${root }/addr/select.do">주소록 검색</a> &nbsp;&nbsp;
	<a href="${root }/addr/delete.do">주소록 삭제</a> &nbsp;&nbsp;
	<a href="${root }/addr/update.do">주소록 수정</a>
</body>
</html>