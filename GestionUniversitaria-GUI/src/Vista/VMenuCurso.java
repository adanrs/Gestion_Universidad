/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VMenuCurso extends javax.swing.JFrame {

    public VMenuCurso(Control c) {
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

    private void agregarCurso() {
        VAgregarCurso addCurso = new VAgregarCurso(gestor);
        addCurso.init();
        this.dispose();
    }

    private void eliminarCurso() {
        VEliminarCurso deleteCurso = new VEliminarCurso(gestor);
        deleteCurso.init();
        this.dispose();
    }

    private void modificarCurso() {
        VModificarCurso modCurso = new VModificarCurso(gestor);
        modCurso.init();
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarCurso = new javax.swing.JButton();
        botonEliminarCurso = new javax.swing.JButton();
        botonModificarCurso = new javax.swing.JButton();
        botonBuscarCurso = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonAgregarCurso.setText("Agregar Curso");
        botonAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCursoActionPerformed(evt);
            }
        });

        botonEliminarCurso.setText("Eliminar Curso");
        botonEliminarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCursoActionPerformed(evt);
            }
        });

        botonModificarCurso.setText("Modificar Curso");
        botonModificarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCursoActionPerformed(evt);
            }
        });

        botonBuscarCurso.setText("Buscar Curso");
        botonBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCursoActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBuscarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEliminarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCursoActionPerformed
        eliminarCurso();
    }//GEN-LAST:event_botonEliminarCursoActionPerformed

    private void botonAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCursoActionPerformed
        agregarCurso();
    }//GEN-LAST:event_botonAgregarCursoActionPerformed

    private void botonModificarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCursoActionPerformed
        modificarCurso();
    }//GEN-LAST:event_botonModificarCursoActionPerformed

    private void botonBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCurso;
    private javax.swing.JButton botonBuscarCurso;
    private javax.swing.JButton botonEliminarCurso;
    private javax.swing.JButton botonModificarCurso;
    private javax.swing.JButton botonVolver;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
