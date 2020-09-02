
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

@Table(name="Funcionario")

@NamedQueries ({

    @NamedQuery(name = "Funcionario.Todos", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.porNome", query = "SELECT f FROM Funcionario f WHERE f.nome LIKE :nome"),
    @NamedQuery(name = "Funcionario.Acessar", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf AND f.senha = :senha"),
    @NamedQuery(name = "Funcionario.porVenda", query = "SELECT v FROM Venda v WHERE v.idFuncionario = :idFuncionario")
        
})

public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFuncionario")
    private int idFuncionario;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="email")
    private String email;
    
    @Column(name="cpf")
    private String cpf;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="senha")
    private String senha;

    public Funcionario() {
    }

    public Funcionario(int idFuncionario, String nome, String email, String cpf, String endereco, String telefone, String senha) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idFuncionario;
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
        final Funcionario other = (Funcionario) obj;
        if (this.idFuncionario != other.idFuncionario) {
            return false;
        }
        return true;
    }

}
