/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pratix.control;

import br.com.pratix.dao.ProductDAO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author User
 */
@ManagedBean(name= "productController")
@ViewScoped
public class ProductController implements Serializable{
    
    @EJB
    private ProductDAO productDAO ;

    /**
     * @return the productDAO
     */
    public ProductDAO getProductDAO() {
        return productDAO;
    }

    /**
     * @param productDAO the productDAO to set
     */
    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
    
    
    
    
}
