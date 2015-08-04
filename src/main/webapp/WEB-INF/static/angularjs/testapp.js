angular.module('demoService', [])
    .controller('demoController', function ($scope, $http) {
        $scope.pressMe = function(){
            alert($('#text').val());
        }
        $http.get("/rest")
            .success(function (data) {
                $scope.name = data.name;
            });

    });
