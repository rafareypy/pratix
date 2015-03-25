/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pratix.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class JPAUtil {
    
    
    private static EntityManagerFactory emf = null;
      private static EntityManager em = null;

      public static EntityManagerFactory getEntityManagerFactory() {
            if (emf == null)
                 emf = Persistence.createEntityManagerFactory("pratixPU");
            return emf;
      }

       public static EntityManager getEntityManager() {
             if (em != null && em.isOpen())
                   return em;
             else {
                   em = getEntityManagerFactory().createEntityManager();
                   return em;
             }
       }    
}
