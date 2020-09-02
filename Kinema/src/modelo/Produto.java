package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table(name="Produto")

@NamedQueries ({

    @NamedQuery(name = "Produto.Todos", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.porDescricao", query = "SELECT p FROM Produto p WHERE p.descricao LIKE :descricao"),
    @NamedQuery(name = "Produto.porVenda", query = "SELECT i FROM Item_venda i WHERE i.idProduto = :idProduto")
        
})

public class Produto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProduto")
    private int idProduto;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="valor")
    private float valor;

    public Produto() {
    }

    public Produto(int idProduto, String descricao, float valor) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idProduto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }
    
}
