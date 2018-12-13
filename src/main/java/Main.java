import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory xxx = Persistence.createEntityManagerFactory("xxx");
        EntityManager conection = xxx.createEntityManager();
        conection.getTransaction().begin();

        conection.close();
        xxx.close();

    }
}
