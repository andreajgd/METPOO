package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cargos")
@Getter @Setter
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre cargo", length = 100, nullable = false)
    private String nombre;

    @Column(name = "descripción cargo", nullable = false)
    private String descripcion;

    @Override
    public String toString() {
        return "Datos de la Carrera" + '\n' +
                "id: " + id +
                "| nombre: '" + nombre + '\n' +
                "| descripción: " + descripcion + '\n'+
                "=================================================";
    }

    public Cargo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Cargo(){}


}