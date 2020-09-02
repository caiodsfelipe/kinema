package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity

@Table(name="Ingresso")

@NamedQueries ({

    @NamedQuery(name = "Ingresso.Todos", query = "SELECT i FROM Ingresso i"),
    @NamedQuery(name = "Ingresso.porVenda", query = "SELECT i FROM Ingresso i WHERE i.idVenda = :idVenda")
        
})

public class Ingresso implements Serializable {
    
    @Id
    @Column(name="idIngresso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngresso;
    
    @ManyToOne
    @JoinColumn(name="idSessao", referencedColumnName = "idSessao")
    private Sessao idSessao;
    
    @ManyToOne
    @JoinColumn(name="idVenda", referencedColumnName = "idVenda")
    private Venda idVenda;
    
    @Column(name="expedicao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date expedicao;
    
    @Column(name="tipo")
    private int tipo;
    
    @Column(name="valor")
    private float valor;
    
    @Column(name="qtd")
    private int qtd;

    public Ingresso() {
    }

    public Ingresso(int idIngresso, Sessao idSessao, Venda idVenda, Date expedicao, int tipo, float valor, int qtd) {
        this.idIngresso = idIngresso;
        this.idSessao = idSessao;
        this.idVenda = idVenda;
        this.expedicao = expedicao;
        this.tipo = tipo;
        this.valor = valor;
        this.qtd = qtd;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public Sessao getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(Sessao idSessao) {
        this.idSessao = idSessao;
    }

    public Venda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }

    public Date getExpedicao() {
        return expedicao;
    }

    public void setExpedicao(Date expedicao) {
        this.expedicao = expedicao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idIngresso;
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
        final Ingresso other = (Ingresso) obj;
        if (this.idIngresso != other.idIngresso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "idIngresso=" + idIngresso + ", idSessao=" + idSessao + ", idVenda=" + idVenda + ", expedicao=" + expedicao + ", tipo=" + tipo + ", valor=" + valor + ", qtd=" + qtd + '}';
    }

}
