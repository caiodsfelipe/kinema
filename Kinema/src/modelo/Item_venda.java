
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="Item_venda")
@IdClass(Item_vendaId.class)
public class Item_venda implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name="idVenda", referencedColumnName = "idVenda")
    private Venda idVenda;
    
    @Id
    @ManyToOne
    @JoinColumn(name="idProduto", referencedColumnName = "idProduto")
    private Produto idProduto;
    
    @Column(name="qtd")
    private int qtd;
    
    @Column(name="valor_unit")
    private float valor_unit;

    public Item_venda() {
    }

    public Item_venda(Venda idVenda, Produto idProduto, int qtd, float valor_unit) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.qtd = qtd;
        this.valor_unit = valor_unit;
    }

    public Venda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(float valor_unit) {
        this.valor_unit = valor_unit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idVenda);
        hash = 53 * hash + Objects.hashCode(this.idProduto);
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
        final Item_venda other = (Item_venda) obj;
        if (!Objects.equals(this.idVenda, other.idVenda)) {
            return false;
        }
        if (!Objects.equals(this.idProduto, other.idProduto)) {
            return false;
        }
        return true;
    }
    
}
