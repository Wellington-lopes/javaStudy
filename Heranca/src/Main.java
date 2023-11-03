public class Main {
    public static void main(String[] args) {
        Fisica fis = new Fisica();
        Juridica jus = new Juridica();


        fis.nome = "Well";
        fis.situacao = "A";
        fis.cpf = "565656";
        fis.identidade = "544664";

        jus.nome = "Carol";
        jus.cnpj = "453453";
        jus.situacao = "A";
        jus.inscricaoEstadual = "54757";

        System.out.println("Dados da pessoa fisica: " +  fis.toString());


        System.out.println("Dados da pessoa juridica: " + jus.toString());



    }
}