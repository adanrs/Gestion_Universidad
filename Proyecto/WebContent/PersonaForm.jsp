<%@ include file="Menu.jsp" %>
<body>
    <div class="col-sm-9 col-md-9">
        <div class="well">
    <div align="center">
		<c:if test="${persona != null}">
			<form action="updatePersona" method="post">
        </c:if>
        <c:if test="${persona == null}">
			<form action="insertPersona" method="post">
        </c:if>
        <table border="1" cellpadding="5">
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
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="number" name="cedula" size="10"
                			value="<c:out value='${persona.cedula}' />"
                		required/></div>
                </td>
            </tr>
       <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="nombre" size="45"
                			value="<c:out value='${persona.nombre}' />"
                		required/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="password" name="clave" size="45"
                			value="<c:out value='${persona.clave}' />"
                		required/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="email" name="email" size="45"
                			value="<c:out value='${persona.email}' />"
                		required/></div>
                </td>
            </tr>
            <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="number" name="telefono" size="45"
                			value="<c:out value='${persona.telefono}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<!--<input type="text" name="tipo" size="45"value="<c:out value='${persona.tipo}' />"/>-->
            <select name="tipo" required>
    <option value="1">Estudiante</option>
    <!--<option value="2">Profesor</option>-->
    <!--<option value="3">Administrador</option>-->
  </select></div>
                </td>
            </tr>
             <tr><div class="form-group">
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="carrera" size="45"
                			value="<c:out value='${persona.carrera}' />"
                		required/></div>
                </td>
            </tr>
           
          
           
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form></div>
    </div>	
</body>
</html>
