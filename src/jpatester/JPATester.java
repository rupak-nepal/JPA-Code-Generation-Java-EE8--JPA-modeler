package jpatester;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rupak
 */
public class JPATester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try{
            emf = Persistence.createEntityManagerFactory("JPATesterPU");
            em = emf.createEntityManager();
            System.out.println("EntityManager created : " + emf);
        }catch(Exception ex){
            Logger.getLogger(JPATester.class.getName())
                    .log(Level.SEVERE,null,ex);
        }finally{
            if(em != null){
                em.close();
            }
            if(emf != null){
                emf.close();
            }
        
        }
    }
    
}
