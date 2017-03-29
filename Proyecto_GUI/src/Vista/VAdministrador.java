/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Vista;

import Control.Control;

public class VAdministrador extends javax.swing.JFrame {

    public VAdministrador(Control c) {
        initComponents();
        gestor = c;
        setLocationRelativeTo(null);
    }

    public void init() {
        setVisible(true);
    }

    private void irPersona() {
        VMenuPersona vpersona = new VMenuPersona(gestor);
        vpersona.init();
        this.dispose();

    }

    private void irCurso() {
        VMenuCurso curso = new VMenuCurso(gestor);
        curso.init();
        this.dispose();
    }

    private void irGrupo() {
        VMenuGrupo grupo = new VMenuGrupo(gestor);
        grupo.init();
        this.dispose();
    }

    private void irCiclo() {
        VMenuCiclo ciclo = new VMenuCiclo(gestor);
        ciclo.init();
        this.dispose();
    }

    private void irCarrera() {
        VMenuCarrera carrera = new VMenuCarrera(gestor);
        carrera.init();
        this.dispose();
    }

    private void salir() {
        VLogIn li = new VLogIn();
        li.init();
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMenuCiclo = new javax.swing.JButton();
        botonMenuPersona = new javax.swing.JButton();
        botonMenuCarrera = new javax.swing.JButton();
        botonMenuGrupo = new javax.swing.JButton();
        botonMenuCurso = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setResizable(false);

        botonMenuCiclo.setText("Menú Ciclo");
        botonMenuCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCicloActionPerformed(evt);
            }
        });

        botonMenuPersona.setText("Menú Persona");
        botonMenuPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuPersonaActionPerformed(evt);
            }
        });

        botonMenuCarrera.setText("Menú Carrera");
        botonMenuCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCarreraActionPerformed(evt);
            }
        });

        botonMenuGrupo.setText("Menú Grupo");
        botonMenuGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuGrupoActionPerformed(evt);
            }
        });

        botonMenuCurso.setText("Menú Curso");
        botonMenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCursoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonMenuCiclo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenuPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonMenuCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMenuCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenuGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonMenuCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonMenuGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonMenuPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonMenuCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonMenuCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuPersonaActionPerformed
        irPersona();
    }//GEN-LAST:event_botonMenuPersonaActionPerformed

    private void botonMenuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCursoActionPerformed
        irCurso();
    }//GEN-LAST:event_botonMenuCursoActionPerformed

    private void botonMenuCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCicloActionPerformed
        irCiclo();
    }//GEN-LAST:event_botonMenuCicloActionPerformed

    private void botonMenuGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuGrupoActionPerformed
        irGrupo();
    }//GEN-LAST:event_botonMenuGrupoActionPerformed

    private void botonMenuCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCarreraActionPerformed
        irCarrera();
    }//GEN-LAST:event_botonMenuCarreraActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        salir();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonMenuCarrera;
    private javax.swing.JButton botonMenuCiclo;
    private javax.swing.JButton botonMenuCurso;
    private javax.swing.JButton botonMenuGrupo;
    private javax.swing.JButton botonMenuPersona;
    // End of variables declaration//GEN-END:variables
 private Control gestor;
}
