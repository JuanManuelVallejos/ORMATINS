<html>
	<head>
		<meta name="layout" content="main"/>
		<r:require modules="bootstrap"/>
	</head>
	<body>
	<div class="row">
		<div class="col-md-12">
			<h2> Datos del docente </h2>
		</div>
	</div>
	<br/>
	<div class="row">
		<div class="col-md-12">
			<g:render template="form" model="[docenteInstance: docenteInstance, modoEdicion:false]"></g:render>
		</div>
	</div>
	</body>
</html>