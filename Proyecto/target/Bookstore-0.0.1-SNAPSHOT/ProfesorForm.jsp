<%@ include file="Menu.jsp" %>
<body>    <div class="col-sm-9 col-md-9">
        <div class="well">
	<center>
		<h1>Profesor</h1>

    <div align="center">
		<c:if test="${persona != null}">
			<form action="updatePersonaProfesor" method="post">
        </c:if>
        <c:if test="${persona == null}">
			<form action="insertPersonaProfesor" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${persona != null}">
            			Editar Profesor
            		</c:if>
            		<c:if test="${persona == null}">
            			Agregar Profesor
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${persona != null}">
        			<input type="hidden" name="id" value="<c:out value='${persona.cedula}' />" />
        		</c:if>            
   
            <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="cedula" size="45"
                			value="<c:out value='${persona.cedula}' />"
                		/></div>
                </td>
            </tr>
       <tr>
                <th><label for="exampleInputEmail1">Año</label></th>
                <td><div class="form-group">
                	<input type="text" name="nombre" size="45"
                			value="<c:out value='${persona.nombre}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="clave" size="45"
                			value="<c:out value='${persona.clave}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="email" size="45"
                			value="<c:out value='${persona.email}' />"
                		/></div>
                </td>
            </tr>
            <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="telefono" size="45"
                			value="<c:out value='${persona.telefono}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td>
                	<!--<input type="text" name="tipo" size="45"value="<c:out value='${persona.tipo}' />"/>-->
            <select name="tipo">
    
    <option value="2">Profesor</option>
    
  </select>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="carrera" size="45" value="<c:out value='${persona.carrera}' />"
                		/></div>
                </td>
            </tr>
           
          
           
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	</div>
</body>
</html>
