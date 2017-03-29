<%@page import="java.util.ArrayList"%>
<%@ include file="Menu.jsp" %>

        
<body>    <div class="col-sm-9 col-md-9">
        <div class="well">
	<center>
		<h1>Cursos</h1>
        <h2>
        	<a href="listCurso" class="btn btn-lg btn-primary sweet-10" >Registro de Cursos</a>
        	
        </h2>
	</center>
    <div align="center">
		<c:if test="${curso != null}">
			<form action="updateCurso" method="post">
        </c:if>
        <c:if test="${curso == null}">
			<form action="insertCurso" method="post">
        </c:if>
        <table class='table borderless'>
            <caption>
            	<h2>
            		<c:if test="${curso != null}">
            			Editar Curso
            		</c:if>
            		<c:if test="${curso == null}">
            			Agregar Curso
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${curso != null}">
        			<input type="hidden" name="id" value="<c:out value='${curso.codigo}' />" />
        		</c:if>            
   
                                
                                  <tr>
                <th><label for="exampleInputEmail1">Codigo</label> </th>
                <td><div class="form-group">
                	<input type="text" name="codigo" size="45"
                			value="<c:out value='${curso.codigo}' />"
                		required/>
                </td>
            </tr>
       <tr>
            <tr>
                <th><label for="exampleInputEmail1">Nombre</label> </th>
                <td><div class="form-group">
                	<input type="text" name="nombre" size="45"
                			value="<c:out value='${curso.nombre}' />"
                		required/>
                </td>
            </tr>
       <tr>
                <th><label for="exampleInputEmail1">Créditos</label> </th>
                <td><div class="form-group">
                	<input type="number" name="creditos" size="45"
                			value="<c:out value='${curso.creditos}' />"
                		required/>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Horas Semanales</label> </th>
                <td><div class="form-group">
                	<input type="number" name="h_semanales" size="45"
                			value="<c:out value='${curso.hsemanales}' />"
                		required/>
                </td>
            </tr>
             <tr>
                <th><label for="exampleInputEmail1">Carrera</label></th>
                <td><div class="form-group">
                	<input type="text" name="cod_carrera" size="45"
                			value="<c:out value='${curso.carrera}' />"
                		required/>
                </td>
            </tr>
            
            
 
            
            
            
            
            <tr>
                <th><label for="exampleInputEmail1">Ciclo</label> </th>
                <td><div class="form-group">
                	<input type="number" name="num_ciclo" size="45"
                			value="<c:out value='${persona.num_ciclo}' />"
                		required/>
                </td>

      
           
          
           
            <tr>
            	<td colspan="2" align="center">
            		<input class="btn btn-lg btn-primary sweet-10" type="submit" value="Guardar" />
            	</td>
            </tr>
        </table>
        </form>

                                
                 
                                
<select name="carrera">
    <c:forEach items="${listaCarrera}" var="carrera">
        <option value="${carrera.codigo}" ${carrera.codigo == carrera.nombre ? 'selected' : ''}>${carrera.codigo}</option>
    </c:forEach>
</select>
                                
                                
                                
                                
    </div>	</div>
</body>
</html>
