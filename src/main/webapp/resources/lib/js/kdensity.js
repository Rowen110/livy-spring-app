/**
 * Created by manikandan.nagarajan on 7/16/16.
 */
var app = angular.module('kdensityApp', [])
app.controller('KernelDensityController', function($scope, $http) {

    console.log("value::", $scope.name)
    
    $scope.submitForm = function() {
        console.log("submit called in kernel density")
        console.log("new-value::", $scope.name)
        var url = "http://localhost:8090/kdensity/function?" + "column=" + $scope.name
        window.location = url
    }
});