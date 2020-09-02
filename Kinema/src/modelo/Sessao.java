package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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

@Table(name = "Sessao")

@NamedQueries({
    @NamedQuery(name = "Sessao.Todas", query = "SELECT s FROM Sessao s"),
    @NamedQuery(name = "Sessao.todasDisponiveis", query
            = "SELECT s FROM Sessao s, Sala l WHERE s.lotacao < l.capacidade")
})

public class Sessao implements Serializable {

    @Id
    @Column(name = "idSessao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSessao;

    @ManyToOne
    @JoinColumn(name = "idSala", referencedColumnName = "idSala")
    private Sala idSala;

    @ManyToOne
    @JoinColumn(name = "idFilme", referencedColumnName = "idFilme")
    private Filme idFilme;

    @Column(name = "dataSessao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSessao;

    @Column(name = "inicio")
    private int inicio;

    @Column(name = "termino")
    private int termino;

    @Column(name = "valorIngresso")
    private float valorIngresso;

    @Column(name = "lotacao")
    private int lotacao;

    public Sessao() {
    }

    public Sessao(int idSessao, Sala idSala, Filme idFilme, Date dataSessao, int inicio, int termino, float valorIngresso, int lotacao) {
        this.idSessao = idSessao;
        this.idSala = idSala;
        this.idFilme = idFilme;
        this.dataSessao = dataSessao;
        this.inicio = inicio;
        this.termino = termino;
        this.valorIngresso = valorIngresso;
        this.lotacao = lotacao;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    public Filme getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Filme idFilme) {
        this.idFilme = idFilme;
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getTermino() {
        return termino;
    }

    public void setTermino(int termino) {
        this.termino = termino;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idSessao;
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
        final Sessao other = (Sessao) obj;
        if (this.idSessao != other.idSessao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        String data = format.format(dataSessao);

        return "Sessão: " + idSessao + " | " + idSala + " | Data: "
                + data + " | Início: " + inicio;
    }

}
