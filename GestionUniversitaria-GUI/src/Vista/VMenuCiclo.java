/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VMenuCiclo extends javax.swing.JFrame {

    public VMenuCiclo(Control c) {
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

    private void agregarCiclo() {
        VAgregarCiclo addCiclo = new VAgregarCiclo(gestor);
        addCiclo.init();
        this.dispose();
    }

    private void eliminarCiclo() {
        VEliminarCiclo deleteCiclo = new VEliminarCiclo(gestor);
        deleteCiclo.init();
        this.dispose();
    }

    private void modificarCiclo() {
        VModificarCiclo modCiclo = new VModificarCiclo(gestor);
        modCiclo.init();
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarCiclo = new javax.swing.JButton();
        botonEliminarCiclo = new javax.swing.JButton();
        botonModificarCiclo = new javax.swing.JButton();
        botonBuscarCiclo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ CICLO");
        setResizable(false);

        botonAgregarCiclo.setText("Agregar Ciclo");
        botonAgregarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCicloActionPerformed(evt);
            }
        });

        botonEliminarCiclo.setText("Eliminar Ciclo");
        botonEliminarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCicloActionPerformed(evt);
            }
        });

        botonModificarCiclo.setText("Modificar Ciclo");
        botonModificarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCicloActionPerformed(evt);
            }
        });

        botonBuscarCiclo.setText("Buscar Ciclo");
        botonBuscarCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCicloActionPerformed(evt);
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
                            .addComponent(botonAgregarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBuscarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEliminarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCicloActionPerformed
        eliminarCiclo();
    }//GEN-LAST:event_botonEliminarCicloActionPerformed

    private void botonBuscarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarCicloActionPerformed

    private void botonModificarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCicloActionPerformed
        modificarCiclo();
    }//GEN-LAST:event_botonModificarCicloActionPerformed

    private void botonAgregarCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCicloActionPerformed
        agregarCiclo();
    }//GEN-LAST:event_botonAgregarCicloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCiclo;
    private javax.swing.JButton botonBuscarCiclo;
    private javax.swing.JButton botonEliminarCiclo;
    private javax.swing.JButton botonModificarCiclo;
    private javax.swing.JButton botonVolver;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
