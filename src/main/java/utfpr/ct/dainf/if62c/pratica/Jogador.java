/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author kiqdestro
 */
public class Jogador implements Comparable<Jogador> {
    int numero;
    String nome;
    
    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    public int compareTo(Jogador jogador) {
        return numero - jogador.numero;
    }
}
