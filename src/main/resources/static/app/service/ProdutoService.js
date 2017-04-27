'user strict';

zombieApp.service('ProdutoService', ['ProdutoRepository',
    function (ProdutoRepository) {

        return {
            listarProdutos: function () {
                return ProdutoRepository.listarProdutos();
            },
            bid: function (produto) {
                return ProdutoRepository.bid(produto);
            }

        }
    }]);