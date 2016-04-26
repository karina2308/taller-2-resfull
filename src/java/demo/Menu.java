/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 */
/**
 *
 * @author Karina MartinezV
 */
public class Menu {
    
public static void main (String [] args) {    
        
  {
            
            int Opcion;
do{    

Opcion = Integer.parseInt(JOptionPane.showInputDialog ("MENU DEL TALLER JAVA AVANZADO \n1 -> CREAR \n2 -> MODIFICAR \n3 -> ELIMINAR"));

switch (Opcion) {
case 1:
  
JOptionPane.showMessageDialog(null ," Insertar registro");

{
    crear();
}
break;

case 2:

JOptionPane.showMessageDialog(null ," Modificar registro");
{
    Modificar();
}
break;

case 3:

JOptionPane.showMessageDialog(null ," Eliminar registro");
{
    eliminar();
}
break;

 } } while (Opcion!=2);
 }
  }

  // menu karina
  
  
     public static void crear() 
            
    {
       
 
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo2PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{
    
    Registradora Registro = new Registradora ();

    Registro.setId(1115);
  //  Registro.setIdAsociado("252525");
  //  Registro.setFecha(23-20-25);
  
    
 
   
    et.begin();
    em.persist(Registro);
    et.commit();
    
   JOptionPane.showMessageDialog(null, "El registro se realizo Correctamente");
        }
catch (Exception ex)
    {
        et.rollback();
       
        JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
        }
finally
{
    em.close();
}

}
     
    public static void Modificar() 
            
    {
       
 
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo2PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{

    
    int Id=101;
    Registradora Registro =em.find(Registradora.class, Id);
    
    Registro.setId(Id);
    //Registro.setIdAsociado("");
    //Registro.setFecha("");

    et.begin();
    em.merge(Registro);
    et.commit();
       
    JOptionPane.showMessageDialog(null, "Edicion realizada ok");
    
        }
     
   catch (Exception ex)
    {
        et.rollback();
        JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
        }
finally
{
    em.close();
}

}

/////metodo de eliminar


public static void  eliminar() 

{
EntityManagerFactory emf = Persistence.createEntityManagerFactory ( "PersistenceDemo2PU");; 
EntityManager em = emf.createEntityManager (); 
EntityTransaction et= em.getTransaction();

try
{

    
    int Id=101;
    Registradora Registro =em.find(Registradora.class, Id);
    
      
    et.begin();
    em.remove(Registro);
    et.commit();
    
   JOptionPane.showMessageDialog(null, "Registro eliminado");
    
        }
     
   catch (Exception ex)
    {
        et.rollback();
        JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
        }
finally
{
    
    em.close();
}



                

    
}
    
}         
             
                
                
            

