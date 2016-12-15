/*
Clase para generar el archivo
 */
package com.trillas.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class DAOGenerator {

    private File directorio;
    private String plantillaDAO;
    private String plantillaDAOImp;
    private List<File> archivos;
    private String paqueteRoot;
    private String paquete;

    public DAOGenerator() {
    }

    public DAOGenerator(File directorio, String plantillaDAO, String plantillaDAOImp, List<File> archivos, String paqueteRoot, String paquete) {
        this.directorio = directorio;
        this.plantillaDAO = plantillaDAO;
        this.plantillaDAOImp = plantillaDAOImp;
        this.archivos = archivos;
        this.paqueteRoot = paqueteRoot;
        this.paquete = paquete;
    }

    public int crearDAOS() {
        int exitosos = 0;
        // Crear los directorios
        String root = directorio.getParent();
        String RutaDAO = root + "/DAO";
        String RutaDAOImpl = root + "/DAOImpl";
        File dirDAO = new File(RutaDAO);
        dirDAO.mkdirs();
        File dirDAOImpl = new File(RutaDAOImpl);
        dirDAOImpl.mkdirs();
        try {
            for (File archivo : archivos) {
                String nombre = archivo.getName();
                nombre = nombre.substring(0, nombre.indexOf("."));
                String nombreObjeto = nombre.substring(0, 1).toLowerCase() + nombre.substring(1);
                PrintWriter pwDao = new PrintWriter(RutaDAO + "/" + nombre + "DAO.java");
                PrintWriter pwDaoImpl = new PrintWriter(RutaDAOImpl + "/" + nombre + "DAOImpl.java");
                pwDao.print(prepararDao(nombre, nombreObjeto));
                pwDaoImpl.print(prepararDaoImpl(nombre, nombreObjeto));
                pwDao.close();
                pwDaoImpl.close();
                exitosos++;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Algo sucedio Mal " + ex);
        }
        return exitosos;
    }

    private String prepararDao(String nombre, String nombreObjeto) {
        String conPackageRoot = plantillaDAO.replace("root", paqueteRoot);
        String conPackage = conPackageRoot.replace("paquete", paquete);
        String conTipo = conPackage.replace("###", nombre);
        return conTipo.replace("$$$", nombreObjeto);
    }

    private String prepararDaoImpl(String nombre, String nombreObjeto) {
        String conPackageRoot = plantillaDAOImp.replace("root", paqueteRoot);
        String conPackage = conPackageRoot.replace("paquete", paquete);
        String conTipo = conPackage.replace("###", nombre);
        return conTipo.replace("$$$", nombreObjeto);
    }
}
