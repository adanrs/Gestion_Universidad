/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import javax.swing.JOptionPane;

public class VEliminarCiclo extends javax.swing.JFrame {

    public VEliminarCiclo(Control c) {
        gestor = c;
        setLocationRelativeTo(null);
        initComponents();
    }

    public void init() {
        setVisible(true);
    }

    private void salir() {
        VMenuCiclo ciclo = new VMenuCiclo(gestor);
        ciclo.init();
        this.dispose();
    }

    private void eliminar() {

        String aux = campoAño.getText() + "-" + campoNumCiclo.getText();
        if (campoAño.getText().isEmpty() || campoNumCiclo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (!gestor.existeCiclo(aux)) {
            JOptionPane.showMessageDialog(null, "Ciclo NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            gestor.BorrarCarrera(campoAño.getText());
            JOptionPane.showMessageDialog(null, "El curso ha sido eliminado exitosamente", "Error", JOptionPane.INFORMATION_MESSAGE);
            salir();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaAño = new javax.swing.JLabel();
        campoAño = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        campoNumCiclo = new javax.swing.JTextField();
        etiquetaNumCiclo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELIMINAR CICLO");

        etiquetaAño.setText("Año");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        etiquetaNumCiclo.setText("# Ciclo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaNumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonVolver)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(etiquetaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAño)
                    .addComponent(campoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumCiclo)
                    .addComponent(campoNumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonEliminar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoAño;
    private javax.swing.JTextField campoNumCiclo;
    private javax.swing.JLabel etiquetaAño;
    private javax.swing.JLabel etiquetaNumCiclo;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
