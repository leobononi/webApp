//= wrapped
//= require /angular/angular
//= require /angular/angular-resource
//= require /angular/angular-ui-router
//= require_self
//= require_tree services

(function() {
    angular.module("webapp.core", ['ngResource', 'ui.router']); 
}());