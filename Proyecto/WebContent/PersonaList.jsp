<%@ include file="Menu.jsp" %>
<body>
	<div class="col-sm-9 col-md-9">
    <div class="well">
    <div align="center">
        <div class="container">
        <table class="table  table-condensed">
            <caption><h2>Registro</h2></caption>
            <tr>
                <th>Cedula</th>
                <th>Nombre</th>
           <th>Email</th>
            <th>Telefono</th>
             <th>Contraseña</th>
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
                    	<a href="editPersona?cedula=<c:out value='${persona.cedula}' />">Editar</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="deletePersona?cedula=<c:out value='${persona.cedula}' />">Eliminar</a>                    	
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
