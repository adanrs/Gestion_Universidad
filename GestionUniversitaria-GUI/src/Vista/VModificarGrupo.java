/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;
import Modelo.Grupo;
import Modelo.Persona;
import javax.swing.JOptionPane;

public class VModificarGrupo extends javax.swing.JFrame {

    public VModificarGrupo(Control c) {
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

    private void buscar() {
        if (campoCodYNumGrupo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            if (!gestor.existeGrupo(campoCodYNumGrupo.getText())) {
                JOptionPane.showMessageDialog(null, "Grupo NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
                salir();
            } else {
                Grupo g = new Grupo();
                gestor.Buscar(g, campoCodYNumGrupo.getText());
                campoCedProfe.setText(g.getProfesor());
            }
        }
    }

    private void modificar() {
        if (campoCedProfe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Persona p = new Persona(0);
            gestor.buscarPer(p, campoCedProfe.getText());
            if (p.getTipo() != 3) {
                JOptionPane.showMessageDialog(null, "Profesor NO EXISTE", "Error", JOptionPane.ERROR_MESSAGE);
                VAgregarProfesor vi = new VAgregarProfesor(gestor);
                vi.init();
                this.dispose();
            } else {
                Grupo c = new Grupo();
                c.setProfesor(campoCedProfe.getText());
                c.setId(campoCodYNumGrupo.getText());
                gestor.actualizar(c);
                salir();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonModificar = new javax.swing.JButton();
        etiquetaCedProfe = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        campoCodYNumGrupo = new javax.swing.JTextField();
        campoCedProfe = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();
        etiquetaCodCursoYNumGrupo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonModificar.setText("Modificar");
        botonModificar.setToolTipText("");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        etiquetaCedProfe.setText("Cedula Profesor");
        etiquetaCedProfe.setToolTipText("");

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FINDD.png"))); // NOI18N
        botonBuscar.setToolTipText("");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        campoCodYNumGrupo.setToolTipText("");

        campoCedProfe.setToolTipText("");

        botonVolver.setText("Volver");
        botonVolver.setToolTipText("");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        etiquetaCodCursoYNumGrupo.setText("Codigo Curso + Numero Grupo (ej. 402-2)");
        etiquetaCodCursoYNumGrupo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver)
                    .addComponent(etiquetaCedProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodCursoYNumGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(botonModificar))
                    .addComponent(campoCodYNumGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(etiquetaCodCursoYNumGrupo)
                    .addComponent(campoCodYNumGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCedProfe)
                    .addComponent(campoCedProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonModificar))
                .addContainerGap(30, Short.MAX_VALUE))
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
    private javax.swing.JTextField campoCedProfe;
    private javax.swing.JTextField campoCodYNumGrupo;
    private javax.swing.JLabel etiquetaCedProfe;
    private javax.swing.JLabel etiquetaCodCursoYNumGrupo;
    // End of variables declaration//GEN-END:variables
private Control gestor;
}
