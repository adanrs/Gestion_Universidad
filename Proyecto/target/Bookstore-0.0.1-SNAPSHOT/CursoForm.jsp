<%@ include file="Menu.jsp" %>
<body>    <div class="col-sm-9 col-md-9">
        <div class="well">
	<center>
		<h1>Cursos</h1>
        <h2>
        	<a href="newCurso">Add New curso</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="listCurso">List All curso</a>
        	
        </h2>
	</center>
    <div align="center">
		<c:if test="${curso != null}">
			<form action="updateCurso" method="post">
        </c:if>
        <c:if test="${curso == null}">
			<form action="insertCurso" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${curso != null}">
            			Editar curso
            		</c:if>
            		<c:if test="${curso == null}">
            			Agregar curso
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${curso != null}">
        			<input type="hidden" name="id" value="<c:out value='${curso.codigo}' />" />
        		</c:if>            
   
                                
                                  <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="codigo" size="45"
                			value="<c:out value='${curso.codigo}' />"
                		/></div>
                </td>
            </tr>
       <tr>
            <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="nombre" size="45"
                			value="<c:out value='${curso.nombre}' />"
                		/></div>
                </td>
            </tr>
       <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="creditos" size="45"
                			value="<c:out value='${curso.creditos}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="h_semanales" size="45"
                			value="<c:out value='${curso.hsemanales}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Año</label></th>
                <td><div class="form-group">
                	<input type="text" name="cod_carrera" size="45"
                			value="<c:out value='${curso.carrera}' />"
                		/></div>
                </td>
            </tr>
            <tr>
                <th><label for="exampleInputEmail1">Año</label> </th>
                <td><div class="form-group">
                	<input type="text" name="num_ciclo" size="45"
                			value="<c:out value='${persona.num_ciclo}' />"
                		/></div>
                </td>

      
           
          
           
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
