package ExercicioTres;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
  private static int contIdentificador = 0;
  private Integer identificador;
  private String nome;
  private String dataAdmissao;
  private Double salario;

  public Funcionario(){
    setContIdentificador(getContIdentificador() + 1);
    setIdentificador(getContIdentificador());
  };

  public Funcionario(Integer identificador, String nome, String dataAdmissao, Double salario) {
    this.identificador = identificador;
    this.nome = nome;
    this.dataAdmissao = dataAdmissao;
    this.salario = salario;
  }

  public Integer getIdentificador() {
    return identificador;
  }

  public void setIdentificador(Integer identificador) {
    this.identificador = identificador ;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataAdmissao() {
    return dataAdmissao;
  }

  public void setDataAdmissao(String dataAdmissao) {
    LocalDate data = LocalDate.parse(dataAdmissao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    if(data.isAfter(LocalDate.now()) == true){
      if(dataAdmissao == null){
        System.out.println("A data de admissão não pode ser superior a data atual!!");
      }
    } else {
      this.dataAdmissao = dataAdmissao;
    }
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    if(salario >= 700){
      this.salario = salario;
    } else {
      System.out.println("O salário não pode ser inferior a 700!!");
    }
  }

  public static int getContIdentificador() {
    return contIdentificador;
  }

  public static void setContIdentificador(int contIdentificador) {
    Funcionario.contIdentificador = contIdentificador;
  }

}
