import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Pessoa pes = new Pessoa();
        // pes.nomePessoa = "well";
        // pes.idadePessoa = 32;
        pes.nomePessoa = JOptionPane.showInputDialog("Qual seu nome? ");
        pes.idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

        pes.mostraDados(pes.nomePessoa, pes.idadePessoa);


        Blusa blu = new Blusa();

        blu.cor = JOptionPane.showInputDialog("Qual a cor da blusa? ");
        blu.tipo = JOptionPane.showInputDialog("Qual o tipo da blusa? ");
        blu.tamanho = JOptionPane.showInputDialog("Qual o tamanho da blusa? ");

        blu.blusaDados(blu.cor, blu.tipo, blu.tamanho);

        // ENCAPSULAMENTO
        Animal ani = new Animal();

        ani.setAnimal("Gordinha");
        ani.setTipo("Gato");
        System.out.println(ani.toString());
    }
}