/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author steven
 */
public class Archivos {
    private String id;
    private String Name;
    private String N_lineas;
    private String N_metodos;
    private String N_clases;
    private String N_comentarios;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the N_lineas
     */
    public String getN_lineas() {
        return N_lineas;
    }

    /**
     * @param N_lineas the N_lineas to set
     */
    public void setN_lineas(String N_lineas) {
        this.N_lineas = N_lineas;
    }

    /**
     * @return the N_metodos
     */
    public String getN_metodos() {
        return N_metodos;
    }

    /**
     * @param N_metodos the N_metodos to set
     */
    public void setN_metodos(String N_metodos) {
        this.N_metodos = N_metodos;
    }

    /**
     * @return the N_clases
     */
    public String getN_clases() {
        return N_clases;
    }

    /**
     * @param N_clases the N_clases to set
     */
    public void setN_clases(String N_clases) {
        this.N_clases = N_clases;
    }

    /**
     * @return the N_comentarios
     */
    public String getN_comentarios() {
        return N_comentarios;
    }

    /**
     * @param N_comentarios the N_comentarios to set
     */
    public void setN_comentarios(String N_comentarios) {
        this.N_comentarios = N_comentarios;
    }

    public Archivos(String id, String Name, String N_lineas, String N_metodos, String N_clases, String N_comentarios) {
        this.id = id;
        this.Name = Name;
        this.N_lineas = N_lineas;
        this.N_metodos = N_metodos;
        this.N_clases = N_clases;
        this.N_comentarios = N_comentarios;
    }

    public Archivos() {
    }
    
    
    public String toString()
    {
         return this.Name;
     }
    
}
