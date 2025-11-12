package com.tuempresa.poog3.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;
import org.openxava.annotations.SimpleList;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ciudades")
@Getter@Setter
public class Ciudad {
    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String oid; //registro con un id grande a

    @Column(name = "nombre_ciudad", nullable = false, length= 60)
    @Size(min = 3, max = 60)
    private String nombre;
    @Required(message = "El campo ciudad debe ser ingresado.")

    @Column(name = "poblacion_ciudad")
    private int poblacion;


}
