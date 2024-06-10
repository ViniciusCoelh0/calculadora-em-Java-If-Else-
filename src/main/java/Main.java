import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Digite um número: ");
    int num1 = new Scanner(System.in).nextInt();
    System.out.println("Digite outro número: ");
    int num2 = new Scanner(System.in).nextInt();
    System.out.println("Escolha um tipo de conta:");
    System.out.println("+ - Adição");
    System.out.println("x - Multiplcação");
    System.out.println("- - Subtração");
    System.out.println("/ - Divisão");

    String conta = new Scanner(System.in).next();

    if (conta.equals("+")){
      System.out.println(num1 + num2);
    }else if (conta.equals("x")){
      System.out.println(num1 * num2);
    }else if (conta.equals("-")){
      System.out.println(num1 - num2);
    }else if (conta.equals("/")){
      System.out.println(num1 / num2);
    }else{
      System.out.println("Operação inválida");
    }
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}