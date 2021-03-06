<%@ include file="Menu.jsp" %>
<body>
	<center>
		<h1>Lista de Cursos</h1>
        <h2>
        	<a href="newCurso" class="btn btn-lg btn-primary sweet-10" >Agregar Curso</a>

        	
        </h2>
	</center><div class="col-sm-9 col-md-9">
    <div class="well">
    <div align="center">
           <div class="container">
        <table class="table table-condensed">
            <caption><h2>Lista de Cursos</h2></caption>
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
           <th>Creditos</th>
            <th>Horas Semanales</th>
             <th>Carrera</th>
              <th>Ciclo</th>
            </tr>
            <c:forEach var="curso" items="${listCurso}">
                <tr>
                    <td><c:out value="${curso.codigo}" /></td>
                    <td><c:out value="${curso.nombre}" /></td>
                    
                    <td><c:out value="${curso.creditos}" /></td>
                    <td><c:out value="${curso.h_semanales}" /></td>
                    
                    
                    <td><c:out value="${curso.carrera}" /></td>
                    
                    <td><c:out value="${curso.num_ciclo}" /></td>
                    <td>
                    	<a href="editCurso?codigo=<c:out value='${curso.codigo}' />" class="btn btn-lg btn-warning sweet-13" >Editar</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="deleteCurso?codigo=<c:out value='${curso.codigo}' />" class="btn btn-lg btn-danger sweet-14");">Eliminar</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table></div>	
    </div></div>	</div>
</body>
</html>
