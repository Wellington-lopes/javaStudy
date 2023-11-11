public class Main {
    public static void main(String[] args) {

        Mamifero mamifero1 = new Elefante();
        System.out.println("Cota diaria do elefante: " + mamifero1.cotaLeite());

        Mamifero mamifero2 = new Rato();
        System.out.println("Cota diaria do rato é: " + mamifero2.cotaLeite());
    }
}