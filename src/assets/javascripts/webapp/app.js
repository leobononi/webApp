//= wrapped
//= require /webapp/core/webapp.core
//= require /webapp/user/webapp.user
//= require /webapp/index/webapp.index

(function() {
    angular.module("webapp", [
        "ui.router",
        "webapp.core",
        "webapp.index",
        "webapp.user"
    ])
}());