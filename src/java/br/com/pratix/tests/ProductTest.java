/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pratix.tests;

import br.com.pratix.model.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class ProductTest {
     public static void main(String args[]){
    
        EntityManagerFactory  emf = Persistence.createEntityManagerFactory("pratixApiLocal");
        EntityManager  em = emf.createEntityManager();
        
        try {
            Product product = new Product();
            
            product.setName("test1");
            
            em.getTransaction().begin();
            em.persist(product);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            
        }finally{
            em.close();
            emf.close();
        }
        
    }
}
