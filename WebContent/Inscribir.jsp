<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="modelo.bean.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<h1>USUARIOS</h1>


<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">NombreApellido</th>
      <th scope="col">DNI</th>
      <th scope="col">Codigo</th>
      <th scope="col">Acciones</th>
    </tr>
  </thead>
    	<table class="table table-striped">
  
  <tbody>
  
  <c:forEach items="${usuarios}" var="usuario">
        <tr>
          <th>${usuario.getNombreApellido()}</th>
          <td>${usuario.getDni()}</td>
          <td>${usuario.getCodigo()}</td>
          <td>
              <a class="btn btn-primary" href="CrearInscripcion?idU=${usuario.getId()}&idA=${actividad}">Inscribir</a>

          </td>
        </tr>

       </c:forEach>
   
  
</table>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>