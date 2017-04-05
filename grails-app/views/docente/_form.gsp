<%@ page import="ormatins.Docente" %>

<g:hiddenField name="id" value="${docenteInstance?.id}"></g:hiddenField>
<g:hiddenField name="version" value="${docenteInstance?.version}"/>
<div class="row">
	<div class="col-md-5" align="center">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="panel-title">Información personal</h2>
			</div>
			<div class="panel-body" align="center">
				<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'nombre', 'error')} required">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Nombre</span>
						<g:textField name="nombre" class="form-control" disabled="${!modoEdicion}" placeholder="Nombre" aria-describedby="basic-addon1" required="" value="${docenteInstance?.nombre}"/>
					</div>
				</div>
				<br/>
				<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'apellido', 'error')} required">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Apellido</span>
						<g:textField name="apellido" class="form-control" disabled="${!modoEdicion}" placeholder="Apellido" aria-describedby="basic-addon1" required="" value="${docenteInstance?.apellido}"/>
					</div>
				</div>
				<br/>
				<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'email', 'error')} required">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Email</span>
						<g:textField name="email" class="form-control" disabled="${!modoEdicion}" placeholder="ejemplo@gmail.com" aria-describedby="basic-addon1" required="" value="${docenteInstance?.email}"/>
					</div>
				</div>
				<br/>
				<div class="fieldcontain ${hasErrors(bean: docenteInstance, field: 'telefono', 'error')} required">
					<div class="input-group">
						<span class="input-group-addon" style="size: " id="basic-addon1">Teléfono</span>
						<g:textField name="telefono" class="form-control" disabled="${!modoEdicion}" placeholder="Telefono" aria-describedby="basic-addon1" required="" value="${docenteInstance?.telefono}"/>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>