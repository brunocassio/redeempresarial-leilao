package com.redeempresarial.leilao.services;

import com.redeempresarial.leilao.domain.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brunocassio on 25/04/17.
 */
@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Override
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("06:00 a 7:30", "BOM DIA PRACA", 1902.40, 27.38, 122, 83205, 68000, 8.21, 14.54, 570.72));
        produtos.add(new Produto("7:30 a 8:30", "BOM DIA BRASIL", 2839.20, 28.38, 123, 120647, 99017, 8.51, 10.30, 851.76));
        produtos.add(new Produto("10:10 a 10:50", "BEM ESTAR", 1768.80, 25.38, 119, 90931, 72175, 7.62, 0.0, 530.64));
        produtos.add(new Produto("12:50 a 13:20", "GLOBO ESPORTE", 6079.20, 35.86, 114, 219899, 168409, 10.76, 0.0, 1823.76));
        produtos.add(new Produto("13:20 a 14:00", "JORNAL HOJE", 6028.80, 35.63, 118, 221385, 174970, 10.69, 0.0, 1808.64));
        produtos.add(new Produto("15:00 -18:00", "VIDEO SHOW", 3188.80, 23.28, 110, 184240, 135801, 6.98, 0.0, 956.64));
        produtos.add(new Produto("17:55 a 18:30", "MALHACAO", 4094.40, 19.15, 103, 294783, 203801, 5.74, 0.0, 1228.32));
        produtos.add(new Produto("18:00 - 23:00", "NOVELA I", 6141.60, 25.49, 109, 331928, 242772, 7.65, 0.0, 1842.48));
        produtos.add(new Produto("19:35 a 20:30", "NOVELA II", 8966.40, 31.08, 111, 401761, 298643, 9.32, 0.0, 2689.92));
        produtos.add(new Produto("21:10 a 22:15", "NOVELA III", 16560.00, 58.57, 119, 379474, 300830, 17.57, 0.0, 4968.0));
        produtos.add(new Produto("23:00 - 06:00", "JORNAL DA GLOBO", 4012.80, 42.40, 105, 120053, 84304, 12.72, 0.0, 1203.84));
        produtos.add(new Produto("00:20 a 01:05", "SERIES AMERICANAS", 1360.00, 19.63, 101, 87960, 59251, 5.89, 0.0, 408.0));
        produtos.add(new Produto("05:00 a 06:00", "HORA UM", 662.40, 20.48, 112, 43980, 33006, 6.14, 0.0, 198.72));
        return produtos;
    }
}
