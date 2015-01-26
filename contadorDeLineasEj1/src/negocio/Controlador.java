/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Vo.Archivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author steven
 */
public class Controlador {
 public Controlador (){}
    public void AgregarATabla (File f, JTable tabla,int control) throws IOException
    {
     
     //   Object columnNames []= {   "Nombre", "Numero de lineas", "Numero de metodos ", "Numero de clases", "Numero de comentarios"};
        
          /*jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Numero de lineas", "Numero de metodos ", "Numero de clases", "Numero de comentarios"
            }
        */
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        
        Archivos ar=new Archivos();
        ar.setId(control+"");
        ar.setName(f.getName());        
        ar.setN_lineas(contarlineas(f));
        ar.setN_metodos(countMeto(f));
        ar.setN_clases(countClass(f));
        ar.setN_comentarios(countComent(f));
        model.addRow(new Object[]{ar.getId(),ar.getName(),ar.getN_lineas(),ar.getN_metodos(),ar.getN_clases(),ar.getN_comentarios()});
    }

    private String contarlineas(File f) throws IOException 
    {
        int lineas=0;
            BufferedReader lector;
            
                lector = new BufferedReader(new FileReader(f));
                System.out.println("Entra1");
                while(lector.readLine()!=null)
                {
                    //System.out.println("Entra2");
                    lineas++;
                    //lector.readLine();
                }
            
            return lineas+"";
  
    }

    private String countMeto(File f) throws IOException {
        int metodos=0;
            BufferedReader lector;
            
                lector = new BufferedReader(new FileReader(f));
                System.out.println("Entra1");
                while(lector.readLine()!=null)
                {
                    //System.out.println("Entra2");
                    if(lector.readLine().contains("){") ||lector.readLine().contains(")\n{") )
                    metodos++;
                    //lector.readLine();
                }
            
            return metodos+"";
        
        
        
    }

    private String countClass(File f) throws IOException {
          int clases=0;
            BufferedReader lector;
            
                lector = new BufferedReader(new FileReader(f));
                System.out.println("Entra1");
                while(lector.readLine()!=null)
                {
                    //System.out.println("Entra2");
                    if(lector.readLine().contains("class") )
                    clases++;
                    //lector.readLine();
                }            
            return clases+"";       
        
    }

    private String countComent(File f) throws IOException {

          int comentarios=0;
            BufferedReader lector;
            
                lector = new BufferedReader(new FileReader(f));
                System.out.println("Entra1");
                while(lector.readLine()!=null)
                {
                    //System.out.println("Entra2");
                    if(lector.readLine().contains("//") )
                    comentarios++;
                    //lector.readLine();
                }            
            return comentarios+"";       
        
    }
    
}
