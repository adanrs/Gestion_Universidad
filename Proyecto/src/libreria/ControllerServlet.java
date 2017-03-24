/*
Dise�o y programaci�n de plataformas M�viles
Laboratorio #1-2 � Back-End (Sistema de Gesti�n Acad�mica)
Ad�n Rivera Sanchez
Sergio Arguedas Quesada
 */
package libreria;

import Modelo.Book;
import Modelo.Carrera;
import Modelo.Ciclo;
import Modelo.Curso;
import Modelo.Nota;
import Modelo.Persona;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BookDAO bookDAO;
    private PersonaDAO personaDAO;
    private CarreraDAO carreraDAO;
    private CicloDAO cicloDAO;
    private CursoDAO cursoDAO;
    private NotaDAO notaDAO;

    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

        bookDAO = new BookDAO(jdbcURL, jdbcUsername, jdbcPassword);
        personaDAO = new PersonaDAO(jdbcURL, jdbcUsername, jdbcPassword);
        carreraDAO = new CarreraDAO(jdbcURL, jdbcUsername, jdbcPassword);
        cicloDAO = new CicloDAO(jdbcURL, jdbcUsername, jdbcPassword);
        cursoDAO = new CursoDAO(jdbcURL, jdbcUsername, jdbcPassword);
        notaDAO = new NotaDAO(jdbcURL, jdbcUsername, jdbcPassword);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/newBook":
                    showNewForm(request, response);
                    break;
                case "/insertBook":
                    insertBook(request, response);
                    break;
                case "/deleteBook":
                    deleteBook(request, response);
                    break;
                case "/editBook":
                    showEditForm(request, response);
                    break;
                case "/updateBook":
                    updateBook(request, response);
                    break;
                /*
                ************************************************************************************************************************
                ************************************************************************************************************************
                PERSONA
                ************************************************************************************************************************
                ************************************************************************************************************************
                 */
                case "/listPersona":
                    listPersona(request, response);
                    break;
                case "/listPersonaProfesor":
                    listPersonaProfesor(request, response);
                    break;
                case "/insertPersonaProfesor":
                    insertPersonaProfesor(request, response);
                    break;
                case "/newPersonaProfesor":
                    showNewFormPersonaProfesor(request, response);
                    break;  
                    
                    
                case "/insertPersona":
                    insertPersona(request, response);
                    break;
                case "/newPersona":
                    showNewFormPersona(request, response);
                    break;
                case "/editPersona":
                    showEditFormPersona(request, response);
                    break;
                case "/deletePersona":
                    deletePersona(request, response);
                    break;
                case "/updatePersona":
                    updatePersona(request, response);
                    break;

                /*
                ************************************************************************************************************************
                ************************************************************************************************************************
                CARRERA
                ************************************************************************************************************************
                ************************************************************************************************************************
                 */
                case "/listCarrera":
                    listCarrera(request, response);
                    break;
                case "/insertCarrera":
                    insertCarrera(request, response);
                    break;
                case "/newCarrera":
                    showNewFormCarrera(request, response);
                    break;
                case "/editCarrera":
                    showEditFormCarrera(request, response);
                    break;
                case "/deleteCarrera":
                    deleteCarrera(request, response);
                    break;
                case "/updateCarrera":
                    updateCarrera(request, response);
                    break;

                /*
                ************************************************************************************************************************
                ************************************************************************************************************************
                CICLO
                ************************************************************************************************************************
                ************************************************************************************************************************
                */
                case "/listCiclo":
                    listCiclo(request, response);
                    break;
                case "/insertCiclo":
                    insertCiclo(request, response);
                    break;
                case "/newCiclo":
                    showNewFormCiclo(request, response);
                    break;
                case "/editCiclo":
                    showEditFormCiclo(request, response);
                    break;
                case "/deleteCiclo":
                    deleteCiclo(request, response);
                    break;
                case "/updateCiclo":
                    updateCiclo(request, response);
                    break;
                    
                    
                /*
                ************************************************************************************************************************
                ************************************************************************************************************************
                CURSO
                ************************************************************************************************************************
                ************************************************************************************************************************
                */
                case "/listCurso":
                    listCurso(request, response);
                    break;
                case "/insertCurso":
                    insertCurso(request, response);
                    break;
                case "/newCurso":
                    showNewFormCurso(request, response);
                    break;
                case "/editCurso":
                    showEditFormCurso(request, response);
                    break;
                case "/deleteCurso":
                    deleteCurso(request, response);
                    break;
                case "/updateCurso":
                    updateCurso(request, response);
                    break;    
                    
                /*
                ************************************************************************************************************************
                ************************************************************************************************************************
                NOTA
                ************************************************************************************************************************
                ************************************************************************************************************************
                 */
                case "/listNota":
                    listNota(request, response);
                    break;
                case "/insertNota":
                    insertNota(request, response);
                    break;
                case "/newNota":
                    showNewFormNota(request, response);
                    break;
                case "/editNota":
                    showEditFormNota(request, response);
                    break;
                case "/deleteNota":
                    deleteNota(request, response);
                    break;
                case "/updateNota":
                    updateNota(request, response);
                    break;    
                    
                /*
                ************************************************************************************************************************
                ************************************************************************************************************************
                ************************************************************************************************************************
                ************************************************************************************************************************
                 */
                    
                default:
                    listBook(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    
    
    /*
    ************************************************************************************************************************
    ************************************************************************************************************************
    METODOS
    ************************************************************************************************************************
    ************************************************************************************************************************
     */

    private void listBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Book> listBook = bookDAO.listAllBooks();
        request.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Book existingBook = bookDAO.getBook(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("BookForm.jsp");
        request.setAttribute("book", existingBook);
        dispatcher.forward(request, response);

    }

    private void insertBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        float price = Float.parseFloat(request.getParameter("price"));

        Book newBook = new Book(title, author, price);
        bookDAO.insertBook(newBook);
        response.sendRedirect("list");
    }

    private void updateBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        float price = Float.parseFloat(request.getParameter("price"));

        Book book = new Book(id, title, author, price);
        bookDAO.updateBook(book);
        response.sendRedirect("listBook");
    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        Book book = new Book(id);
        bookDAO.deleteBook(book);
        response.sendRedirect("listBook");

    }

    /*
    ************************************************************************************************************************
    ************************************************************************************************************************
    PERSONA
    ************************************************************************************************************************
    ************************************************************************************************************************
     */
    private void listPersona(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Persona> listPersona = personaDAO.listAllPersona();
        request.setAttribute("listPersona", listPersona);
        RequestDispatcher dispatcher = request.getRequestDispatcher("PersonaList.jsp");
        dispatcher.forward(request, response);
    }

    
    private void listPersonaProfesor(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Persona> listPersona = personaDAO.listAllPersonaProfesor();
        request.setAttribute("listPersona", listPersona);
        RequestDispatcher dispatcher = request.getRequestDispatcher("PersonaList.jsp");
        dispatcher.forward(request, response);
    }
    private void insertPersona(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String clave = request.getParameter("clave");
        String email = request.getParameter("email");
        int telefono = parseInt(request.getParameter("telefono"));
        int tipo = parseInt(request.getParameter("tipo"));
        String carrera = request.getParameter("carrera");

        Persona persona = new Persona(cedula, nombre, clave, email, telefono, tipo, carrera);
        personaDAO.insertaPersona(persona);
        response.sendRedirect("listPersona");
    }

    private void insertPersonaProfesor(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String clave = request.getParameter("clave");
        String email = request.getParameter("email");
        int telefono = parseInt(request.getParameter("telefono"));
        int tipo = parseInt(request.getParameter("tipo"));
        String carrera = request.getParameter("carrera");

        Persona persona = new Persona(cedula, nombre, clave, email, telefono, tipo, carrera);
        personaDAO.insertaPersona(persona);
        response.sendRedirect("listPersonaProfesor");
    }

    private void showNewFormPersonaProfesor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("ProfesorForm.jsp");
        dispatcher.forward(request, response);
    }
    
    private void showNewFormPersona(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("PersonaForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditFormPersona(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int cedula = Integer.parseInt(request.getParameter("cedula"));
        Persona existingPersona = personaDAO.getPersona(cedula);
        RequestDispatcher dispatcher = request.getRequestDispatcher("PersonaForm.jsp");
        request.setAttribute("persona", existingPersona);
        dispatcher.forward(request, response);

    }

    private void deletePersona(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("cedula"));

        Persona persona = new Persona(id);
        personaDAO.deletePersona(persona);
        response.sendRedirect("listPersona");

    }

    private void updatePersona(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String nombre = request.getParameter("nombre");
        String clave = request.getParameter("clave");
        String email = request.getParameter("email");
        int telefono = parseInt(request.getParameter("telefono"));
        int tipo = parseInt(request.getParameter("tipo"));
        String carrera = request.getParameter("carrera");
        String id = request.getParameter("cedula");

        Persona persona = new Persona(id, nombre, clave, email, telefono, tipo, carrera);
        personaDAO.updatePersona(persona);
        response.sendRedirect("listPersona");

        response.sendRedirect("listBook");
    }

    /*
    ************************************************************************************************************************
    ************************************************************************************************************************
    CARRERA
    ************************************************************************************************************************
    ************************************************************************************************************************
     */
    private void listCarrera(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Carrera> listCarrera = carreraDAO.listAllCarrera();
        request.setAttribute("listCarrera", listCarrera);
        RequestDispatcher dispatcher = request.getRequestDispatcher("CarreraList.jsp");
        dispatcher.forward(request, response);
    }

    private void insertCarrera(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");

        Carrera carrera = new Carrera(nombre, codigo);
        carreraDAO.insertaCarrera(carrera);
        response.sendRedirect("listCarrera");
    }

    private void showNewFormCarrera(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("CarreraForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditFormCarrera(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String codigo = request.getParameter("codigo");
        Carrera existingCarrera = carreraDAO.getCarrera(codigo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("CarreraForm.jsp");
        request.setAttribute("carrera", existingCarrera);
                           dispatcher.forward(request, response);
    }

    private void deleteCarrera(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String codigo = request.getParameter("codigo");

        Carrera carrera = new Carrera(codigo);
        carreraDAO.deleteCarrera(carrera);
        response.sendRedirect("listCarrera");

    }

    private void updateCarrera(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");

        Carrera carrera = new Carrera(nombre, codigo);
        carreraDAO.updateCarrera(carrera);
        response.sendRedirect("listCarrera");

        response.sendRedirect("listBook");
    }

    /*
    ************************************************************************************************************************
    ************************************************************************************************************************
    CICLO
    ************************************************************************************************************************
    ************************************************************************************************************************
     */
    private void listCiclo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Ciclo> listCiclo = cicloDAO.listAllCiclo();
        request.setAttribute("listCiclo", listCiclo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("CicloList.jsp");
        dispatcher.forward(request, response);
    }

    private void insertCiclo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        String id = request.getParameter("id");
        int anno = parseInt(request.getParameter("anno"));
        int nciclo = parseInt(request.getParameter("num_ciclo"));
        String Finicio = request.getParameter("Fecha_inicio");
        String Ffinal = request.getParameter("Fecha_final");
        
        Ciclo ciclo = new Ciclo (id, anno, nciclo, Finicio, Ffinal);
        cicloDAO.insertaCiclo(ciclo);
        response.sendRedirect("listCiclo");
    }

    private void showNewFormCiclo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("CicloForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditFormCiclo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String id = request.getParameter("id");
        Ciclo existingCiclo = cicloDAO.getCiclo(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("CicloForm.jsp");
        request.setAttribute("ciclo", existingCiclo);
        dispatcher.forward(request, response);

    }

    private void deleteCiclo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String id = request.getParameter("id");
        
        Ciclo ciclo = new Ciclo (id);
        cicloDAO.deleteCiclo(ciclo);
        response.sendRedirect("listCiclo");

    }

    private void updateCiclo(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String id = request.getParameter("id");
        int anno = parseInt(request.getParameter("anno"));
        int nciclo = parseInt(request.getParameter("num_ciclo"));
        String Finicio = request.getParameter("Fecha_inicio");
        String Ffinal = request.getParameter("Fecha_final");
        
        Ciclo ciclo = new Ciclo (id, anno, nciclo, Finicio, Ffinal);
        cicloDAO.updateCiclo(ciclo);
        response.sendRedirect("listCiclo");

        response.sendRedirect("listBook");
    }


    /*
    ************************************************************************************************************************
    ************************************************************************************************************************
    CURSO
    ************************************************************************************************************************
    ************************************************************************************************************************
     */
    private void listCurso(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Curso> listCurso = cursoDAO.listAllCurso();
        request.setAttribute("listCurso", listCurso);
        RequestDispatcher dispatcher = request.getRequestDispatcher("CursoList.jsp");
        dispatcher.forward(request, response);
    }

    private void insertCurso(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        int creditos = parseInt(request.getParameter("creditos"));
        int hsemanales = parseInt(request.getParameter("h_semanales"));
        String carrera = request.getParameter("cod_carrera");
        int num_ciclo = parseInt(request.getParameter("num_ciclo"));

        Curso curso = new Curso(codigo, nombre, creditos, hsemanales, carrera, num_ciclo);
        cursoDAO.insertaCurso(curso);
        response.sendRedirect("listCurso");
    }

    private void showNewFormCurso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("CursoForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditFormCurso(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String codigo = request.getParameter("codigo");
        Curso existingCurso = cursoDAO.getCurso(codigo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("CursoForm.jsp");
        request.setAttribute("curso", existingCurso);
        dispatcher.forward(request, response);

    }

    private void deleteCurso(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String codigo = request.getParameter("codigo");
        
        Curso curso = new Curso(codigo);
        cursoDAO.deleteCurso(curso);
        response.sendRedirect("listCurso");

    }

    private void updateCurso(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        int creditos = parseInt(request.getParameter("creditos"));
        int hsemanales = parseInt(request.getParameter("h_semanales"));
        String carrera = request.getParameter("cod_carrera");
        int num_ciclo = parseInt(request.getParameter("num_ciclo"));

        Curso curso = new Curso(codigo, nombre, creditos, hsemanales, carrera, num_ciclo);
        cursoDAO.updateCurso(curso);
        response.sendRedirect("listCurso");

        response.sendRedirect("listBook");
    }
    
    /*
    ************************************************************************************************************************
    ************************************************************************************************************************
    NOTA
    ************************************************************************************************************************
    ************************************************************************************************************************
     */
    private void listNota(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Nota> listNota = notaDAO.listAllNota();
        request.setAttribute("listNota", listNota);
        RequestDispatcher dispatcher = request.getRequestDispatcher("NotaList.jsp");
        dispatcher.forward(request, response);
    }

    private void insertNota(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        int nnota = parseInt(request.getParameter("id"));
        String curso = request.getParameter("curso");
        String estudiante = request.getParameter("estudiante");
        int grupo = parseInt(request.getParameter("grupo"));
        String condicion = request.getParameter("condision");
        
        Nota nota = new Nota (nnota, curso, estudiante, grupo, condicion);
        notaDAO.insertaNota(nota);
        response.sendRedirect("listNota");
    }

    private void showNewFormNota(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("NotaForm.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditFormNota(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String est = request.getParameter("estudiante");
        Nota existingNota = notaDAO.getNota(est);
        RequestDispatcher dispatcher = request.getRequestDispatcher("NotaForm.jsp");
        request.setAttribute("nota", existingNota);
        dispatcher.forward(request, response);

    }

    private void deleteNota(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        String est = request.getParameter("estudiante");
        
        Nota nota = new Nota (est);
        notaDAO.deleteNota(nota);
        response.sendRedirect("listNota");

    }

    private void updateNota(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        int nnota = parseInt(request.getParameter("id"));
        String curso = request.getParameter("curso");
        String estudiante = request.getParameter("estudiante");
        int grupo = parseInt(request.getParameter("grupo"));
        String condicion = request.getParameter("condision");
        
        Nota nota = new Nota (nnota, curso, estudiante, grupo, condicion);
        notaDAO.updateNota(nota);
        response.sendRedirect("listNota");

        response.sendRedirect("listBook");
    }
}
