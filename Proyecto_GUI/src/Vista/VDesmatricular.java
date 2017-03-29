/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import Modelo.Nota;
import javax.swing.JOptionPane;

public class VDesmatricular extends javax.swing.JFrame {

    public VDesmatricular(Control c) {
        initComponents();
        gestor = c;
        setLocationRelativeTo(null);
    }

    public void init() {
        setVisible(true);
    }

    private boolean vacio() {
        if (campoCedula.getText().isEmpty()
                || campoCodCurso.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void desmatricular() {

        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            Nota n = new Nota();
            gestor.cursado(campoCedula.getText(), campoCodCurso.getText(), n);
            if (n.getCondicion().equals("encurso")) {
                gestor.desmatricula(campoCedula.getText(), campoCodCurso.getText());
                salir();
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no esta matriculado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void salir() {
        VMatriculador m = new VMatriculador(gestor);
        m.init();
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaCedula = new javax.swing.JLabel();
        etiquetaCodCurso = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoCodCurso = new javax.swing.JTextField();
        botonDesmatricular = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DESMATRICULAR");
        setResizable(false);

        etiquetaCedula.setText("Cédula");

        etiquetaCodCurso.setText("Código del Curso");

        botonDesmatricular.setText("Desmatricular");
        botonDesmatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesmatricularActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDesmatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCedula)
                            .addComponent(etiquetaCodCurso))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodCurso)
                    .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDesmatricular)
                    .addComponent(botonCancelar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDesmatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesmatricularActionPerformed
        desmatricular();
    }//GEN-LAST:event_botonDesmatricularActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        salir();
    }//GEN-LAST:event_botonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonDesmatricular;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCodCurso;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaCodCurso;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
