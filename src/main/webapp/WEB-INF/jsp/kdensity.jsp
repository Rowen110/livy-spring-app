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
    <title>Kernel Density</title>
    <script src="<%=request.getContextPath()%>/resources/lib/js/jquery-1.11.1.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/bootstrap.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/angular.js"></script>
    <script src="<%=request.getContextPath()%>/resources/lib/js/kdensity.js"></script>
</head>
<body ng-app="kdensityApp" ng-controller="KernelDensityController">

<b>Welcome to Kernel density</b>
<div>
    <form name="name" ng-submit="submitForm()">
        <label>Enter column name: <input type="text" ng-model="name"></label><br>
        <button type="submit">Kernel Density</button>
    </form>
</div>

</body>
</html>
