/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;

/**
 *
 * @author martin
 */
public abstract class EmbaralhadorAbstrato {
    public final Character[][] embaralhar(List<String> palavras, int linhas, int colunas){
        List<List<String>> palavrasSeparadas = this.separarPalavras(palavras);
        
        Character[][] tabuleiro = new Character[linhas][colunas]; //cria tabuleiro vazio
        
        this.embaralharHorizontal(tabuleiro, palavrasSeparadas.get(0));
        this.embaralharVertical(tabuleiro, palavrasSeparadas.get(1));
        this.embaralharDiagonal(tabuleiro, palavrasSeparadas.get(2));
        
        this.completarComLetrasAleatorias(tabuleiro);
        
        return tabuleiro;
    }
    
    //retorna um array contendo 3 listas: palavras na horizontal, palavras na vertical e palavras na diagonal
    protected abstract List<List<String>> separarPalavras(List<String> palavras);
    
    protected Character[][] embaralharVertical(Character[][] tabuleiro, List<String> palavras){
        return tabuleiro;
    }
    
    protected Character[][] embaralharHorizontal(Character[][] tabuleiro, List<String> palavras)
    {
        return tabuleiro;
    }
    
    protected Character[][] embaralharDiagonal(Character[][] tabuleiro, List<String> palavras)
    {
        return tabuleiro;
    }
            
    protected final Character[][] completarComLetrasAleatorias(Character[][] tabuleiro){
        //completa posicoes nulas com caracteres aleatorios
        
        return tabuleiro;
    }
}
