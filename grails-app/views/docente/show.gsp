
<%@ page import="ormatins.Docente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'docente.label', default: 'Docente')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-docente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-docente" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list docente">
			
				<g:if test="${docenteInstance?.antiguedad}">
				<li class="fieldcontain">
					<span id="antiguedad-label" class="property-label"><g:message code="docente.antiguedad.label" default="Antiguedad" /></span>
					
						<span class="property-value" aria-labelledby="antiguedad-label"><g:fieldValue bean="${docenteInstance}" field="antiguedad"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docenteInstance?.apellido}">
				<li class="fieldcontain">
					<span id="apellido-label" class="property-label"><g:message code="docente.apellido.label" default="Apellido" /></span>
					
						<span class="property-value" aria-labelledby="apellido-label"><g:fieldValue bean="${docenteInstance}" field="apellido"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docenteInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="docente.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${docenteInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docenteInstance?.nombre}">
				<li class="fieldcontain">
					<span id="nombre-label" class="property-label"><g:message code="docente.nombre.label" default="Nombre" /></span>
					
						<span class="property-value" aria-labelledby="nombre-label"><g:fieldValue bean="${docenteInstance}" field="nombre"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docenteInstance?.puntaje}">
				<li class="fieldcontain">
					<span id="puntaje-label" class="property-label"><g:message code="docente.puntaje.label" default="Puntaje" /></span>
					
						<span class="property-value" aria-labelledby="puntaje-label"><g:fieldValue bean="${docenteInstance}" field="puntaje"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docenteInstance?.telefono}">
				<li class="fieldcontain">
					<span id="telefono-label" class="property-label"><g:message code="docente.telefono.label" default="Telefono" /></span>
					
						<span class="property-value" aria-labelledby="telefono-label"><g:fieldValue bean="${docenteInstance}" field="telefono"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${docenteInstance?.tituloBase}">
				<li class="fieldcontain">
					<span id="tituloBase-label" class="property-label"><g:message code="docente.tituloBase.label" default="Titulo Base" /></span>
					
						<span class="property-value" aria-labelledby="tituloBase-label"><g:link controller="titulo" action="show" id="${docenteInstance?.tituloBase?.id}">${docenteInstance?.tituloBase?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:docenteInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${docenteInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
