public class Avo extends Pessoa {
    private int idade;

    @Override
    public String getTipoVoz() {
        return "Voz grave e lenta";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Idade: " + idade;
    }
}
