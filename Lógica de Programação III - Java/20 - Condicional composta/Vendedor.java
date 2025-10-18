package CarangoVelho_20;

public class Vendedor{
    String nome;
    private int totalVendido;
    private float descontoVenda;

    public int getTotalVendido() {
        return totalVendido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public float getDescontoVenda() {
        return descontoVenda;
    }

    public void setDescontoVenda(float descontoVenda) {
        this.descontoVenda = descontoVenda;
    }
   
    public Vendedor (){
        super();
    }

}
