var app = angular.module("AdminApp",["ngRoute"]);

app.config(['$routeProvider',function($routeProvider) {
    $routeProvider.when("/categories", {
            templateUrl: "/addcategoriesHtml",
            controller: "AdminController",
        })
        .when("/addcategory", {
            templateUrl: "addcategoryHtml",
            controller: "AdminController"
        })
        .when("/editcategory/:id", {
            templateUrl: "editcategoryHtml",
            controller: "EditCategoryController"
        })
        .when("/deletecategory/:id",{
            templateUrl: "/deletecategoryHtml",
            controller: "EditCategoryController"
        })
        .when("/removecategory/:id",{
            templateUrl: "removecategoryHtml",
            controller: "AdminController"
        })
        .when("/subcategories",{
            templateUrl: "/subcategoriesHtml",
            controller: "AdminController"
        })
        .when("/addsubcategory/:id", {
            templateUrl: "/addsubcategoryHtml",
            controller: "CreateSubcategoryController"
        })
        .when("/editsubcategory", {
            templateUrl: "editsubcategoryHtml",
            controller: "EditCategoryController"
        })
        .when("/addproduct", {
            templateUrl: "/addproductHtml",
            controller: "AdminController"
        })
        .when("/editproduct", {
            templateUrl: "editproductHtml",
            controller: "AdminController"
        })
        .when("/products", {
            templateUrl: "/addproductsHtml",
            controller: "AdminController"
        })
        .otherwise({
            redirectTo: '/admin'
        });
}]);