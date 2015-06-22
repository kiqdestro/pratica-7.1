
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
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
public class Pratica71 {
    
    public static void main( String[] args ){
        ArrayList<Jogador> time = new ArrayList<>();
        Set<String> posicoes;
        Scanner scanner = new Scanner(System.in);
        int numJogadores, posicao;
        Object lixo;
        
        
        int numJogador;
        String nomeJogador;
 
        System.out.print("Digite o número de jogadores: ");
        
        while(!scanner.hasNextInt()) {
            lixo = scanner.next();
            System.out.print("Digite um número válido!");
        }
            
        numJogadores = scanner.nextInt();
        
        
        while(numJogadores > 0) {
            
            System.out.print("Digite o número do jogador: ");
            while(!scanner.hasNextInt()) {
                lixo = scanner.next();
                System.out.print("Digite um número válido!");
            }
            numJogador = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.print("Digite o nome do jogador: ");
            nomeJogador = scanner.nextLine();
            
            time.add(new Jogador(numJogador, nomeJogador));
            
            numJogadores--;
        }
        
        Collections.sort(time, new JogadorComparator());
        
        for (Jogador j: time) {
            System.out.println(j);
        }
        
        numJogador = 1;
        
        while(numJogador != 0) {
            System.out.print("Digite o número do jogador: ");
            while(!scanner.hasNextInt()) {
                lixo = scanner.next();
                System.out.print("Digite um número válido!");
            }
            numJogador = scanner.nextInt();
            
            if(numJogador != 0) {
                scanner.nextLine();

                System.out.print("Digite o nome do jogador: ");
                nomeJogador = scanner.nextLine();
                
                boolean jaExiste = false;
                Jogador jogador = new Jogador(numJogador, nomeJogador);
                
                for(Jogador j: time)
                {
                    if(jogador.getNumero() == j.getNumero())
                    {
                        time.set(time.indexOf(j), jogador);
                        jaExiste = true;
                    }
                }
                if(!jaExiste)
                    time.add(jogador);
                
                Collections.sort(time, new JogadorComparator());
        
                for (Jogador j: time) {
                    System.out.println(j);
                }
            }
        }
        
    }
}
