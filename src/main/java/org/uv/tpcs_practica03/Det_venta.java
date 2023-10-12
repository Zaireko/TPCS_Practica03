/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcs_practica03;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Asus
 */
@Entity(name="detalle_venta")
public class Det_venta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Short id_detalle;
    
    @Column
    private Short id_venta;
    
    @Column
    private Short id_producto;
    
    @Column
    private int cantidad;
    
    @Column
    private String descripcion;
    
    @Column
    private BigDecimal total;
}
