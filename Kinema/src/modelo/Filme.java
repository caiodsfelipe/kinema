package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity

@Table(name="Filme")

@NamedQueries ({

    @NamedQuery(name = "Filme.Todos", query = "SELECT f FROM Filme f"),
    @NamedQuery(name = "Filme.porNome", query = "SELECT f FROM Filme f WHERE f.nome LIKE :nome"),
    @NamedQuery(name = "Filme.porSessao", query = "SELECT s FROM Sessao s WHERE s.idFilme = :idFilme")
        
})

public class Filme implements Serializable {
    
    @Id
    @Column(name="idFilme")
    private int idFilme;
    
    @ManyToOne
    @JoinColumn(name = "idDistribuidora", referencedColumnName = "idDistribuidora")
    private Distribuidora idDistribuidora;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="lancamento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lancamento;
    
    @Column(name="dias_em_cartaz")
    private int dias_em_cartaz;
    
    @Column(name="genero")
    private String genero;

    public Filme() {
    }
    
    public Filme(int idFilme, Distribuidora idDistribuidora, String nome, Date lancamento, int dias_em_cartaz, String genero) {
        this.idFilme = idFilme;
        this.idDistribuidora = idDistribuidora;
        this.nome = nome;
        this.lancamento = lancamento;
        this.dias_em_cartaz = dias_em_cartaz;
        this.genero = genero;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public Distribuidora getIdDistribuidora() {
        return idDistribuidora;
    }

    public void setIdDistribuidora(Distribuidora idDistribuidora) {
        this.idDistribuidora = idDistribuidora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public int getDias_em_cartaz() {
        return dias_em_cartaz;
    }

    public void setDias_em_cartaz(int dias_em_cartaz) {
        this.dias_em_cartaz = dias_em_cartaz;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.idFilme;
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
        final Filme other = (Filme) obj;
        if (this.idFilme != other.idFilme) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
