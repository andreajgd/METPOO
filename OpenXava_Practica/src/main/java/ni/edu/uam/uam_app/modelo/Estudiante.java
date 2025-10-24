package ni.edu.uam.uam_app.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Estudiante {

    @Id
    private String cif;

    @Column(name = "Nombres", length = 50, nullable = false)
    @Required(message = "El nombre es obligatorio.")
    private String nombres;

    @Column(name = "Apellidos", length = 50, nullable = false)
    @Required(message = "El apellido es obligatorio.")
    private String apellidos;


    LocalDate fechaNac;
    private String carrera;
}
