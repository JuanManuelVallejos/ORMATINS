databaseChangeLog = {

	changeSet(author: "juan (generated)", id: "1491173060472-1") {
		createTable(tableName: "docente") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "docentePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "apellido", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "nombre", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
