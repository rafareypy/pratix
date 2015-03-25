/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pratix.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Product implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public Product(){
    
    }

    
    public Product(String name ){
        this.name   = name ;
    }
    
    
    public Product(Integer id, String name ){
        this.id     = id ;
        this.name   = name ;
    }
    
    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    @Column()
    @SequenceGenerator(name = "seq_product", sequenceName = "seq_product_id", allocationSize = 1  )
    @GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)    
    private Integer id;
    
//    @NotNull(message = "Cacmpo Login esta Nulo!!!")
//    @NotEmpty(message = "Campo Login esta Vacio !!!")
//    @Column(length = 10,nullable=false,unique=true)
    @Column( nullable = false, length = 50)
    @Length(max = 50, message = "The name can not be longer than 50 characters! ")
    @NotEmpty(message = "The name must be informed!")    
    private String name ;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}

