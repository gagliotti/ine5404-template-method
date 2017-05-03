
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin.vigil
 */
public class EmbaralhadorFacil extends EmbaralhadorAbstrato {

    @Override
    protected List<List<String>> separarPalavras(List<String> palavras) {
        List<List<String>> retorno = new ArrayList<>();
        
        retorno.add(palavras);
        retorno.add(null);
        retorno.add(null);
        
        return retorno;
        
    }

    @Override
    protected Character[][] embaralharHorizontal(Character[][] tabuleiro, List<String> palavras) {
        //embaralha palavras da lista dentro do tabuleiro
        ///
        
        return tabuleiro;
    }
    
}
