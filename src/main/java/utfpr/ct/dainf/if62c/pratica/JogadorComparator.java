/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author askoda
 */
public class JogadorComparator implements Comparator<Jogador> {
    private boolean geral;
    private boolean numero;
    private boolean nome;
    
    public JogadorComparator() {
        this.geral = true;
        this.numero = true;
        this.nome = true;
    }
    
    public JogadorComparator(boolean geral, boolean numero, boolean nome) {
        this.numero = geral;
        this.numero = numero;
        this.nome = nome;
    }
    
        @Override
    public int compare(Jogador jogador1, Jogador jogador2) {
        
        if(geral) {
            if(comparaNumero(jogador1.numero, jogador2.numero) == 0)
                return comparaNome(jogador1.nome, jogador2.nome);
            return comparaNumero(jogador1.numero, jogador2.numero);
        }
        else {
            if(comparaNome(jogador1.nome, jogador2.nome) == 0)
                return comparaNumero(jogador1.numero, jogador2.numero);
            return comparaNome(jogador1.nome, jogador2.nome);
        }
    }
    
    public int comparaNome(String n1, String n2) {
        if(n1.length() < n2.length()) {
            for(int i = 0; i <= n1.length(); i++) {
                if(n1.charAt(i) < n2.charAt(i)) {
                    if(nome)
                        return -1;
                    else
                        return 1;
                }
                if(n1.charAt(i) > n2.charAt(i)) {
                    if(nome)
                        return 1;
                    else
                        return -1;
                }
            }
        }
        else {
            for(int i = 0; i < n2.length(); i++) {
                if(n1.charAt(i) < n2.charAt(i)) {
                    if(nome)
                        return -1;
                    else
                        return 1;
                }
                if(n1.charAt(i) > n2.charAt(i)) {
                    if(nome)
                        return 1;
                    else
                        return -1;
                }
            }
        }
        
        return 0;
    }
    
    public int comparaNumero(int n1, int n2) {
        if(nome)
            return n1 - n2;
        else
            return (n1 - n2)*-1;
    }
    
}
