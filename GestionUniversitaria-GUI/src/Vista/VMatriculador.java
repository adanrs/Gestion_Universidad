/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VMatriculador extends javax.swing.JFrame {

    public VMatriculador(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMatricularEstudiante = new javax.swing.JButton();
        botonDesmatricularEstudiante = new javax.swing.JButton();
        javax.swing.JButton botonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATRICULADOR");
        setResizable(false);

        botonMatricularEstudiante.setText("Matricular Estudiante");
        botonMatricularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatricularEstudianteActionPerformed(evt);
            }
        });

        botonDesmatricularEstudiante.setText("Desmatricular Estudiante");
        botonDesmatricularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesmatricularEstudianteActionPerformed(evt);
            }
        });

        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonMatricularEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDesmatricularEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMatricularEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDesmatricularEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCerrarSesion)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        VLogIn li = new VLogIn();
        li.init();
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonMatricularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatricularEstudianteActionPerformed
        irMatricular();
        this.dispose();
    }//GEN-LAST:event_botonMatricularEstudianteActionPerformed

    private void botonDesmatricularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesmatricularEstudianteActionPerformed
        irDesmatricular();
        this.dispose();
    }//GEN-LAST:event_botonDesmatricularEstudianteActionPerformed

    public void init() {
        setVisible(true);
    }

    private void irMatricular() {
        VMatricular matr = new VMatricular(gestor);
        matr.init();
        this.dispose();
    }

    private void irDesmatricular() {

        VDesmatricular desm = new VDesmatricular(gestor);
        desm.init();
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDesmatricularEstudiante;
    private javax.swing.JButton botonMatricularEstudiante;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
