package ExercicioUm;

public class Fiat extends Carros{
  public Fiat(String marca, Integer ano, Double valor, String cor, Integer portas, Integer velocicade) {
    super(marca, ano, valor, cor, portas, velocicade);
  }

  public void detalhesCarro(){
    System.out.println("Marca: " + getMarca());
    System.out.println("Ano: " + getAno());
    System.out.println("Valor: " + getValor());
    System.out.println("Cor: " + getCor());
    System.out.println("Quantidade de portas: " + getPortas()+"\n");
  }

  @Override
  public void partidaDoMotor() {
    setVelocicade(3);
    System.out.println("Iniciando o motor... a minha velocidade está em " + getVelocicade() + "km/h");
  }

  @Override
  public void freiar() {
    if(getVelocicade() == 0){
      System.out.println("O carro está parado!!");
    } else {
      setVelocicade(getVelocicade() - 6);
      System.out.println("Freando... minha velocidade está em " + getVelocicade() + "km/h");
    }
  }

  @Override
  public void acelerar() {
    setVelocicade(getVelocicade() + 12);
    System.out.println("Acelerando... minha velocidade está em " + getVelocicade() + "km/h");
  }
}
