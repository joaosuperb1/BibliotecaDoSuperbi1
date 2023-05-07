package bibliotecadosuperbi;

import classes.Autor;
import classes.Livro;
import classes.Biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class BibliotecaDoSuperbi {

    
    public static int imprimirMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n\t----------- Biblioteca Do Superbi ------------");
        System.out.println("\t1 - Inserir livro");
        System.out.println("\t2 - Remover livro");
        System.out.println("\t3 - Pesquisar livro (titulo)");
        System.out.println("\t4 - Pesquisar livro (autor)");        
        System.out.println("\t5 - Pesquisar Autor (cidadeNatal)");
        System.out.println("\t6 - Listar todos os livros ");
        System.out.println("\t0 - Sair");
        System.out.println("\t-----------------------------------------");
        System.out.print("\tEscolha uma opção:");
        
        return leitor.nextInt();
    }
    
    public static void main(String[] args) {
        Biblioteca bbt = new Biblioteca();

        int opcao = 0;
        do {
            opcao = imprimirMenu();

            switch (opcao) {
                case 1: //insercao                    
                    bbt.addBook();
                    break;
                
                case 2:  //remocao                    
                    bbt.removeBook();
                    break;
                
                case 3:  //busca por titulo
                    bbt.findBookByTitle();
                    break;
                
                case 4://pesquisa livro pelo nome do autor
                    bbt.findBookByAuthor();
                    break;
                
                case 5: //pesquisa autor pela cidade natal
                    bbt.findAuthorByCity();                    
                    break;
                    
                case 6://listar todos os livros
                    bbt.findAllBooks();
                    break;
                    
                default:
                    break;
            }
        } while (opcao != 0);

    }
    
}
