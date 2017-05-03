
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
public class EmbaralhadorMedio extends EmbaralhadorAbstrato{

    @Override
    protected List<List<String>> separarPalavras(List<String> palavras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Character[][] embaralharVertical(Character[][] tabuleiro, List<String> palavras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Character[][] embaralharHorizontal(Character[][] tabuleiro, List<String> palavras) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Character[][] embaralharDiagonal(Character[][] tabuleiro, List<String> palavras) {
        return tabuleiro;
    }
    
}
