<%@ include file="Menu.jsp" %>
<body>
    <center>
		<h1>Lista Ciclos</h1>
        <h2>
        	<a href="newCiclo" class="btn btn-lg btn-primary sweet-10" >Nuevo Ciclo</a>
        </h2>
	</center>
<div class="col-sm-9 col-md-9">
    <div class="well">

        <table class="table table-condensed">
            <caption><h2># De Ciclos</h2></caption>
            <tr>
                <th>ID</th>
                <th>Año</th>
           <th>Numero De Ciclo</th>
            <th>Fecha Inicial</th>
             <th>Fecha Final</th>
           
            </tr>
            <c:forEach var="ciclo" items="${listCiclo}">
                <tr>
                    <td><c:out value="${ciclo.id}" /></td>
                    <td><c:out value="${ciclo.anno}" /></td>
                    
                    <td><c:out value="${ciclo.nciclo}" /></td>
                    <td><c:out value="${ciclo.finicio}" /></td>
                    
                    
                    <td><c:out value="${ciclo.ffinal}" /></td>
          
                    <td>
                    	<a href="editCiclo?id=<c:out value='${ciclo.id}' />" class="btn btn-lg btn-warning sweet-13" >Editar</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="deleteCiclo?id=<c:out value='${ciclo.id}' />" class="btn btn-lg btn-danger sweet-14");">Eliminar</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
       </div>
 
    </div>
</body>
</html>
