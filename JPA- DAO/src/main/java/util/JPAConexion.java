package util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPAConexion {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("uam");
    public static EntityManager getEntityManager() {return emf.createEntityManager();}
    public static void closeEntityManager() {emf.close();}
}
