package com.redeempresarial.leilao.web;

import com.redeempresarial.leilao.domain.Produto;
import com.redeempresarial.leilao.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by brunocassio on 25/04/17.
 */
@RestController
public class GloboController {

    private ProdutoService produtoService;

    @Autowired
    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @RequestMapping(value = "/globo/executar",
                    method = RequestMethod.GET,
                    produces = "application/json")
    public List<Produto> executar(){
        return produtoService.listarProdutos();
    }

    @RequestMapping(value = "/globo/bid",
            method = RequestMethod.POST,
            produces = "application/json")
    public List<Produto> bid(@RequestBody Produto produto){
        return produtoService.bid(produto);

    }
}
