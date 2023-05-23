package exerciolojaa;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String dtnascimento;
    private boolean inadimp = false;
    private List<Venda> historicoVendas;
    
    
    public Cliente() {
    }
    
    public Cliente(String nome, String cpf, Endereco endereco, String dtnascimento, boolean inadimp) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dtnascimento = dtnascimento;
        this.inadimp = inadimp;
        this.historicoVendas = new ArrayList<>();
    }
    public boolean isInadimp() {
        return inadimp;
    }

    public void setInadimp(boolean inadimp) {
        this.inadimp = inadimp;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getDtnascimento() {
        return dtnascimento;
    }
    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }
    public List<Venda> getHistoricoVendas() {
        return historicoVendas;
    }

    public void setHistoricoVendas(List<Venda> historicoVendas) {
        this.historicoVendas = historicoVendas;
    }

    public void adicionarVenda(Venda venda) {
        historicoVendas.add(venda);
    }
    public List<Venda> getVendas() {
        return historicoVendas;
    }
}
    
