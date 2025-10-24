package ni.edu.uam.uam_app.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Carrera {
    @Id
    private String id;

    @Column(name = "Nombre", length = 50, nullable = false)
    @Required(message = "El nombre es obligatorio.")
    private String nombre;

    @Column(name = "Facultad", length = 50, nullable = false)
    @Required(message = "La facultad es obligatoria.")
    private String facultad;

}
