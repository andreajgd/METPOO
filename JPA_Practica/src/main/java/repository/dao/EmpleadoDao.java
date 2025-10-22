package repository.dao;

import entities.Empleado;
import jakarta.persistence.EntityManager;
import repository.IEmpleado;

import java.util.List;

public class EmpleadoDao implements IEmpleado {
    private final EntityManager em;

    public EmpleadoDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        if(empleado.getId()==null){
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
            return empleado;
        }
        return em.merge(empleado);
    }

    @Override
    public List<Empleado> listar() {
        List<Empleado> lista = em.createQuery("from Empleado", Empleado.class).getResultList();
        return lista;
    }

    @Override
    public Empleado buscarPorId(Long id) {
        return em.find(Empleado.class, id);
    }

    @Override
    public Empleado Modificar(Long id) {
        Empleado empleado = em.find(Empleado.class, id);
        if (empleado != null) {
            return empleado;
        }
        return null;
    }

    @Override
    public boolean Eliminar(Long id) {
        Empleado empleado = em.find(Empleado.class, id);
        if (empleado != null) {
            em.getTransaction().begin();
            em.remove(empleado);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }


}
