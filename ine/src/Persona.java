/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miche
 */
public class Persona {
    private String nombre;
    private String direccion;
    private String clavelector;
    private String curp;

    public Persona(String nombre, String direccion,String clavelector,String curp) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.curp = curp;
        this.clavelector = clavelector;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp){
        this.curp = curp;
    }
    public String getClaveLector() {
        return clavelector;
    }
    public void setClaveLector(){
    this.clavelector = clavelector;
    }
    
    
}
