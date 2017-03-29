/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VMenuGrupo extends javax.swing.JFrame {

    public VMenuGrupo(Control c) {
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

    private void agregarGrupo() {
        VAgregarGrupo addGrupo = new VAgregarGrupo(gestor);
        addGrupo.init();
        this.dispose();
    }

    private void eliminarGrupo() {
        VEliminarGrupo deleteGrupo = new VEliminarGrupo(gestor);
        deleteGrupo.init();
        this.dispose();
    }

    private void modificarGrupo() {
        VModificarGrupo modGrupo = new VModificarGrupo(gestor);
        modGrupo.init();
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarGrupo = new javax.swing.JButton();
        botonEliminarGrupo = new javax.swing.JButton();
        botonModificarGrupo = new javax.swing.JButton();
        botonBuscarGrupo = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ GRUPO");
        setResizable(false);

        botonAgregarGrupo.setText("Agregar Grupo");
        botonAgregarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarGrupoActionPerformed(evt);
            }
        });

        botonEliminarGrupo.setText("Eliminar Grupo");
        botonEliminarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarGrupoActionPerformed(evt);
            }
        });

        botonModificarGrupo.setText("Modificar Grupo");
        botonModificarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarGrupoActionPerformed(evt);
            }
        });

        botonBuscarGrupo.setText("Buscar Grupo");
        botonBuscarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarGrupoActionPerformed(evt);
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
                            .addComponent(botonAgregarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBuscarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEliminarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarGrupoActionPerformed
        eliminarGrupo();
    }//GEN-LAST:event_botonEliminarGrupoActionPerformed

    private void botonAgregarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarGrupoActionPerformed
        agregarGrupo();
    }//GEN-LAST:event_botonAgregarGrupoActionPerformed

    private void botonModificarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarGrupoActionPerformed
        modificarGrupo();
    }//GEN-LAST:event_botonModificarGrupoActionPerformed

    private void botonBuscarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarGrupoActionPerformed

    }//GEN-LAST:event_botonBuscarGrupoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarGrupo;
    private javax.swing.JButton botonBuscarGrupo;
    private javax.swing.JButton botonEliminarGrupo;
    private javax.swing.JButton botonModificarGrupo;
    private javax.swing.JButton botonVolver;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
