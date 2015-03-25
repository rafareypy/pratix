/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pratix.rest;

import br.com.pratix.service.interfaces.ProductService;
import br.com.pratix.services.ProductServiceImpl;
import com.google.gson.Gson;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author User
 */
@Path("product")
public class RestProduct {

  

    /**
     * Creates a new instance of RestProduct
     */
    public RestProduct() {
    }

    /**
     * Retrieves representation of an instance of br.com.pratix.rest.RestProduct
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        
        ProductService productService = new ProductServiceImpl();
        return new Gson().toJson(productService.getListProduct());
        
    }

    /**
     * PUT method for updating or creating an instance of RestProduct
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
        
    }
}
