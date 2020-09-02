package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity

@NamedQueries({
    @NamedQuery(name = "Venda.Todas", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.Relatorio", query = "SELECT i FROM Item_venda i")})

@Table(name = "Venda")
public class Venda implements Serializable {

    @Id
    @Column(name = "idVenda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;

    @ManyToOne
    @JoinColumn(name = "idFuncionario", referencedColumnName = "idFuncionario")
    private Funcionario idFuncionario;

    @Column(name = "data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    @Column(name = "total")
    private float total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "idVenda")
    List<Item_venda> listaItens;

    public Venda() {
    }

    public Venda(int idVenda, Funcionario idFuncionario, Date data, float total, List<Item_venda> listaItens) {
        this.idVenda = idVenda;
        this.idFuncionario = idFuncionario;
        this.data = data;
        this.total = total;
        this.listaItens = listaItens;
    }

    public Funcionario getIdFuncionário() {
        return idFuncionario;
    }

    public void setIdFuncionário(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Item_venda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item_venda> listaItens) {
        this.listaItens = listaItens;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idVenda;
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
        final Venda other = (Venda) obj;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", idFuncion\u00e1rio=" + idFuncionario + ", data=" + data + ", total=" + total + ", listaItens=" + listaItens + '}';
    }

}
