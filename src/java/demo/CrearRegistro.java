/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;



import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;
/**
/**
 *
 * @author LAB.INFORMATICA12
 */
public class CrearRegistro {
    
    public static void main (String [] args) { 
        
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU"); 
EntityManager em = emf.createEntityManager ();

em.getTransaction().begin();

Registradora k1 = new Registradora();

k1.setId(111);
// k1.setIdAsociado(Asociado,idAsociado);
// k1.setIdAsociado("idAsociado ", " 10101");
//k1.setFecha(DATE ,"45");
em.persist(k1);
em.getTransaction().commit();




em.close (); 
emf.close ();

}
   
}

  


    
    

