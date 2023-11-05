public class Main {
    public static void main(String[] args) {
        int num1, num2, num3, numero;
        num1 = 50;
        num2 = 50;
        num3 = num1 + num2;

        System.out.println("A soma dos números é " + num3);

        numero = 0;
        while (numero < 10){
            numero++;
            System.out.println("o número agora é: " + numero);
        }

        System.out.println("__________________________");

        numero = 11;
        while (numero > 0){
            numero--;
            System.out.println("o número agora é: " + numero);
        }

        System.out.println("__________________________");

        // && = e
        // || = ou

        if (num1 > num2) {
            System.out.println("O número 1 é maior que o número 2");
        } else if(num2 > num1){
            System.out.println("O número 2 é maior que o número 1");
        } else {
            System.out.println("O número 1 e o número 2 são iguais");
        }

        System.out.println("__________________________");

        int x = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("o número do for agora é: " + i);
            x = i;
        }
        System.out.println("o número x agora é: " + x);
    }
}
