require.config({
    //配置angular的路径
    paths:{
        "angular":"../angularjs/angular.min",
        "angularRoute":"../angularjs/angular-resource.min",
        "bootstrap":"../bootstrap/js/bootstrap.min",
    },
    //这个配置是你在引入依赖的时候的包名
    shim:{
        "angular":{
            exports:"angular"
        },
        "angular-route":{
            exports:"angular-route"
        }
    }
})

define(["angular","angularRoute"],function(angular){
    return angular.module('demoService', [])
        .controller('demoController', function ($scope, $http) {
            //$scope.pressMe = function(){
            //    alert('1')
            //}
            $http.get("/rest")
                .success(function (data) {
                    $scope.name = data.name;
                });

        });
})