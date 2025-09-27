package run;

import java.util.Scanner;

public class Libro {

        public String titulo;
        public String autor;
        public int numpag;

        public String MostrarInfo () {
            return "Titulo: " + this.titulo + " Autor: " + this.autor +  " Numpag: " + this.numpag;
        }

}
