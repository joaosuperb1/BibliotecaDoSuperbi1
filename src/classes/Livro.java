package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class Livro {
    private String nomeLivro;
    private int numPaginas;
    private double preco;
    private List<Autor> autores;

    
    public Livro(Autor autor){
        this.nomeLivro = "";
        this.numPaginas = 0;
        this.preco = 0.0;
        this.autores = new ArrayList<>();
        
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("--------- Preenchendo os dados de livro -------- ");
        
        System.out.print("Informe o titulo:");
        this.nomeLivro = leitor.nextLine();
        
        System.out.print("Informe o numero de paginas:");
        this.numPaginas = leitor.nextInt();
        
        System.out.print("Informe o preco:");
        this.preco = leitor.nextDouble();
                
        String resposta = "n";
        do{
            Autor a = new Autor();
            a.preencher();
            getAutores().add(a);
            
            System.out.print("Existe mais autores neste livro (s/n) ?");
            resposta = leitor.next();            
        }while(resposta.equals("s"));
    
    }
    
    public void imprimir(){
        System.out.println("------------------------");
        System.out.println("Titulo:"+ this.nomeLivro);
        System.out.println("Paginas:"+ this.numPaginas);
        System.out.println("Preço:" + this.preco); 
        
        System.out.println("Autor(es):");               
        for(int i=0; i<= this.getAutores().size()-1; i++){
            Autor ai = this.getAutores().get(i);
            ai.imprimir();
        }
        System.out.println("------------------------");
    }
    
    public void copiar(Livro outro){
        this.nomeLivro = outro.getNomeLivro();
        this.numPaginas = outro.getNumPaginas();
        this.preco = outro.getPreco();
          
        for(int i=0; i<= outro.getAutores().size()-1; i++){
            Autor ai = outro.getAutores().get(i);
            
            Autor novo = new Autor();
            novo.copiar(ai);                    
            
            this.autores.add(novo);
        }
    }
    
}
