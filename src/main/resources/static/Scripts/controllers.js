var controllerApp = angular.module("Categories");
controllerApp.controller("CategoriesController",function($scope,$http) {
    console.log("=============================CategoriesController1");
                $http.get("/categories").success(function(categories){
                    $scope.categories = categories;
                    console.log(categories);
                    console.log("=============================CategoriesController2");
                });

                $http.get("/products/"+6).success(function(products){
                    $scope.products = products;
                    console.log(products);
                    console.log("=============================CategoriesController-Products");
                });

            });

controllerApp.controller("ProductsController",["$scope","$http","$routeParams",function($scope,$http,$routeParams){
    console.log("=============================ProductsController");
    console.log("aaaaaaaaaa== "+$routeParams.id);
    if($routeParams.id === undefined){
        console.log("==========undefined");
        $routeParams.id = 6;
    }
                $http.get("/products/"+$routeParams.id).success(function(products){
                    $scope.products = products;
                    console.log(products);
                    console.log("=============================");
                });

            }]);

controllerApp.controller("OneProductController",["$scope","$http","$routeParams",function($scope,$http,$routeParams){
    console.log("=======OneProductController========"+$routeParams.id);

    $http.get("/product/"+$routeParams.id).success(function(product){
        $scope.product = product;
        console.log(product);
        console.log("=============================");
    });
}]);
