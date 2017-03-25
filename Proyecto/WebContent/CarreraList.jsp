<%@ include file="Menu.jsp" %>
<body>
	<center>
		<h1>Carrera</h1>
        <h2>
        	<a href="newCarrera" class="btn btn-lg btn-primary sweet-10" >Nueva Carrera</a>
        </h2>
	</center>
<div class="col-sm-9 col-md-9">
    <div class="well">
        <table class="table table-condensed">
            <caption><h2>Lista de Carreras</h2></caption>
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
      
            </tr>
            <c:forEach var="carrera" items="${listCarrera}">
                <tr>
                    <td><c:out value="${carrera.codigo}" /></td>
                    <td><c:out value="${carrera.nombre}" /></td>
                    
  
                    <td>
                    	<a href="editCarrera?codigo=<c:out value='${carrera.codigo}' />" class="btn btn-lg btn-warning sweet-13" >Editar</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="deleteCarrera?codigo=<c:out value='${carrera.codigo}' />" class="btn btn-lg btn-danger sweet-14");">Eliminar</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table></div>

</body>
</html>
