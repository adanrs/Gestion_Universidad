<%@ include file="Menu.jsp" %>
<body>
    <div class="col-sm-9 col-md-9">
        <div class="well">
	<center>
		<h1>Ciclo</h1>

	</center>
       <div align="center">
		<c:if test="${ciclo != null}">
			<form action="updateCiclo" method="post">
        </c:if>
        <c:if test="${ciclo == null}">
			<form action="insertCiclo" method="post">
        </c:if>
        <table class='table borderless'>
            <caption>
            	<h2>
            		<c:if test="${ciclo != null}">
            			Editar ciclo
            		</c:if>
            		<c:if test="${ciclo == null}">
            			Agregar ciclo
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${persona != null}">
        			<input type="hidden" name="id" value="<c:out value='${ciclo.codigo}' />" />
        		</c:if>            
   
                                
                                  <tr>
                <th><label for="exampleInputEmail1">ID</label></th></th>
                <td><div class="form-group">
                	<input type="number" name="id" size="45" requiered
                			value="<c:out value='${ciclo.id}' />"
                		/></div>
                </td>
            </tr>
       <tr>
            <tr>
                <th><label for="exampleInputEmail1">Año</label></th></th>
                <td><div class="form-group">
                	<input type="date" name="anno" size="45"
                			value="<c:out value='${ciclo.anno}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1"># Ciclo</label></th></th>
                <td><div class="form-group">
                	<input type="number" name="num_ciclo" size="45"
                			value="<c:out value='${ciclo.num_ciclo}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Fecha Inicio</label></th>
                </th>
                <td><div class="form-group">
                	<input type="date" name="Fecha_inicio" size="45"
                			value="<c:out value='${ciclo.Fecha_inicio}' />"
                		/></div>
                </td>
            </tr>
             <tr>
                <th>    
                    <label for="exampleInputEmail1">Fecha Final</label>
                </th>
                <td>           
                    <div class="form-group">

                	<input type="date" name="Fecha_final" size="45"
                			value="<c:out value='${ciclo.Fecha_final}' />"
                                        /></div>
                        <div>
                </td>
            </tr>


           
            <tr>
            	<td colspan="2" align="center">
            		<input class="btn btn-lg btn-primary sweet-10" type="submit" value="Enviar" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	</div>
</body>
</html>
