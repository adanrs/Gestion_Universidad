<%@ include file="Menu.jsp" %>
<body>    <div class="col-sm-9 col-md-9">
        <div class="well">
	<center>
		<h1>Carrera</h1>

	</center>
    <div align="center">
		<c:if test="${curso != null}">
			<form action="updateCarrera" method="post">
        </c:if>
        <c:if test="${curso == null}">
			<form action="insertCarrera" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${carrera != null}">
            			Editar carrera
            		</c:if>
            		<c:if test="${carrera == null}">
            			Agregar carrera
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${carrera != null}">
        			<input type="hidden" name="id" value="<c:out value='${carrera.codigo}' />" />
        		</c:if>            
   
                                
                                  <tr>
                <th><label for="exampleInputEmail1">Codigo</label> </th>
                <td><div class="form-group">
                	<input type="number" name="codigo" size="20"
                			value="<c:out value='${carrera.codigo}' />"
                		/></div>
                </td>
            </tr>

      
                                             <tr>
                <th><label for="exampleInputEmail1">Nombre</label> </th>
                <td><div class="form-group">
                	<input type="text" name="nombre" size="45"
                			value="<c:out value='${carrera.nombre}' />"
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
