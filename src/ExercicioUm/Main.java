package ExercicioUm;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Escolha uma das 3 marcas: Renault, Fiat ou Hyunday");
    String escolhaMarca = inputUsuario.next();

    if(escolhaMarca.equalsIgnoreCase("Renault")){
      Renault novoRenault = new Renault("Renault", 2003, 34.000, "Branco", 4,
          0);
      novoRenault.detalhesCarro();
      novoRenault.partidaDoMotor();
      novoRenault.acelerar();
      novoRenault.freiar();
    } else if (escolhaMarca.equalsIgnoreCase("Fiat")){
      Fiat novoFiat = new Fiat("Fiat", 2008, 29.000, "Azul", 2, 0);
      novoFiat.detalhesCarro();
      novoFiat.partidaDoMotor();
      novoFiat.acelerar();
      novoFiat.freiar();
    } else if(escolhaMarca.equalsIgnoreCase("Hyundai")){
      Hyundai novoHyunday = new Hyundai("Hyundai", 2016, 47.000, "Vermelho", 4,
          0);
      novoHyunday.detalhesCarro();
      novoHyunday.partidaDoMotor();
      novoHyunday.acelerar();
      novoHyunday.freiar();
    } else {
      System.out.println("Escolha uma das 3 opções validas!!");
    }
  }
}
