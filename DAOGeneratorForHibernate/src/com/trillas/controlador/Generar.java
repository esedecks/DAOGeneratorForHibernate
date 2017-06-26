/*
Generar los archivos DAO y DAOImpl
 */
package com.trillas.controlador;

import com.trillas.modelo.DAOGenerator;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;

public class Generar {

    public void hacer(File directorio, String plantillaDAO, String plantillaDAOImp, String plantillaController, List<File> archivos, String paquete, String paqueteRoot) {
        if(archivos.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay cargado ningun archivo para generar", "Ningun Archivo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(paquete.equals("")){
            JOptionPane.showMessageDialog(null, "No se ha encontrado un package", "Sin package", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Pasarlo parametros para el genrador
        DAOGenerator generator = new DAOGenerator(directorio,plantillaDAO,plantillaDAOImp,plantillaController,archivos,paqueteRoot,paquete);
        int exitosos = generator.crearDAOS();
        // root,directorio,plantillas,archivos
        JOptionPane.showMessageDialog(null, "Total de archvos exitosos: " + exitosos);
    }

}
