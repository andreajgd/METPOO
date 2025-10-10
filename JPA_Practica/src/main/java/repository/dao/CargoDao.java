package repository.dao;

import entities.Cargo;
import jakarta.persistence.EntityManager;
import repository.ICargo;

import java.util.List;

public class CargoDao implements ICargo {
    private final EntityManager em;

    public CargoDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Cargo guardar(Cargo cargo) {
        em.getTransaction().begin();
        if (cargo.getId() == null) {
            em.persist(cargo);
        } else {
            em.merge(cargo);
        }
        em.getTransaction().commit();
        return cargo;
    }

    @Override
    public List<Cargo> listar() {
        return em.createQuery("from Cargo", Cargo.class).getResultList();
    }

    @Override
    public Cargo buscarPorId(Long id) {
        return em.find(Cargo.class, id);
    }

    @Override
    public Cargo Modificar(Long id) {
        Cargo cargo = em.find(Cargo.class, id);
        if (cargo != null) {
            return cargo;
        }
        return null;
    }

    @Override
    public boolean Eliminar(Long id) {
        Cargo cargo = em.find(Cargo.class, id);
        if (cargo != null) {
            em.getTransaction().begin();
            em.remove(cargo);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }
}
