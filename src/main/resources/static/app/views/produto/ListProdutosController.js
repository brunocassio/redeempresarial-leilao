'use strict';

zombieApp.controller("ListProdutosController", ['$scope', '$http', '$state', 'ProdutoService',
    function ($scope, $http, $state, ProdutoService) {

        $scope.listaProdutos = [];

    $scope.executar = function () {
        ProdutoService.listarProdutos().then(function (result) {
            if(result && result.plain()){
                $scope.listaProdutos = result.plain();
            }else{
                console.log('A lista está vazia!');
            }
        })
    };

    }]);


