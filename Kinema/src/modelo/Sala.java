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

@Table(name="Sala")

@NamedQueries ({

    @NamedQuery(name = "Sala.Todas", query = "SELECT s FROM Sala s"),
    @NamedQuery(name = "Sala.porNumero", query = "SELECT s FROM Sala s WHERE s.idSala = :numero"),
    @NamedQuery(name = "Sala.porSessao", query = "SELECT s FROM Sessao s WHERE s.idSala = :idSala")
        
})

public class Sala implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSala")
    private int idSala;
    
    @Column(name="capacidade")
    private int capacidade;

    public Sala() {
    }

    public Sala(int idSala, int capacidade) {
        this.idSala = idSala;
        this.capacidade = capacidade;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.idSala;
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
        final Sala other = (Sala) obj;
        if (this.idSala != other.idSala) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sala: " + idSala;
    }
    
}
