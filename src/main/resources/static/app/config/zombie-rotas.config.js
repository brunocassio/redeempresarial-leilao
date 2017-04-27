'use strict';

zombieApp.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise("/list-produtos");

    $stateProvider
        .state('listProdutos', {
            url: '/list-produtos',
            templateUrl: 'app/views/produto/list-produtos.html',
            controller: 'ListProdutosController'
        })


}]);