import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int idade;
        String num;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

        System.out.println("Sua idade é: " + idade);
        JOptionPane.showMessageDialog(null,"Sua idade é: " + idade);
    }
}