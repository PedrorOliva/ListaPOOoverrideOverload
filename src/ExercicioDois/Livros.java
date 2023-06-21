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

  public int registrarLivro(int isbn){
    //ToDo trotar gets e sets por this
    this.isbn = isbn;
    System.out.println("O livro foi registrado com o ISBN " +this.isbn);
    return this.isbn;
  }

  public void registrarLivro(Integer isbn, String nome ){
    this.isbn = isbn;
    this.nome = nome;
    System.out.println("O livro foi registrado com o ISBN " + this.isbn + " e o nome " + this.nome);
  }

  public void registrarLivro(Integer isbn, String nome, String genero){
    this.isbn = isbn;
    this.nome = nome;
    this.genero = genero;
    System.out.println("O livro foi registrado com o ISBN " + this.isbn + ", o nome " + this.nome + " e o " +
        "gênero " + this.genero);
  }

  public void registrarLivro(Integer isbn, String nome, String genero, String autor) {
    this.isbn = isbn;
    this.nome = nome;
    this.genero = genero;
    this.autor = autor;
    System.out.println("O livro foi registrado com todos os atributos.");
  }

  public String toString() {
      return "\nISBN: " + this.isbn + " - Nome: " + this.nome + " - Gênero: " + this.genero +
          " - Autor: " + this.autor;
  }

}
