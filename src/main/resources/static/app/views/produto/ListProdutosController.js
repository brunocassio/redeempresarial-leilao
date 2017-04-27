'use strict';

zombieApp.controller("ListProdutosController", ['$scope', '$http', '$state', 'ProdutoService',
    function ($scope, $http, $state, ProdutoService) {

        $scope.listaProdutos = [];
        $scope.produto = {};
        $scope.saldo = 0.00;

    $scope.executar = function () {
        ProdutoService.listarProdutos().then(function (result) {
            if(result && result.plain()){
                $scope.listaProdutos = result.plain();
            }else{
                console.log('A lista está vazia!');
            }
        })
    };

    function calcSaldo(produtos) {
        var valorGasto = 0.0;
        var verba = 0.0;

        produtos.forEach(function (entry) {
            if(entry.valorCliente > 0){
                valorGasto += entry.valorFinal;
            }
        });

       $scope.saldo = verba - valorGasto;
    }

    $scope.bid = function (produto) {
        ProdutoService.bid(produto).then(function (result) {

            if(result && result.plain()){
                $scope.listaProdutos = result.plain();
                calcSaldo($scope.listaProdutos);
            }else{
                console.log('produto vazio')
            }
        })
    };

    }]);


