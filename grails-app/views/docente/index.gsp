
<%@ page import="ormatins.Docente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'docente.label', default: 'Docente')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-docente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-docente" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="antiguedad" title="${message(code: 'docente.antiguedad.label', default: 'Antiguedad')}" />
					
						<g:sortableColumn property="apellido" title="${message(code: 'docente.apellido.label', default: 'Apellido')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'docente.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="nombre" title="${message(code: 'docente.nombre.label', default: 'Nombre')}" />
					
						<g:sortableColumn property="puntaje" title="${message(code: 'docente.puntaje.label', default: 'Puntaje')}" />
					
						<g:sortableColumn property="telefono" title="${message(code: 'docente.telefono.label', default: 'Telefono')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${docenteInstanceList}" status="i" var="docenteInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${docenteInstance.id}">${fieldValue(bean: docenteInstance, field: "antiguedad")}</g:link></td>
					
						<td>${fieldValue(bean: docenteInstance, field: "apellido")}</td>
					
						<td>${fieldValue(bean: docenteInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: docenteInstance, field: "nombre")}</td>
					
						<td>${fieldValue(bean: docenteInstance, field: "puntaje")}</td>
					
						<td>${fieldValue(bean: docenteInstance, field: "telefono")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${docenteInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
