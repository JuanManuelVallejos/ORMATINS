
<%@ page import="ormatins.Docente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="searchQueryParam"
			value="[
			   ]"></g:set>
		<r:require modules="bootstrap"/>
	</head>
	<body>
		<div class="row">
			<div class="col-md-12">
				<h2> Docentes registrados </h2>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<g:render template="tabla" model="[docentes:docenteList]"></g:render>
				<g:form action="index">
					<label value="Buscar por nombre"/>
					<g:textField name="nombre" placeholder="Nombre" value="${docente?.nombre}"></g:textField>
					<g:textField name="apellido" placeholder="Apellido" value="${docente?.apellido}"></g:textField>
					<g:textField name="email" placeholder="eMail" value="${docente?.email}"></g:textField>
					<g:textField name="telefono" placeholder="Teléfono" value="${docente?.telefono}"></g:textField>
					<g:submitButton name="buscar" class="btn btn-primary" value="Buscar"></g:submitButton>
				</g:form>
			</div>
		</div>
	</body>
</html>
