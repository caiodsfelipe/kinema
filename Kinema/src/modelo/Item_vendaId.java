
package modelo;

import java.io.Serializable;

public class Item_vendaId implements Serializable{
    
    private int idVenda;
    private int idProduto;

    public Item_vendaId() {
    }

    public Item_vendaId(int idVenda, int idProduto) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idVenda;
        hash = 97 * hash + this.idProduto;
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
        final Item_vendaId other = (Item_vendaId) obj;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }

}
