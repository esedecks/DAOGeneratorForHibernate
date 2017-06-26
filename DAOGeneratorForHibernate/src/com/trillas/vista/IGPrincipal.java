/*
 */
package com.trillas.vista;

import com.trillas.controlador.CargarDirectorio;
import com.trillas.controlador.CargarPlantillas;
import com.trillas.controlador.Generar;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IGPrincipal extends javax.swing.JFrame {

    private File directorio;
    private final CargarDirectorio cargarDirectorio;
    private final CargarPlantillas cargarPlantillas;
    private final Generar generar;
    private String plantillaDAO;
    private String plantillaDAOImpl;
    private String plantillaController;
    private String paquete;
    private List<File> archivos;
    private String paqueteRoot;

    public IGPrincipal() {
        cargarDirectorio = new CargarDirectorio();
        cargarPlantillas = new CargarPlantillas();
        generar = new Generar();
        archivos = new ArrayList<>();
        paquete = "";
        paqueteRoot = "";
        initComponents();
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        textoDirectorioPojos = new javax.swing.JTextField();
        botonDirectorioPOJOS = new javax.swing.JButton();
        etiquetaConfiguracion = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        etiquetaDirectorioPOJOS = new javax.swing.JLabel();
        etiquetaPackage = new javax.swing.JLabel();
        textoPackageRoot = new javax.swing.JTextField();
        etiquetaPlantillas = new javax.swing.JLabel();
        textoPlantillas = new javax.swing.JTextField();
        botonDirectorioPlantillas = new javax.swing.JButton();
        botonGenerar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        etiquetaEstado = new javax.swing.JLabel();
        etiquetaDAO = new javax.swing.JLabel();
        etiquetaDAOImpl = new javax.swing.JLabel();
        etiquetaDAO1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dao Generator by '____'");
        setResizable(false);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaTitulo.setText("DAO Generator for Hibernate");

        botonDirectorioPOJOS.setText("Directorio");
        botonDirectorioPOJOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDirectorioPOJOSActionPerformed(evt);
            }
        });

        etiquetaConfiguracion.setText("Configuración");

        etiquetaDirectorioPOJOS.setText("Directorio de los POJO'S de Hibernate");

        etiquetaPackage.setText("Package");

        textoPackageRoot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cambiarPackage(evt);
            }
        });

        etiquetaPlantillas.setText("Platillas");

        textoPlantillas.setEnabled(false);

        botonDirectorioPlantillas.setText("Directorio");
        botonDirectorioPlantillas.setEnabled(false);

        botonGenerar.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        botonGenerar.setText("Generar");
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        etiquetaEstado.setText("No hay archivos cargados");

        etiquetaDAO.setText("PackageDAO");

        etiquetaDAOImpl.setText("PackageDAOImpl");

        etiquetaDAO1.setText("PackageController");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoPackageRoot))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textoDirectorioPojos, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDirectorioPOJOS))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir)
                        .addGap(28, 28, 28)
                        .addComponent(botonGenerar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDirectorioPlantillas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaPlantillas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(etiquetaTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(etiquetaConfiguracion))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaDirectorioPOJOS))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaPackage))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaDAO))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaDAOImpl))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiquetaDAO1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(etiquetaDirectorioPOJOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDirectorioPojos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDirectorioPOJOS))
                .addGap(18, 18, 18)
                .addComponent(etiquetaPackage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPackageRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDAO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDAOImpl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaDAO1)
                .addGap(18, 18, 18)
                .addComponent(etiquetaPlantillas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDirectorioPlantillas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(botonGenerar))
                .addGap(18, 18, 18)
                .addComponent(etiquetaEstado)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonDirectorioPOJOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDirectorioPOJOSActionPerformed
        // Cargar directorio
        directorio = cargarDirectorio.hacer(textoDirectorioPojos);
        if (directorio != null) {
            archivos = cargarDirectorio.validar(directorio, etiquetaEstado);
            paquete = cargarDirectorio.getPaquete(archivos, textoPackageRoot);
            paqueteRoot = cargarDirectorio.getPackageRoot(archivos, paquete, etiquetaDAO, etiquetaDAOImpl);
        }
    }//GEN-LAST:event_botonDirectorioPOJOSActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // Salir
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        // Genrar los archivos
        generar.hacer(directorio, plantillaDAO, plantillaDAOImpl,plantillaController, archivos, paquete, paqueteRoot);
    }//GEN-LAST:event_botonGenerarActionPerformed

    private void cambiarPackage(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cambiarPackage
        // Cambiando el package
        if (evt.getKeyChar() == 8) {
            paqueteRoot = paqueteRoot.substring(0, paqueteRoot.length() - 1);
            etiquetaDAO.setText("PackageDAO " + paqueteRoot + ".DAO");
            etiquetaDAOImpl.setText("PackageDAOImpl " + paqueteRoot + ".DAOImpl");
        } else {
            paqueteRoot += evt.getKeyChar();
            etiquetaDAO.setText("PackageDAO " + paqueteRoot + ".DAO");
            etiquetaDAOImpl.setText("PackageDAOImpl " + paqueteRoot + ".DAOImpl");
        }
    }//GEN-LAST:event_cambiarPackage

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println("Error " + ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new IGPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDirectorioPOJOS;
    private javax.swing.JButton botonDirectorioPlantillas;
    private javax.swing.JButton botonGenerar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaConfiguracion;
    private javax.swing.JLabel etiquetaDAO;
    private javax.swing.JLabel etiquetaDAO1;
    private javax.swing.JLabel etiquetaDAOImpl;
    private javax.swing.JLabel etiquetaDirectorioPOJOS;
    private javax.swing.JLabel etiquetaEstado;
    private javax.swing.JLabel etiquetaPackage;
    private javax.swing.JLabel etiquetaPlantillas;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField textoDirectorioPojos;
    private javax.swing.JTextField textoPackageRoot;
    private javax.swing.JTextField textoPlantillas;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        // Cargar plantillas
        plantillaDAO = cargarPlantillas.hacerDao();
        plantillaDAOImpl = cargarPlantillas.hacerDaoImpl();
        plantillaController = cargarPlantillas.hacerController();
        if (plantillaDAO.equals("") || plantillaDAOImpl.equals("") || plantillaController.equals("")) {
            botonGenerar.setEnabled(false);
        }
    }

}
