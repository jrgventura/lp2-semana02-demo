<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Carreras" %>
<%@ page import="java.util.List" %>
<%
    Carreras carrera = (Carreras) request.getAttribute("carreraEditar");
    List<Carreras> lista = (List<Carreras>) request.getAttribute("lista");
%>
<html>
<head><title>Mantenedor de Carreras</title></head>
<body>
    <h2><%= (carrera != null ? "Editar Carrera" : "Registrar Nueva Carrera") %></h2>
    <form action="Carreras2Servlet" method="post">
        <input type="hidden" name="id" value="<%= carrera != null ? carrera.getId() : "" %>">
        Nombre: <input type="text" name="carrera" value="<%= carrera != null ? carrera.getCarrera() : "" %>" required><br>
        Estado:
        <select name="estado">
            <option value="true" <%= (carrera != null && carrera.getEstado()) ? "selected" : "" %>>Activo</option>
            <option value="false" <%= (carrera != null && !carrera.getEstado()) ? "selected" : "" %>>Inactivo</option>
        </select><br>
        <input type="submit" value="<%= (carrera != null ? "Actualizar" : "Registrar") %>">
        <% if (carrera != null) { %>
            <a href="Carreras2Servlet">Cancelar</a>
        <% } %>
    </form>

    <hr>
    <h2>Lista de Carreras</h2>
    <table border="1">
        <tr><th>ID</th><th>Carrera</th><th>Estado</th><th>Acciones</th></tr>
        <% if (lista != null) {
            for (Carreras c : lista) { %>
                <tr>
                    <td><%= c.getId() %></td>
                    <td><%= c.getCarrera() %></td>
                    <td><%= c.getEstado() ? "Activo" : "Inactivo" %></td>
                    <td>
                        <a href="Carreras2Servlet?accion=editar&id=<%=c.getId()%>">Editar</a>
                        <a href="Carreras2Servlet?accion=eliminar&id=<%=c.getId()%>" onclick="return confirm('¿Eliminar carrera?');">Eliminar</a>
                    </td>
                </tr>
        <%  }
        } %>
    </table>
</body>
</html>
