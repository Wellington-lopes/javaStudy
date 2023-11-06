public class Animal {

    private String animal, tipo;

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
