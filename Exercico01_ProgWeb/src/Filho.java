public class Filho extends Pessoa {
    private String escola;

    @Override
    public String getTipoVoz() {
        return "Voz jovem e animada";
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola: " + escola;
    }
}
