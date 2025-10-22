package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empleados")
@Getter @Setter
public class Empleado {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;

    @Column(name = "apellidos", length = 50, nullable = false)
    private String apellidos;

    @ManyToOne
    @JoinColumn(name = "empleo_id", nullable = false)
    private Cargo cargo;

    public Empleado(String nombres, String apellidos, Cargo cargo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
    }

    public Empleado() {
    }


}