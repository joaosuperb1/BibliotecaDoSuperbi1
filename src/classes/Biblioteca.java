package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class Biblioteca {

    private List<Livro> listaLivros;
    private Scanner leitor;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();

        this.leitor = new Scanner(System.in);
    }

    public void addBook() {
        Livro l1 = new Livro();
        l1.preencher();
        listaLivros.add(l1);
    }

    public void removeBook() {
        System.out.print("Informe o titulo:");
        String tituloProcuradoParaSair = leitor.nextLine();

        for (int i = 0; i <= listaLivros.size() - 1; i++) {
            Livro li = listaLivros.get(i);

            if (tituloProcuradoParaSair.equals(li.getNomeLivro())) {
                listaLivros.remove(li);
            }
        }
    }

    public void findBookByTitle() {
        System.out.print("Informe o titulo:");
        String tituloProcurado = leitor.nextLine();

        for (int i = 0; i <= listaLivros.size() - 1; i++) {
            Livro li = listaLivros.get(i);
            if (tituloProcurado.equals(li.getNomeLivro())) {
                System.out.println("Livro encontrado");
                li.imprimir();
            }
        }
    }

    public void findBookByAuthor() {
        System.out.println("Informe o autor:");
        String autorProcurado = leitor.nextLine();

        for (int i = 0; i <= listaLivros.size() - 1; i++) {
            Livro li = listaLivros.get(i);

            //pesquisaremos se o nome procurado é de algum dos autores
            for (int j = 0; j <= li.getAutores().size() - 1; j++) {
                Autor aj = li.getAutores().get(j);

                if (autorProcurado.equals(aj.getNomeAutor())) {
                    System.out.println("Autor encontrado");
                    li.imprimir();
                }
            }

        }
    }

    public void findAuthorByCity() {
        System.out.println("Informe a cidade natal:");
        String cidadeNatalInformada = leitor.nextLine();

        for (int i = 0; i <= listaLivros.size() - 1; i++) {
            Livro li = listaLivros.get(i);

            //pesquisaremos em cada livro se tem algum autor desta cidade natal
            for (int j = 0; j <= li.getAutores().size() - 1; j++) {
                Autor aj = li.getAutores().get(j);

                if (cidadeNatalInformada.equals(aj.getCidadeNatal())) {
                    System.out.println("Autor encontrado");
                    aj.imprimir();
                }
            }
        }
    }

    public void findAllBooks() {
        for (int i = 0; i <= listaLivros.size() - 1; i++) {
            Livro li = listaLivros.get(i);
            li.imprimir();
        }
        
        if(listaLivros.isEmpty())
            System.out.println("Biblioteca vazia.");
    }

}
