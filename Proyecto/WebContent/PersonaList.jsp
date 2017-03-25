<%@ include file="Menu.jsp" %>
<body>
    <div class="col-sm-9 col-md-9">
        <div class="well">
            <center>
              
                <h1>
                    <a href="newPersona" class="btn btn-lg btn-primary sweet-10" >Nuevo Estudiante</a>
                </h1>

            </center>  


            <div align="center">
                <div class="container">
                    <table class="table  table-condensed">
                        <caption><h2>Lista Estudiantes</h2></caption>
                        <tr>
                            <th>Cedula</th>
                            <th>Nombre</th>
                            <th>Email</th>
                            <th>Telefono</th>
                            <th>Contraseņa</th>
                            <th>tipo</th>
                        </tr>
                        <c:forEach var="persona" items="${listPersona}">
                            <tr>
                                <td><c:out value="${persona.cedula}" /></td>
                                <td><c:out value="${persona.nombre}" /></td>

                                <td><c:out value="${persona.email}" /></td>
                                <td><c:out value="${persona.telefono}" /></td>


                                <td><c:out value="${persona.clave}" /></td>

                                <td><c:out value="${persona.tipo}" /></td>
                                <td>
                                    <a href="editPersona?cedula=<c:out value='${persona.cedula}' />" class="btn btn-lg btn-warning sweet-13" >Editar</a>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="deletePersona?cedula=<c:out value='${persona.cedula}' />" class="btn btn-lg btn-danger sweet-14");">Eliminar</a>                    	
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>	
        </div>
    </div>
</body>
</html>
