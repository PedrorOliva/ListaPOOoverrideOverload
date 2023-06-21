package ExercicioDois;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Livros> biblioteca = new ArrayList<>();

    Livros livro = new Livros();
    livro.registrarLivro(123);
    biblioteca.add(livro);

    Livros livro1 = new Livros();
    livro1.registrarLivro(124, "Livro 1");
    biblioteca.add(livro1);

    Livros livro2 = new Livros();
    livro2.registrarLivro(125, "Livro 2", "Genero 2");
    biblioteca.add(livro2);

    Livros livro3 = new Livros();
    livro3.registrarLivro(126, "Livro 3", "Genero 3", "Autor 3");
    biblioteca.add(livro3);

    biblioteca.forEach(System.out::print);

  }
}
