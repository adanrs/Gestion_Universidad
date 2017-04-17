<%@ include file="Menu.jsp" %>
<body>
    <div class="col-sm-9 col-md-9">
        <div class="well">
            <center>
                <h1>Estudiante</h1>
                <h2>
                    <a href="listPersona" class="btn btn-lg btn-primary sweet-10" >Registro de Estudiantes</a>
                </h2>
            </center>

            
            
            <div align="center">
                <c:if test="${persona != null}">
                    <form action="updatePersona" method="post">
                    </c:if>
                    <c:if test="${persona == null}">
                        <form action="insertPersona" method="post">
                        </c:if>
                       <table class='table borderless'>
                            <caption>
                                <h2>
                                    <c:if test="${persona != null}">
                                        Editar Estudiante
                                    </c:if>
                                    <c:if test="${persona == null}">
                                        Agregar Estudiante
                                    </c:if>
                                </h2>
                            </caption>
                            <c:if test="${persona != null}">
                                <input type="hidden" name="id" value="<c:out value='${persona.cedula}' />" />
                            </c:if>            

                            <tr>
                                <th><label for="exampleInputEmail1">Cedula</label> </th>
                                <td><div class="form-group">
                                        <input type="number" name="cedula" size="45"
                                               value="<c:out value='${persona.cedula}' />"
                                               required/></div>
                                </td>
                            </tr>
                            <tr>
                                <th><label for="exampleInputEmail1">Nombre</label> </th>
                                <td><div class="form-group">
                                        <input type="text" name="nombre" size="45"
                                               value="<c:out value='${persona.nombre}' />"
                                               required/></div>
                                </td>
                            </tr>
                            <tr>
                                <th><label for="exampleInputEmail1">Clave</label> </th>
                                <td><div class="form-group">
                                        <input type="password" name="clave" size="45"
                                               value="<c:out value='${persona.clave}' />"
                                               required/></div>
                                </td>
                            </tr>
                            <tr>
                                <th><label for="exampleInputEmail1">Email</label> </th>
                                <td><div class="form-group">
                                        <input type="email" name="email" size="45"
                                               value="<c:out value='${persona.email}' />"
                                               required/></div>
                                </td>
                            </tr>
                            <tr>
                                <th><label for="exampleInputEmail1">Telefono</label> </th>
                                <td><div class="form-group">
                                        <input type="number" name="telefono" size="45"
                                               value="<c:out value='${persona.telefono}' />"
                                               /></div>
                                </td>
                            </tr>
                            <tr>
                                <th><label for="exampleInputEmail1">Tipo</label> </th>
                                <td><div class="form-group">
                                        <!--<input type="text" name="tipo" size="45"value="<c:out value='${persona.tipo}' />"/>-->
                                        <select name="tipo" required>
                                            <option value="2">Estudiante</option>
                                            <!--<option value="2">Profesor</option>-->
                                            <!--<option value="3">Administrador</option>-->
                                        </select></div>
                                </td>
                            </tr>
                            <tr><div class="form-group">
                                <th><label for="exampleInputEmail1">Carrera</label> </th>
                                <td>
                                    <input type="text" name="carrera" size="45"
                                           value="<c:out value='${persona.carrera}' />"
                                           required/>
                                </td>
                                </tr>



                                <tr>
                                    <td colspan="2" align="center">
                                        <input class="btn btn-lg btn-primary sweet-10" type="submit" value="Guardar" />
                                    </td>
                                </tr>
                        </table>
                    </form></div>
        </div>	
</body>
</html>
