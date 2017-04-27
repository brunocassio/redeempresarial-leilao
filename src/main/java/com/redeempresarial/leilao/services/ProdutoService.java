package com.redeempresarial.leilao.services;

import com.redeempresarial.leilao.domain.Produto;

import java.util.List;

/**
 * Created by brunocassio on 25/04/17.
 */
public interface ProdutoService {

    List<Produto> listarProdutos();

    List<Produto> bid(Produto produto);
}
