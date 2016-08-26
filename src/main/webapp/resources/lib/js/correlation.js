/**
 * Created by manikandan.nagarajan on 7/16/16.
 */
var app = angular.module('correlationApp', [])
app.controller('CorrelationController', function($scope, $http) {

    $scope.submitForm = function() {
        console.log("submit called correlation")
        console.log("value1::", $scope.column1)
        console.log("value2::", $scope.column2)
        console.log("operation::", $scope.correlation.operation)
        var url = "http://localhost:8090/correlation/result"
        window.location = url
    }
});