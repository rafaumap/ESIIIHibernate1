package ESIIIHibernateDDL1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico {
  @Id
  @Column(name = "id_medico")
  @NotNull
  private int id;

  @ManyToOne
  @JoinColumn(name = "id_especialidade")
  @NotNull
  private Especialidade especialidade;

  @Column(name = "nome", length = 50)
  @NotNull
  private String nome;

  @Column(name = "logradouro", length = 50)
  @NotNull
  private String logradouro;

  @Column(name = "numero_res", length = 5)
  @NotNull
  private String numero_res;

  @Column(name = "cep", length = 15)
  @NotNull
  private String cep;

  @Column(name = "complemento", length = 30)
  @NotNull
  private String complemento;

  @Column(name = "telefone", length = 15)
  @NotNull
  private String telefone;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Especialidade getEspecialidade() {
    return this.especialidade;
  }

  public void setEspecialidade(Especialidade especialidade) {
    this.especialidade = especialidade;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogradouro() {
    return this.logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getNumero_res() {
    return this.numero_res;
  }

  public void setNumero_res(String numero_res) {
    this.numero_res = numero_res;
  }

  public String getCep() {
    return this.cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getComplemento() {
    return this.complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", especialidade='" + getEspecialidade() + "'" +
        ", nome='" + getNome() + "'" +
        ", logradouro='" + getLogradouro() + "'" +
        ", numero_res='" + getNumero_res() + "'" +
        ", cep='" + getCep() + "'" +
        ", complemento='" + getComplemento() + "'" +
        ", telefone='" + getTelefone() + "'" +
        "}";
  }

}