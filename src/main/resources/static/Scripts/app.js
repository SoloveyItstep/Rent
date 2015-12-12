var app = angular.module("Categories",['ngRoute']);

app.config(['$routeProvider',function($routeProvider){
        $routeProvider.when("/products/:id",{
            templateUrl: "/productsHtml",
            controller: "ProductsController",
        })
         .when("/prod/:id",{
            templateUrl: "/productHtml",
            controller: "OneProductController"
         })
        .when("/",{
            templateUrl: "/productsHtml",
            controller: "ProductsController"
        })
            .when("/auth/authorize",{
                templateUrl: ""
            })
        .otherwise({
        redirectTo: '/'
    });
}]);
