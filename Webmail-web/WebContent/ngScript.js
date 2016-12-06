console.log('start ng script');


var myApp = angular.module("myApp" , []);

//myApp.directive('cartemel', function () {
  //  return {
    //    restrict : 'E',
     //   template : '<div class="panel panel-primary">' +
     //   '<div class="panel-heading">Mel</div>' +
     //   '<p>name : {{av.lastName}}</p><p>prénom: {{av.firstName}}</p>' +
     //   '</div>'
   // };
//});


myApp.controller("myCtrl", function($scope, $http) {
    init($scope, $http);
    $scope.remove = function(id) {
        deleteMel(id,$http,$scope);
    }

});

myApp.controller("myCtrl2", function($scope, $http) {
    getMel(194, $scope, $http);

});


