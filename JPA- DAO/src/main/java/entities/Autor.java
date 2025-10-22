package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import java.time.LocalDate;

import jdk.jfr.Name;
@Entity
@Table(name = "autores")
@Getter
@Setter
@NamedQueries({
        @NamedQuery(name = "autores.All",
        query = "select a from Autor a"
        )
})

public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre_autor", length = 60, nullable = false)
    private String nombre;
    @Column(name = "nacionalidad", length = 60, nullable = false)
    private String nacionalidad;

    private LocalDate fechaNac;
}
