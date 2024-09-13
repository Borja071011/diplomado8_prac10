

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!-- 
Jsp Muestra hace la opcion ya sea de bienvenida o de persona 
-->
<!DOCTYPE html>
<a href="<s:url action="bienvenidoAction"/>">Bienvenido</a>
<br/>
<a href="<s:url action="personasAction"/>">Personas</a>
