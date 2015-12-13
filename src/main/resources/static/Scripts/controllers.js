var controllerApp = angular.module("Categories");
controllerApp.controller("CategoriesController",function($scope,$http) {
                $http.get("/categories").success(function(categories){
                    $scope.categories = categories;
                    console.log(categories);
                });

                $http.get("/products/"+6).success(function(products){
                    $scope.products = products;
                    console.log(products);
                });

            });

controllerApp.controller("ProductsController",["$scope","$http","$routeParams",function($scope,$http,$routeParams){
    if($routeParams.id === undefined){
        $routeParams.id = 6;
    }
                $http.get("/products/"+$routeParams.id).success(function(products){
                    $scope.products = products;
                    console.log(products);
                });

            }]);

controllerApp.controller("OneProductController",["$scope","$http","$routeParams",function($scope,$http,$routeParams){
    $http.get("/product/"+$routeParams.id).success(function(product){
        $scope.product = product;
        console.log(product);
    });
}]);
