package classes;

import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class Autor {
    private String nomeAutor;
    private String cidadeNatal;
    private int idadeAutor;

    
    public Autor(){
        this.nomeAutor = "";
        this.cidadeNatal = "";
        this.idadeAutor = 0;
    }
    
    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public int getIdadeAutor() {
        return idadeAutor;
    }

    public void setIdadeAutor(int idadeAutor) {
        this.idadeAutor = idadeAutor;
    }
    
    
    
    public Autor(String nomeAutor, String cidadeNatal, int idadeAutor){
        this.nomeAutor = nomeAutor;
        this.cidadeNatal = cidadeNatal;
        this.idadeAutor = idadeAutor;
        
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Digite o nome do autore");
        this.nomeAutor = leitor.next();
        System.out.println("Digite a cidade natal do autore");
        this.cidadeNatal = leitor.next();
        System.out.println("Digite a idade do autore");
        this.idadeAutor = leitor.nextInt();
        System.out.println("-------------------------------");
    }
    
    public void imprimir(){
        System.out.println("-------------------------------");
        System.out.println("Nome do autore: "+ this.nomeAutor);
        System.out.println("Cidade natal do autore: "+ this.cidadeNatal);
        System.out.println("Idade do autore: "+ this.idadeAutor);
        System.out.println("-------------------------------");
    }
    
    public void copiar(Autor outro){
        this.nomeAutor = outro.getNomeAutor();
        this.cidadeNatal = outro.getCidadeNatal();
        this.idadeAutor = outro.getIdadeAutor();
        
    }
    
    
}
