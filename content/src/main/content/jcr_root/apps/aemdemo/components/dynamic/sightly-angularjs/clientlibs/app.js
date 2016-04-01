(function () {

    'use strict';

    angular.module('app', ['ngRoute'])

        .config(function($routeProvider) {

            $routeProvider.when('/view1',{

                controller:'Controller1',

                templateUrl:'/view1.tpl' // The ng-template id

            })

                .when('/view2', {

                    templateUrl: '/view2.tpl',

                })

        });

})();