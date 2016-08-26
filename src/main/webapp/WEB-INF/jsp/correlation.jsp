<%--
  Created by IntelliJ IDEA.
  User: manikandan.nagarajan
  Date: 7/16/16
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Correlation</title>
    <script src="<%=request.getContextPath()%>/resources/lib/js/jquery-1.11.1.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/bootstrap.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/angular.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/correlation.js"></script>
</head>
<body ng-app="correlationApp" ng-controller="CorrelationController">
Welcome to Correlation
<form name="name" ng-submit="submitForm()">
    <label>Enter column1 name: <input type="text" ng-model="column1"></label><br>
    <label>Enter column2 name: <input type="text" ng-model="column2"></label><br>
    <input type="radio" name="operation" value="pearson" ng-model="correlation.operation" checked> Pearson<br>
    <input type="radio" name="operation" value="spearman" ng-model="correlation.operation"> Spearman<br>
    <button type="submit">Correlation</button>
</form>
</body>
</html>
