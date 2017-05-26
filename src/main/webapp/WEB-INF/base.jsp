<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html ng-app="app">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" rel="stylesheet" >
	
</head>

<body>

	<div id="main" role="main">
	    <tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="body"/>
	</div>
	
	<script src="${pageContext.request.contextPath}/assets/js/lib/angular.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/lib/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/lib/bootstrap.min.js"></script>
	
	<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/controller/site-controller.js"></script>
	
</body>
</html>