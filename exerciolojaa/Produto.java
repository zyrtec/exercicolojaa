package exerciolojaa;



public class Produto {

    private int cod;
    private String descricao;
    private String categoria;
    

    public Produto(int cod, String descricao, String categoria) {
        this.cod = cod;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

    
}
