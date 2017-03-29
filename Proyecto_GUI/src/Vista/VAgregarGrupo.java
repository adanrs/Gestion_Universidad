/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import javax.swing.JOptionPane;

public class VAgregarGrupo extends javax.swing.JFrame {

    public VAgregarGrupo(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    public void init() {
        setVisible(true);
    }

    private void salir() {
        VMenuGrupo grupo = new VMenuGrupo(gestor);
        grupo.init();
        this.dispose();
    }

    private boolean vacio() {
        if (campoNumGrupo.getText().isEmpty()
                || campoHorario.getText().isEmpty()
                || campoCedProfe.getText().isEmpty()
                || campoCodCurso.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void agregar() {

        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String aux = campoCodCurso.getText() + "-" + campoNumGrupo.getText();
            if (!gestor.existeCur(campoCodCurso.getText())) {
                JOptionPane.showMessageDialog(null, "Curso NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (!gestor.existePro(campoCedProfe.getText())) {
                JOptionPane.showMessageDialog(null, "Profesor NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (gestor.existeGrupo(aux)) {
                JOptionPane.showMessageDialog(null, "Grupo YA EXISTE ", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                int aux1 = Integer.parseInt(campoNumGrupo.getText());

                gestor.agregarGrupo(aux1, campoHorario.getText(), campoCedProfe.getText(),
                        campoCodCurso.getText());
                salir();

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCodCurso = new javax.swing.JTextField();
        etiquetaCodCurso = new javax.swing.JLabel();
        campoNumGrupo = new javax.swing.JTextField();
        campoHorario = new javax.swing.JTextField();
        etiquetaNumGrupo = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        etiquetaHorario = new javax.swing.JLabel();
        campoCedProfe = new javax.swing.JTextField();
        etiquetaCedProfe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGREGAR CURSO");

        etiquetaCodCurso.setText("Código Curso");

        etiquetaNumGrupo.setText("Numero Grupo");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        etiquetaHorario.setText("Horario");

        etiquetaCedProfe.setText("Cédula Profesor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addGap(193, 193, 193)
                        .addComponent(botonAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaCedProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiquetaNumGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiquetaCodCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNumGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumGrupo)
                    .addComponent(campoNumGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaHorario)
                    .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCedProfe)
                    .addComponent(campoCedProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodCurso)
                    .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonAgregar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoCedProfe;
    private javax.swing.JTextField campoCodCurso;
    private javax.swing.JTextField campoHorario;
    private javax.swing.JTextField campoNumGrupo;
    private javax.swing.JLabel etiquetaCedProfe;
    private javax.swing.JLabel etiquetaCodCurso;
    private javax.swing.JLabel etiquetaHorario;
    private javax.swing.JLabel etiquetaNumGrupo;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
