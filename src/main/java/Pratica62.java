
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    
    public static void main( String[] args ){
        Time time;
        Set<String> posicoes;

        time = new Time();
 
        time.adicionaJogador("The Good", new Jogador(1, "Squirtle"));
        time.adicionaJogador("The Bad", new Jogador(2, "Charmander"));
        time.adicionaJogador("The Ugly", new Jogador(3, "Bulbassaur"));
        
        for(Jogador j: time.ordena(new JogadorComparator(false, true, true))){
            System.out.println(j);
        }
    }
}
