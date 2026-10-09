
public class Principal {

    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println("Divisao inteira: " + (a / b));
        System.out.println("Divisao real: " + (7.0 / 2));
        System.out.println("Conversao depois: " + (double) (a / b));
        System.out.println("Conversao antes: " + ((double) a / b));
    }
}
