package ESIIIHibernateDDL1.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "consulta")
public class Consulta {
  @Id
  @Column(name = "id_consulta")
  @NotNull
  private int id;

  @ManyToOne
  @JoinColumn(name = "id_medico")
  @NotNull
  private Medico medico;

  @ManyToOne
  @JoinColumn(name = "id_paciente")
  @NotNull
  private Paciente paciente;

  @Column(name = "data")
  @NotNull
  private LocalDate data;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Medico getMedico() {
    return this.medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public Paciente getPaciente() {
    return this.paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public LocalDate getData() {
    return this.data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", medico='" + getMedico() + "'" +
        ", paciente='" + getPaciente() + "'" +
        ", data='" + getData() + "'" +
        "}";
  }

}