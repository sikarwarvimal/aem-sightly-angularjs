function Controller1($scope){
    //initialize variables of the scope
    $scope.firstname = "empty";
    $scope.lastname = "empty";
    //eject ng-click
    $scope.loadView2 = function() {
        alert('The values of the scope of the template: '+$scope.firstname+' , '+$scope.lastname+'');
    }
}