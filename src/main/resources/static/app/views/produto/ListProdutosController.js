'use strict';

zombieApp.controller("ListProdutosController", ['$scope', '$http', '$state', 'ProdutoService',
    function ($scope, $http, $state, ProdutoService) {

        $scope.listaProdutos = [];
        $scope.produto = {};

    $scope.executar = function () {
        ProdutoService.listarProdutos().then(function (result) {
            if(result && result.plain()){
                $scope.listaProdutos = result.plain();
            }else{
                console.log('A lista está vazia!');
            }
        })
    };

    $scope.bid = function (produto) {
        ProdutoService.bid(produto).then(function (result) {

            if(result && result.plain()){
                $scope.listaProdutos = result.plain();
            }else{
                console.log('produto vazio')
            }
        })
    };

    }]);


