//= wrapped
(function() {
    
    angular.module("webapp.user")
		.config(function($stateProvider, $urlRouterProvider){
			
			$stateProvider
				.state('user', {
					url: "/user/list",
					templateUrl: '/assets/webapp/user/templates/user.html',
					controller: "UserListController as ctrl"	
				})
				.state('user-create', {
					url: "/user/create",
					templateUrl: '/assets/webapp/user/templates/create.html',
					controller: "UserCreateController as ctrl"	
				})
		});

}());