public class Fisica extends Pessoa {
    public String cpf, identidade;

    @Override
    public String toString() {
        return "Fisica{" +
                "cpf='" + cpf + '\'' +
                ", identidade='" + identidade + '\'' +
                ", nome='" + nome + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
