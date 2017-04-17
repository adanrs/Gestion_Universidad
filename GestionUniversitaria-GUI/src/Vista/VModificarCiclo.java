/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import Modelo.Ciclo;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VModificarCiclo extends javax.swing.JFrame {

    public VModificarCiclo(Control c) {
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

    private boolean vacio() {
        if (campoAñoCiclo.getText().isEmpty()
                || campoNumCiclo.getText().isEmpty()
                || campoFechInicio.getText().isEmpty()
                || campoFechFin.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void buscar() {
        if (campoCiclo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            if (!gestor.existeCiclo(campoCiclo.getText())) {
                JOptionPane.showMessageDialog(null, "Curso NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Ciclo c = new Ciclo();
                gestor.buscar(c, campoCiclo.getText());
                campoAñoCiclo.setText(String.valueOf(c.getAnno()));
                campoNumCiclo.setText(String.valueOf(c.getNciclo()));
                campoFechInicio.setText(c.getFinicio());
                campoFechFin.setText(c.getFinicio());

            }
        }
    }

    private void modificar() {
        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Curso NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String aux = campoCiclo.getText();
            Ciclo c = new Ciclo();
            c.setAnno(Integer.parseInt(campoAñoCiclo.getText()));
            c.setNciclo(Integer.parseInt(campoNumCiclo.getText()));
            c.setFinicio(campoFechInicio.getText());
            c.setFfinal(campoFechFin.getText());
            c.setId(campoAñoCiclo.getText() + campoNumCiclo.getText());
            gestor.actualizar(c, aux);
            salir();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaCiclo = new javax.swing.JLabel();
        etiquetaAñoCiclo = new javax.swing.JLabel();
        etiquetaNumCiclo = new javax.swing.JLabel();
        etiquetaFechInicio = new javax.swing.JLabel();
        etiquetaFechFin = new javax.swing.JLabel();
        campoCiclo = new javax.swing.JTextField();
        campoAñoCiclo = new javax.swing.JTextField();
        campoNumCiclo = new javax.swing.JTextField();
        campoFechInicio = new javax.swing.JTextField();
        campoFechFin = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MODIFICAR CICLO");
        setResizable(false);

        etiquetaCiclo.setText("Ciclo (ej. 201520)");

        etiquetaAñoCiclo.setText("Año del Ciclo");

        etiquetaNumCiclo.setText("# Ciclo");

        etiquetaFechInicio.setText("Fecha de Inicio");

        etiquetaFechFin.setText("Fecha Final");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FINDD.png"))); // NOI18N
        botonBuscar.setToolTipText("");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaNumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaAñoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoAñoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFechInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFechFin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechFin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCiclo)
                    .addComponent(campoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAñoCiclo)
                    .addComponent(campoAñoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaNumCiclo)
                    .addComponent(campoNumCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaFechInicio)
                    .addComponent(campoFechInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaFechFin)
                    .addComponent(campoFechFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoAñoCiclo;
    private javax.swing.JTextField campoCiclo;
    private javax.swing.JTextField campoFechFin;
    private javax.swing.JTextField campoFechInicio;
    private javax.swing.JTextField campoNumCiclo;
    private javax.swing.JLabel etiquetaAñoCiclo;
    private javax.swing.JLabel etiquetaCiclo;
    private javax.swing.JLabel etiquetaFechFin;
    private javax.swing.JLabel etiquetaFechInicio;
    private javax.swing.JLabel etiquetaNumCiclo;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
