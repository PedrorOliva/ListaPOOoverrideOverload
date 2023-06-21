package ExercicioDois;

public class Livros {
  private String nome;
  private String genero;
  private Integer isbn;
  private String autor;

  public Livros() {};

  public Livros( Integer isbn, String nome, String genero, String autor) {
    this.isbn = isbn;
    this.nome = nome;
    this.genero = genero;
    this.autor = autor;
  }

  public Livros(Integer isbn) {
    this.isbn = isbn;
  }

  public Livros(Integer isbn, String nome) {
    this.nome = nome;
    this.isbn = isbn;
  }

  public Livros(Integer isbn, String nome, String genero) {
    this.nome = nome;
    this.genero = genero;
    this.isbn = isbn;
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public Integer getIsbn() {
    return isbn;
  }

  public void setIsbn(Integer isbn) {
    this.isbn = isbn;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  // Métodos
  public int registrarLivro(int isbn){
    setIsbn(isbn);
    System.out.println("O livro foi registrado com o ISBN " + getIsbn());
    return getIsbn();
  }

  public void registrarLivro(Integer isbn, String nome ){
    setIsbn(isbn);
    setNome(nome);
    System.out.println("O livro foi registrado com o ISBN " + getIsbn() + " e o nome " + getNome());
  }

  public void registrarLivro(Integer isbn, String nome, String genero){
    setIsbn(isbn);
    setNome(nome);
    setGenero(genero);
    System.out.println("O livro foi registrado com o ISBN " + getIsbn() + ", o nome " + getNome() + " e o " +
        "gênero " + getGenero());
  }

  public void registrarLivro(Integer isbn, String nome, String genero, String autor) {
    setIsbn(isbn);
    setNome(nome);
    setGenero(genero);
    setAutor(autor);
    System.out.println("O livro foi registrado com todos os atributos.");
  }

  public String toString() {
      return "\nISBN: " + getIsbn() + " - Nome: " + getNome() + " - Gênero: " + getGenero() +
          " - Autor: " + getAutor();
  }

}
