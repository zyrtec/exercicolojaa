package exerciolojaa;
import java.util.Date;

public class Venda {
    private Cliente cliente;
    private Produto produto;
    private Date dataVenda;

    public Venda(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
        this.dataVenda = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public Date getDataVenda() {
        return dataVenda;
    }
}