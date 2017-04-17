/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VMenuCarrera extends javax.swing.JFrame {

    public VMenuCarrera(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    public void init() {
        setVisible(true);

    }

    private void salir() {
        VAdministrador admi = new VAdministrador(gestor);
        admi.init();
        this.dispose();
    }

    private void agregarCarrera() {
        VAgregarCarrera addCarrera = new VAgregarCarrera(gestor);
        addCarrera.init();
        this.dispose();
    }

    private void eliminarCarrera() {
        VEliminarCarrera deleteCarrera = new VEliminarCarrera(gestor);
        deleteCarrera.init();
        this.dispose();
    }

    private void modificarCarrera() {
        VModificarCarrera modCarrera = new VModificarCarrera(gestor);
        modCarrera.init();
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminarCarrera = new javax.swing.JButton();
        botonModificarCarrera = new javax.swing.JButton();
        botonBuscarCarrera = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        botonAgregarCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ CARRERA");
        setResizable(false);

        botonEliminarCarrera.setText("Eliminar Carrera");
        botonEliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCarreraActionPerformed(evt);
            }
        });

        botonModificarCarrera.setText("Modificar Carrera");
        botonModificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCarreraActionPerformed(evt);
            }
        });

        botonBuscarCarrera.setText("Buscar Carrera");
        botonBuscarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCarreraActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonAgregarCarrera.setText("Agregar Carrera");
        botonAgregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonModificarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(botonAgregarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEliminarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(botonBuscarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEliminarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCarreraActionPerformed
        eliminarCarrera();
    }//GEN-LAST:event_botonEliminarCarreraActionPerformed

    private void botonAgregarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCarreraActionPerformed
        agregarCarrera();
    }//GEN-LAST:event_botonAgregarCarreraActionPerformed

    private void botonModificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCarreraActionPerformed
        modificarCarrera();
    }//GEN-LAST:event_botonModificarCarreraActionPerformed

    private void botonBuscarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarCarreraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCarrera;
    private javax.swing.JButton botonBuscarCarrera;
    private javax.swing.JButton botonEliminarCarrera;
    private javax.swing.JButton botonModificarCarrera;
    private javax.swing.JButton botonVolver;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
