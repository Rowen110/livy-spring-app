/**
 * Created by manikandan.nagarajan on 7/16/16.
 */
var app = angular.module('examplesApp', [])
app.controller('WelcomeController', function($scope, $http) {

    $scope.example = {
        operation: "kdensity",
    };
    console.log("value::", $scope.example.operation)


    $scope.submitForm = function() {
        console.log("submit called")
        console.log("new-value::", $scope.example.operation)
        var url = "http://localhost:8090/" + $scope.example.operation
        window.location = url
    }
});