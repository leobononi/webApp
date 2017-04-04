//= wrapped

(function() {

    angular
        .module("webapp.user")
        .factory("userService", userService);
    
    function userService(DomainServiceFactory) {
        return DomainServiceFactory('/user/:action/:userId',{userId:'@id',action:'@action'},
            {"show": {method: "GET"}},
            {"save": {method: "POST"}},
            {"delete": {method: "DELETE"}}
        );
    }
    
}());