//= wrapped

(function() {

    angular
        .module("webapp.user")
        .controller("UserListController", ['userService',UserListController])
        .controller("UserCreateController", ['userService', '$stateParams','$location', '$scope', UserCreateController])

    function UserListController(userService) {
        var self = this;
        
    	userService.list(function(response){            	
    		self.users = response;
        });
    }
    
    function UserCreateController(userService, $routeParams, $location, $scope){
        var self = this;       
    }
}());