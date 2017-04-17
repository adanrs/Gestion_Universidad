/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package gestionAcademica;

import AccesoDatos.DBControler;
import Vista.*;
import Modelo.*;
import Control.Control;
import java.sql.SQLException;

public class GestionAcademica {

    public static void main(String[] args) throws SQLException {

        VLogIn l = new VLogIn();
        l.init();
        Control ctrl = new Control();
        Interfaz in = new Interfaz(ctrl);
        in.initB();

        VMatriculador m = new VMatriculador(ctrl);
        m.init();

    }

}
