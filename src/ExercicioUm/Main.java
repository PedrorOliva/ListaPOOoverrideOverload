package ExercicioUm;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Escolha uma das 3 marcas: Renault, Fiat ou Hyunday");
    String escolhaMarca = inputUsuario.next();

    if(escolhaMarca.equalsIgnoreCase("Renault")){
      Renault novoCarro = new Renault("Renault", 2003, 34.000, "Branco", 4,
          0);
      novoCarro.detalhesCarro();
      novoCarro.partidaDoMotor();
      novoCarro.acelerar();
      novoCarro.freiar();
    } else if (escolhaMarca.equalsIgnoreCase("Fiat")){
      Fiat novoCarro = new Fiat("Fiat", 2008, 29.000, "Azul", 2, 0);
      novoCarro.detalhesCarro();
      novoCarro.partidaDoMotor();
      novoCarro.acelerar();
      novoCarro.freiar();
    } else if(escolhaMarca.equalsIgnoreCase("Hyundai")){
      Hyundai novoCarro = new Hyundai("Hyundai", 2016, 47.000, "Vermelho", 4,
          0);
      novoCarro.detalhesCarro();
      novoCarro.partidaDoMotor();
      novoCarro.acelerar();
      novoCarro.freiar();
    } else {
      System.out.println("Escolha uma das 3 opções validas!!");
    }
  }
}
