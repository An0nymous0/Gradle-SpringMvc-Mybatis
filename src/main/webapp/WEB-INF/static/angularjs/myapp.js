angular.module('demoService', [])
    .controller('demoController', function ($scope, $http) {
        $http.get("/rest")
            .success(function(data) {$scope.name = data.name;});

    });
