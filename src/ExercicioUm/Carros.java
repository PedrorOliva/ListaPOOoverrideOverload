package ExercicioUm;

abstract class Carros {
  private String marca;
  private Integer ano;
  private Double valor;
  private String cor;
  private Integer portas;
  private Integer velocicade;

  public Carros(String marca, Integer ano, Double valor, String cor, Integer portas, Integer velocicade) {
    this.marca = marca;
    this.ano = ano;
    this.valor = valor;
    this.cor = cor;
    this.portas = portas;
    this.velocicade = velocicade;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Integer getPortas() {
    return portas;
  }

  public void setPortas(Integer portas) {
    this.portas = portas;
  }

  public Integer getVelocicade() {
    return velocicade;
  }

  public void setVelocicade(Integer velocicade) {
    this.velocicade = velocicade;
  }

  public abstract void partidaDoMotor();

  public abstract void freiar();

  public abstract void acelerar();
}
