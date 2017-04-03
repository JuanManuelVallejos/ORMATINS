databaseChangeLog = {

	changeSet(author: "juan (generated)", id: "1491183917072-1") {
		createTable(tableName: "curso_salon") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "curso_salonPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "anio", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "clasificacion", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "juan (generated)", id: "1491183917072-2") {
		createTable(tableName: "lapso_horario") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "lapso_horarioPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "clasificacion", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "dia", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "juan (generated)", id: "1491183917072-3") {
		createTable(tableName: "titulo") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "tituloPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "nombre", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "juan (generated)", id: "1491183917072-4") {
		addColumn(tableName: "docente") {
			column(name: "antiguedad", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "juan (generated)", id: "1491183917072-5") {
		addColumn(tableName: "docente") {
			column(name: "puntaje", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}
}
