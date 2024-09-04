public class Faturamento {
    int dia;
    double valor;
    String estado;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Faturamento(String estado, double valor){
        this.estado = estado;
        this.valor = valor;
    }

    public Faturamento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }
}
