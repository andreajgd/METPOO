package run;

import config.JPAUtil;
import entities.Cargo;
import entities.Empleado;
import jakarta.persistence.EntityManager;
import repository.dao.CargoDao;
import repository.dao.EmpleadoDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        Scanner sc = new Scanner(System.in);
        CargoDao cDao = new CargoDao(em);
        EmpleadoDao eDao = new EmpleadoDao(em);

        System.out.println("1. Ingresar a Menú Cargos");
        System.out.println("2. Ingresar a Menú Empleados");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingresaste a cargos.");
                System.out.println("1. Agregar cargo");
                System.out.println("2. Buscar cargo");
                System.out.println("3. Modificar cargo");
                System.out.println("4. Eliminar cargo");
                int op1 = sc.nextInt();
                sc.nextLine();

                switch (op1) {
                    case 1:
                        Cargo nuevo = new Cargo();
                        System.out.println("Nombre del cargo: ");
                        nuevo.setNombre(sc.nextLine());
                        System.out.println("Agregar descripción del cargo:");
                        nuevo.setDescripcion(sc.nextLine());
                        cDao.guardar(nuevo);
                        System.out.println("Cargo agregado correctamente");
                        break;

                    case 2:
                        System.out.println("ID del cargo a buscar: ");
                        Long idBuscar = sc.nextLong();
                        Cargo encontrada = cDao.buscarPorId(idBuscar);
                        if (encontrada != null) {
                            System.out.println("Cargo encontrado:");
                            System.out.println("ID: " + encontrada.getId());
                            System.out.println("Nombre: " + encontrada.getNombre());
                            System.out.println("Descripción: " + encontrada.getDescripcion());
                        } else {
                            System.out.println("No se encontró ningun cargo  con ese ID.");
                        }
                        break;

                    case 3:
                        System.out.println("ID de cargo a modificar: ");
                        Long idMod = sc.nextLong();
                        sc.nextLine();
                        Cargo mod = cDao.Modificar(idMod);
                        if (mod != null) {
                            System.out.println("Nuevo nombre del cargo:");
                            String nuevoNombre = sc.nextLine();
                            System.out.println("Nueva descripción:");
                            String nuevaDescripcion = sc.nextLine();

                            mod.setNombre(nuevoNombre);
                            mod.setDescripcion(nuevaDescripcion);
                            cDao.guardar(mod);

                            System.out.println("Cargo modificado correctamente.");
                        } else {
                            System.out.println("No se encontró ningún cargo con ese ID.");
                        }
                        break;

                    case 4:
                        System.out.println("ID de cargo a eliminar: ");
                        Long idEliminar = sc.nextLong();
                        boolean eliminada = cDao.Eliminar(idEliminar);
                        if (eliminada) {
                            System.out.println("Cargo eliminada correctamente.");
                        } else {
                            System.out.println("No se encontró ningun cargo con ese ID.");
                        }
                        break;
                }
                break;

            case 2:
                System.out.println("Ingresaste a Empleados.");
                System.out.println("1. Agregar empleado");
                System.out.println("2. Buscar empleado");
                System.out.println("3. Modificar empleado");
                System.out.println("4. Eliminar empleado");
                int op2 = sc.nextInt();
                sc.nextLine();

                switch (op2) {
                    case 1:
                        Empleado nuevoE = new Empleado();
                        System.out.println("Nombre del empleado: ");
                        nuevoE.setNombres(sc.nextLine());
                        System.out.println("Apellidos del empleado: ");
                        nuevoE.setApellidos(sc.nextLine());
                        System.out.println("ID del cargo del empleado:");
                        Long idCarr = sc.nextLong();
                        sc.nextLine();
                        Cargo car = cDao.buscarPorId(idCarr);
                        if (car == null) {
                            System.out.println("No existe un cargo con ese ID. Operación cancelada.");
                            break;
                        }
                        nuevoE.setCargo(car);

                        eDao.guardar(nuevoE);
                        System.out.println("Empleado agregado correctamente");
                        break;

                    case 2:
                        System.out.println("ID del empleado a buscar: ");
                        Long idEBuscar = sc.nextLong();
                        Empleado eEncontrado = eDao.buscarPorId(idEBuscar);
                        if (eEncontrado != null) {
                            System.out.println("Empleado encontrado:");
                            System.out.println("ID: " + eEncontrado.getId());
                            System.out.println("Nombre: " + eEncontrado.getNombres());
                            System.out.println("Apellidos: " + eEncontrado.getApellidos());
                            System.out.println("Cargo: " +
                                    (eEncontrado.getCargo() != null ? eEncontrado.getCargo().getNombre() : "Sin cargo"));
                        } else {
                            System.out.println("No se encontró ningún empleado con ese ID.");
                        }
                        break;

                    case 3:
                        System.out.println("ID del empleado a modificar: ");
                        Long idEMod = sc.nextLong();
                        sc.nextLine();
                        Empleado eMod = eDao.Modificar(idEMod);
                        if (eMod != null) {
                            System.out.println("Nuevo nombre: ");
                            String nuevoNom = sc.nextLine();
                            System.out.println("Nuevos apellidos: ");
                            String nuevoApe = sc.nextLine();

                            System.out.println("Nuevo empleado (ID): ");
                            Long nuevaCarId = sc.nextLong();
                            sc.nextLine();
                            Cargo nuevaCar = cDao.buscarPorId(nuevaCarId);
                            if (nuevaCar == null) {
                                System.out.println("No existe ningún empleado con ese ID. No se modificó.");
                            } else {
                                eMod.setCargo(nuevaCar);
                            }
                            eMod.setNombres(nuevoNom);
                            eMod.setApellidos(nuevoApe);
                            eDao.guardar(eMod);

                            System.out.println("Empleado modificado correctamente.");
                        } else {
                            System.out.println("No se encontró ningún empleado con ese ID.");
                        }
                        break;

                    case 4:
                        System.out.println("ID del empleado a eliminar: ");
                        Long idEEliminar = sc.nextLong();
                        boolean eEliminado = eDao.Eliminar(idEEliminar);
                        if (eEliminado) {
                            System.out.println("Empleado eliminado correctamente.");
                        } else {
                            System.out.println("No se encontró ningún empleado con ese ID.");
                        }
                        break;
                }
                break;
        }

        em.close();
    }
}
