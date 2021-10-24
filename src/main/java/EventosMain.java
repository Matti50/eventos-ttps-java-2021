import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventosMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos");
		
	}

}
