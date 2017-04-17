/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import javax.swing.JOptionPane;

public class VEliminarCurso extends javax.swing.JFrame {

    public VEliminarCurso(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    public void init() {
        setVisible(true);
    }

    private void salir() {
        VMenuCurso curso = new VMenuCurso(gestor);
        curso.init();
        this.dispose();
    }

    private void eliminar() {

        if (campoCodCurso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!gestor.existeCiclo(campoCodCurso.getText())) {
            JOptionPane.showMessageDialog(null, "Curso NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            gestor.BorrarCarrera(campoCodCurso.getText());
            JOptionPane.showMessageDialog(null, "El cuso ha sido eliminado exitosamente", "Error", JOptionPane.INFORMATION_MESSAGE);
            salir();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaCodCurso = new javax.swing.JLabel();
        campoCodCurso = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELIMINAR CURSO");

        etiquetaCodCurso.setText("Codigo del Curso");

        botonVolver.setText("Volver");

        botonEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCodCurso)
                        .addGap(18, 18, 18)
                        .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodCurso)
                    .addComponent(campoCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonEliminar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoCodCurso;
    private javax.swing.JLabel etiquetaCodCurso;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
