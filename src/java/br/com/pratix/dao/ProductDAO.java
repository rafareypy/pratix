/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pratix.dao;

import br.com.pratix.model.Product;
import br.com.pratix.util.JPAUtil;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author User
 */
@Stateless
public class ProductDAO implements Serializable{
    
    @PersistenceUnit(unitName = "pratixPU")
    private EntityManager em ;
    
    public ProductDAO(){
        em = JPAUtil.getEntityManager();
    }
            
    
    private List<Product> products ;

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the products
     */
    public List<Product> getProducts() {
        return em.createQuery("from Product ").getResultList();
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
    
}
