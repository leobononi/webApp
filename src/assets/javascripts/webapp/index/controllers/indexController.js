//= wrapped

(function() {

    angular
        .module("webapp.index")
        .controller("IndexController", ['$rootScope',IndexController]);   

    function IndexController($rootScope) {
        var vm = this;        
    }
}());