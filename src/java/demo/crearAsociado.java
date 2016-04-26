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
 *
 * @author LAB.INFORMATICA12
 */
public class crearAsociado {
    
    
        public static void main (String [] args) { 
        
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo1PU"); 
EntityManager em = emf.createEntityManager ();

em.getTransaction().begin();

Asociado a1 = new Asociado();

a1.setNombre("camilo martinez");
em.persist(a1);



em.getTransaction().commit();

em.close (); 
emf.close ();


}
        }
