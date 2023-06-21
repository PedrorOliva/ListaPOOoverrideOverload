package ExercicioTres;

public class Main {
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("Pedro");
    funcionario1.setDataAdmissao("21/06/2023");
    funcionario1.setSalario(2000.00);

    Funcionario funcionario2 = new Funcionario();
    funcionario2.setNome("Maria");
    funcionario2.setDataAdmissao("22/06/2023"); // Data superior a data atual
    funcionario2.setSalario(2000.00);

    Funcionario funcionario3 = new Funcionario();
    funcionario3.setNome("José");
    funcionario3.setDataAdmissao("20/06/2023");
    funcionario3.setSalario(500.00); // Salário inferior a 700

    Funcionario funcionario4 = new Funcionario();
    funcionario4.setNome("José");
    funcionario4.setDataAdmissao("20/06/2023");
    funcionario4.setSalario(700.00); // Salário inferior a 700


    System.out.println("----Funcionários----");
    System.out.println("ID:" + funcionario1.getIdentificador());
    System.out.println("Nome: " + funcionario1.getNome());
    System.out.println("Data de admissão: " + funcionario1.getDataAdmissao());
    System.out.println("Salário: R$" + funcionario1.getSalario());
    System.out.println("---------------------");
    System.out.println("ID:" + funcionario2.getIdentificador());
    System.out.println("Nome: " + funcionario2.getNome());
    System.out.println("Data de admissão: " + funcionario2.getDataAdmissao());
    System.out.println("Salário: R$" + funcionario2.getSalario());
    System.out.println("---------------------");
    System.out.println("ID:" + funcionario3.getIdentificador());
    System.out.println("Nome: " + funcionario3.getNome());
    System.out.println("Data de admissão: " + funcionario3.getDataAdmissao());
    System.out.println("Salário: R$" + funcionario3.getSalario());
    System.out.println("---------------------");
    System.out.println("ID:" + funcionario4.getIdentificador());
    System.out.println("Nome: " + funcionario4.getNome());
    System.out.println("Data de admissão: " + funcionario4.getDataAdmissao());
    System.out.println("Salário: R$" + funcionario4.getSalario());

  }
}
