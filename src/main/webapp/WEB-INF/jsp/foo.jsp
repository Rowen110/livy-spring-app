<%--
  Created by IntelliJ IDEA.
  User: manikandan.nagarajan
  Date: 7/16/16
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <script src="<%=request.getContextPath()%>/resources/lib/js/jquery-1.11.1.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/bootstrap.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/angular.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/another.js"></script>
</head>
<body ng-app="examplesApp" ng-controller="WelcomeController">
<b>WELCOMEEE</b>
<div>
    <form name="name" ng-submit="submitForm()">
        <input type="radio" name="operation" value="kdensity" ng-model="example.operation" checked> Kernel Density<br>
        <input type="radio" name="operation" value="correlation" ng-model="example.operation"> Correlation<br>

        <button type="submit">Send Away!</button>
    </form>
</div>

</body>
</html>
