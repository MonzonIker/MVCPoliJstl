<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="modelo.bean.Actividad" %>

<%
	ArrayList<Actividad> actividades = (ArrayList<Actividad>)request.getAttribute("actividades");
%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>ACTIVIDADES</title>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="verActividades">Actividades</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="verUsuarios">Usuarios</a>
      </li>
    </ul>
  </div>
</nav>
    <h1>ACTIVIDADES</h1>
    <a class="btn btn-success" href="abrirFormInsertarAct">Añadir actividad</a>
   <form action="BuscarActividades" method="POST" class="form-inline">
            <input type="text" name="query" class="form-control" placeholder="buscar actividades">
            <button type="submit" class="btn btn-primary mx-2">Submit</button>
        </form>
    <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Nombre</th>
      <th scope="col">Fecha Inicio</th>
      <th scope="col">Dias Semana</th>
      <th scope="col">Acciones</th>
    </tr>
  </thead>
  
  <tbody>
  
  <c:forEach items="${actividades}" var="actividad">
        <tr>
          <th><a href="VerActividad?id=${actividad.getId()}">${actividad.getNombre()}</a></th>
          <td>${actividad.getFecha_inicio()}</td>
          <td>${actividad.getDias()}</td>
          <td>
              <a class="btn btn-primary" href="VerActividad?id=${actividad.getId()}">Ver</a>
              <a class="btn btn-primary" href="Inscribir?id=${actividad.getId()}">Inscribir</a>
              
              <a class="btn btn-secondary" href="AbrirFormModifAct?id=${actividad.getId()}">Editar</a>
              <a class="btn btn-danger" href="EliminarActividad?id=${actividad.getId()}">Eliminar</a>

          </td>
        </tr>

       </c:forEach>
   
  
</table>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>