package entity;

public class ProdutoPerecivel extends Produto{
    private String marca;
    private Integer quantidade;
    private String unidadeMedida;
    private String ingredientes;
    private String fabricante;

    public ProdutoPerecivel(String name, String descricao, String marca, Integer quantidade, String unidadeMedida, String ingredientes, String fabricante) {
        super(name, descricao);
        this.marca = marca;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
        this.ingredientes = ingredientes;
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
