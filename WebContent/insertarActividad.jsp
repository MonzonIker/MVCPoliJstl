<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<h1>INSERTAR ACTIVIDAD</h1>
   
  
   <form action="InsertarActividad" method="GET">
    
    <table>
   <tr><td> Nombre: </td><td><input type="text" name="nombre" value=""></td></tr>
    <tr><td> Fecha Inicio: </td><td><input type="text" name="fecha" value=""> </td></tr>
    <tr><td> Dias_semana: </td><td><input type="text" name="dias" value=""></td></tr> 
    <tr><td> Horas: </td><td><input type="text" name="horas" value=""> </td></tr>
     <tr><td>Max Participantes:</td><td> <input type="text" name="max" value=""></td></tr> 
    <tr><td> Precio: </td><td><input type="text" name="precio" value=""> </td></tr>
    
    </table>
    
    <input type="submit" value="Insertar" >
    
   
    </form>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>