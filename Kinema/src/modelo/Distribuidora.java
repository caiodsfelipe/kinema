
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

@Table(name="Distribuidora")

@NamedQueries ({

    @NamedQuery(name = "Distribuidora.Todas", query = "SELECT d FROM Distribuidora d"),
    @NamedQuery(name = "Distribuidora.porNome", query = "SELECT d FROM Distribuidora d WHERE d.nome LIKE :nome"),
    @NamedQuery(name = "Distribuidora.porFilme", query = "SELECT f FROM Filme f WHERE f.idDistribuidora = :idDistribuidora")
        
})

public class Distribuidora implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDistribuidora")
    private int idDistribuidora;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="nome_contato")
    private String nome_contato;
    
    @Column(name="email")
    private String email;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="cnpj")
    private String cnpj;

    public Distribuidora() {
    }

    public Distribuidora(int idDistribuidora, String nome, String nome_contato, String email, String endereco, String telefone, String cnpj) {
        this.idDistribuidora = idDistribuidora;
        this.nome = nome;
        this.nome_contato = nome_contato;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public int getIdDistribuidora() {
        return idDistribuidora;
    }

    public void setIdDistribuidora(int idDistribuidora) {
        this.idDistribuidora = idDistribuidora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_contato() {
        return nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idDistribuidora;
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
        final Distribuidora other = (Distribuidora) obj;
        if (this.idDistribuidora != other.idDistribuidora) {
            return false;
        }
        return true;
    }

}