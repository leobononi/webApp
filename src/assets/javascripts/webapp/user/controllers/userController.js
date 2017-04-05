//= wrapped

(function() {

    angular
        .module("webapp.user")
        .controller("UserListController", ['userService', '$state', UserListController])
        .controller("UserCreateController", ['userService', '$location', '$stateParams', UserCreateController])

    function UserListController(userService, $state) {
        var self = this;
        
    	userService.list(function(response){            	
    		self.users = response;
        });
    	
    	self.delete = function(user){
            if(confirm("Confirm?")) {
            	userService.delete({action: 'delete',userId:user.id}, user, function (res) {
            		alert("User " + res.id + " - " + res.firstname + " removed!");
            		//$window.location.reload();
            		$state.reload();
                })
            }
        }
    }
    
    function UserCreateController(userService, $location, $routeParams){
        var self = this;  
        
        if($routeParams.userId){
           userService.show({action:'show', userId:$routeParams.userId}, function(response){
        	   self.user = response;
           })
        }  
        
        self.save = function(user){  
        	userService.save({action:'save',userId:null},user,function(res){            	
                if(res.id){
                    alert("Success");
                    $location.path("/user/list");
                }else{
                    alert("Unknown error");
                }
            })
        }
    }
}());