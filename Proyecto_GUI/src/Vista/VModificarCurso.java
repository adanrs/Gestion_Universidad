/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import Modelo.Curso;
import javax.swing.JOptionPane;

public class VModificarCurso extends javax.swing.JFrame {

    public VModificarCurso(Control c) {
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

    private boolean vacio() {
        if (campoNombre.getText().isEmpty()
                || campoCreditos.getText().isEmpty()
                || campoHSemanales.getText().isEmpty()
                || campoCiclo.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private void modificar() {
        if (vacio()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Curso c = new Curso();
            c.setNombre(campoNombre.getText());
            c.setCreditos(Integer.parseInt(campoCreditos.getText()));
            c.setHsemanales(Integer.parseInt(campoHSemanales.getText()));
            c.setNum_ciclo(Integer.parseInt(campoCiclo.getText()));
            c.setCodigo(campoCod.getText());
            gestor.ActualizarCurso(c);
            salir();
        }

    }

    private void buscar() {
        if (campoCod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            if (!gestor.existeCur(campoCod.getText())) {
                JOptionPane.showMessageDialog(null, "Curso NO EXISTE ", "Error", JOptionPane.ERROR_MESSAGE);
                salir();
            } else {
                Curso c = new Curso();
                gestor.MostrarCurso(c, campoCod.getText(), 2);
                campoNombre.setText(c.getNombre());
                campoCreditos.setText(String.valueOf(c.getCreditos()));
                campoHSemanales.setText(String.valueOf(c.getHsemanales()));
                campoCiclo.setText(String.valueOf(c.getNum_ciclo()));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonModificar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        etiquetaCreditos = new javax.swing.JLabel();
        etiquetaHSemanales = new javax.swing.JLabel();
        etiquetaCiclo = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoCreditos = new javax.swing.JTextField();
        campoHSemanales = new javax.swing.JTextField();
        campoCiclo = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        etiquetaCod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MODIFICAR CURSO");

        botonModificar.setText("Modificar");
        botonModificar.setToolTipText("");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        etiquetaNombre.setText("Nombre");
        etiquetaNombre.setToolTipText("");

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FINDD.png"))); // NOI18N
        botonBuscar.setToolTipText("");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        etiquetaCreditos.setText("Créditos");
        etiquetaCreditos.setToolTipText("");

        etiquetaHSemanales.setText("Horas Semanales");
        etiquetaHSemanales.setToolTipText("");

        etiquetaCiclo.setText("Ciclo");
        etiquetaCiclo.setToolTipText("");

        campoCod.setToolTipText("");

        campoNombre.setToolTipText("");

        campoCreditos.setToolTipText("");

        campoHSemanales.setToolTipText("");

        campoCiclo.setToolTipText("");

        botonVolver.setText("Volver");
        botonVolver.setToolTipText("");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        etiquetaCod.setText("Codigo");
        etiquetaCod.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaHSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoHSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(etiquetaCod)
                    .addComponent(campoCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaCreditos)
                    .addComponent(campoCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaHSemanales)
                    .addComponent(campoHSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCiclo)
                    .addComponent(campoCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar)
                    .addComponent(botonVolver))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        salir();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_botonModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoCiclo;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoCreditos;
    private javax.swing.JTextField campoHSemanales;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaCiclo;
    private javax.swing.JLabel etiquetaCod;
    private javax.swing.JLabel etiquetaCreditos;
    private javax.swing.JLabel etiquetaHSemanales;
    private javax.swing.JLabel etiquetaNombre;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
