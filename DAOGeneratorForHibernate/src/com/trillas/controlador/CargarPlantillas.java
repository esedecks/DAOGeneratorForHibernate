/*
Cargar las plantillas
 */
package com.trillas.controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CargarPlantillas {

    private String platillaDAO;
    private String plantillaDAOImpl;

    public String hacerDao() {
        platillaDAO = "";
        try {
            File pd = new File("plantillas/plantilla_DAO.txt");
            Scanner s = new Scanner(pd);
            while (s.hasNextLine()) {
                platillaDAO += s.nextLine() + "\n";
            }
            s = new Scanner(pd);
            while (s.hasNextLine()) {
                plantillaDAOImpl += s.nextLine() + "\n";
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error en la lectura de las plantillas " + ex);
            JOptionPane.showMessageDialog(null, "No se encontro la plantilla de DAO", "Error, archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        }
        return platillaDAO;
    }

    public String hacerDaoImpl() {
        plantillaDAOImpl = "";
        try {
            File pdi = new File("plantillas/plantilla_DAOImpl.txt");
            Scanner s = new Scanner(pdi);
            while (s.hasNextLine()) {
                plantillaDAOImpl += s.nextLine() + "\n";
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error en la lectura de las plantillas " + ex);
            JOptionPane.showMessageDialog(null, "No se encontro la plantilla de DAOImpl", "Error, archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        }
        return plantillaDAOImpl;
    }

}
