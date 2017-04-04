//= wrapped

(function() {  
	angular.module("webapp.index")
	.config(function($stateProvider, $urlRouterProvider){
		$urlRouterProvider.otherwise('/');
		$stateProvider
			.state('index', {
				url: "/",
				templateUrl: '/assets/webapp/index/templates/welcome.html',
				controller: 'IndexController as vm'	
			})	
		});
}());