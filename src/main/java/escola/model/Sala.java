
package escola.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O codigo e obrigatorio")
    @Column(nullable = false, unique = true)
    private String codigo;

    @NotBlank(message = "O nome e obrigatorio")
    @Column(nullable = false)
    private String nome;

    @NotNull(message = "A capacidade e obrigatoria")
    @Min(value = 1, message = "A capacidade deve ser maior que zero")
    private Integer capacidade;

    private boolean reservada = false;

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
}
