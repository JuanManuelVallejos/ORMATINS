<%@ page import="ormatins.Docente" %>



<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'antiguedad', 'error')} required">
	<label for="antiguedad">
		<g:message code="docente.antiguedad.label" default="Antiguedad" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="antiguedad" type="number" value="${docenteInstance.antiguedad}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'apellido', 'error')} required">
	<label for="apellido">
		<g:message code="docente.apellido.label" default="Apellido" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="apellido" required="" value="${docenteInstance?.apellido}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="docente.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${docenteInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="docente.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${docenteInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'puntaje', 'error')} required">
	<label for="puntaje">
		<g:message code="docente.puntaje.label" default="Puntaje" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="puntaje" type="number" value="${docenteInstance.puntaje}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'telefono', 'error')} required">
	<label for="telefono">
		<g:message code="docente.telefono.label" default="Telefono" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefono" required="" value="${docenteInstance?.telefono}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'tituloBase', 'error')} required">
	<label for="tituloBase">
		<g:message code="docente.tituloBase.label" default="Titulo Base" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="tituloBase" name="tituloBase.id" from="${ormatins.Titulo.list()}" optionKey="id" required="" value="${docenteInstance?.tituloBase?.id}" class="many-to-one"/>

</div>

