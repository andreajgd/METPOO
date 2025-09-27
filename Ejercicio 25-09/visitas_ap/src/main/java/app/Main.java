package app;

import dao.VisitDao;
import modelo.Visit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VisitDao dao = new VisitDao();

        try {
            // Insertar ejemplo
            Visit v1 = new Visit("Ana López", "ID-001", "ana@example.com", "Ing. Navarro", "Entrega de documentos");
            dao.insert(v1);

            Visit v2 = new Visit("Carlos Ruiz", "ID-002", null, "Lic. Gonzales", "Entrevista");
            dao.insert(v2);

            Visit v3 = new Visit("María Silva", "ID-003", "maria@example.com", "Ing. Lacayo", "Reunión de proyecto");
            dao.insert(v3);

            // Consultar todos
            List<Visit> visits = dao.findAll();
            for (Visit v : visits) {
                System.out.println(v);
            }

            // Marcar salida de un visitante (ejemplo con id=1)
            dao.updateExit(1L);

            // Eliminar un registro (ejemplo con id=2)
            dao.delete(2L);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
