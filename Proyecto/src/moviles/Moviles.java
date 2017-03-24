package moviles;
import AccesoDatos.AccesoDB;
import Vista.*;
import Modelo.*;
import Control.Control;
import java.sql.SQLException;
import libreria.PersonaDAO;
import libreria.BookDAO;
import libreria.ControllerServlet;
public class Moviles {

    public static void main(String[] args)throws SQLException{ 

      VentanaInicio vi= new VentanaInicio();
       vi.init();
       Control ctrl  = new Control();
       Interfaz in = new Interfaz(ctrl);
           in.initB();
        
       VenMatriculador m= new VenMatriculador(ctrl);
       m.init();
           





       
        }
    
    
}
