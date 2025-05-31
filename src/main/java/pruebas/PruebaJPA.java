package pruebas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PruebaJPA {
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Semana01-Alt");
        emf.close();
    }
}
