/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import Modelo.Grupo;
import Modelo.Nota;
import Modelo.Persona;
import javax.swing.JOptionPane;

public class VMatricular extends javax.swing.JFrame {

    public VMatricular(Control c) {
        initComponents();
        gestor = c;
        setLocationRelativeTo(null);
    }

    public void init() {
        setVisible(true);
    }

    private boolean vacio() {
        if (campoCedula.getText().isEmpty()
                || campoCodCurso.getText().isEmpty()
                || campoNumGrupo.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void salir() {
        VMatriculador m = new VMatriculador(gestor);
        m.init();
        this.dispose();
    }

    private void matricular() {

        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            Persona a = new Persona(0);
            gestor.buscarPer(a, campoCedula.getText());
            String id_grupo = campoCodCurso.getText() + "-" + campoNumGrupo.getText();

            if (a.getTipo() != 4) {
                JOptionPane.showMessageDialog(null, "Estudiante NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
                campoCedula.setText("");

            }

            Grupo g = new Grupo();
            gestor.Buscar(g, id_grupo);
            if (g.getId().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Grupo NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
                campoNumGrupo.setText("");
            } else {
                Nota n = new Nota();

                gestor.cursado(a.getCedula(), campoCodCurso.getText(), n);
                if (n.getCondicion() == "encurso" || n.getCondicion() == "aprovado") {
                    JOptionPane.showMessageDialog(null, "Estudiante ya esta matriculado o aprobo el curso", "Error", JOptionPane.ERROR_MESSAGE);
                    campoCedula.setText("");
                } else {
                    n.setCURSO(campoCodCurso.getText());
                    n.setCondicion("encurso");
                    n.setESTUDIANTE(campoCedula.getText());
                    n.setGrupo(Integer.parseInt(id_grupo));
                    gestor.Matricular(n);
                    salir();
                }

            }

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaCedula = new javax.swing.JLabel();
        etiquetaCodCurso = new javax.swing.JLabel();
        etiquetaNumGrupo = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoCodCurso = new javax.swing.JTextField();
        campoNumGrupo = new javax.swing.JTextField();
        botonMatricular = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATRICULAR");
        setResizable(false);

        etiquetaCedula.setText("Cédula");

        etiquetaCodCurso.setText("Códdigo del Curso");

        etiquetaNumGrupo.setText("# Grupo");

        botonMatricular.setText("Matricular");
        botonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMatricularActionPerformed(evt);
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaNumGrupo)
                            .addComponent(etiquetaCodCurso)
                            .addComponent(etiquetaCedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNumGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodCurso)
                    .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumGrupo)
                    .addComponent(campoNumGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMatricular)
                    .addComponent(botonCancelar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMatricularActionPerformed
        matricular();
    }//GEN-LAST:event_botonMatricularActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        salir();
    }//GEN-LAST:event_botonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonMatricular;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCodCurso;
    private javax.swing.JTextField campoNumGrupo;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaCodCurso;
    private javax.swing.JLabel etiquetaNumGrupo;
    // End of variables declaration//GEN-END:variables

    private Control gestor;
}
