import java.util.Scanner;

/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * Principal.java
 */

 /**
  * Ao iniciar solicita que o usuário insira qual escala de temperatura ele 
  * irá informar a temperatura, caso a escala for inválida será solicitado para que
  * digite novamente, com a escala escolhida é solicitado que o usuário passe 
  * a temperatura
  */
public class Principal {

    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        Scanner pega = new Scanner(System.in);
        String texto;
        int escala = 0;
        while(true){
            try {
                System.out.println("Em qual escala a temperatura será passada:" +
                "\n1-Celsius\n2-Fahrenheit\n3-Kelvin");
                texto = pega.nextLine().toLowerCase();
                if (texto.equals("celsius") || texto.equals("1") || texto.equals("1-celsius"))
                    escala = 1;
                else if (texto.equals("fahrenheit") || texto.equals("2") || texto.equals("2-fahrenheit"))
                    escala = 2;
                else if (texto.equals("kelvin") || texto.equals("3") || texto.equals("3-kelvin"))
                    escala = 3;
                if (escala > 0){
                    System.out.print("Digite a temperatura em " + texto + ": ");
                    texto = pega.nextLine();
                    texto.replaceAll(",", ".");
                    System.out.println(temp.convert(escala, Float.parseFloat(texto)));
                } else {
                    System.out.println("Dados inválidos, por favor tente novamente...");
                }
            } catch (Exception e) {
                System.out.println("Não foi possível acessar os dados passados... tente novamente...");
            }
        }
    }
    
}