package entity;

public class Produto {
    protected String name;
    protected String descricao;

    public Produto(String name, String descricao) {
        this.name = name;
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
