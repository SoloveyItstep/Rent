var app = angular.module("AdminApp",["ngRoute"]);

app.config(['$routeProvider',function($routeProvider) {
    $routeProvider.when("/addcategories", {
            templateUrl: "/addcategoriesHtml",
            controller: "AdminController",
        })
        .when("/addcategory", {
            templateUrl: "addcategoryHtml",
            controller: "AdminController"
        })
        .when("/addsubcategory", {
            templateUrl: "/addsubcategoryHtml",
            controller: "AdminController"
        })
        .when("/addproduct", {
            templateUrl: "/addproductHtml",
            controller: "AdminController"
        })
        .when("/editproduct", {
            templateUrl: "editproductHtml",
            controller: "AdminController"
        })
        .when("/addproducts", {
            templateUrl: "/addproductsHtml",
            controller: "AdminController"
        })
        .otherwise({
            redirectTo: '/'
        });
}]);