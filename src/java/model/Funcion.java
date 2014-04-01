package model;
// Generated 06/03/2014 04:49:02 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Funcion generated by hbm2java
 */
@Entity
@Table(name="funcion"
    ,schema="public"
)
public class Funcion  implements java.io.Serializable {


     private String cedula;
     private Empleado empleado;
     private String tipo;

    public Funcion() {
    }

    public Funcion(Empleado empleado, String tipo) {
       this.empleado = empleado;
       this.tipo = tipo;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="empleado"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="cedula", unique=true, nullable=false, length=15)
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    @Column(name="tipo", nullable=false, length=100)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}


