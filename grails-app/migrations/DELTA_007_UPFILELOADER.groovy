databaseChangeLog = {

	changeSet(author: "juan (generated)", id: "1491474500875-1") {
		createTable(tableName: "ufile") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "ufilePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_uploaded", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "downloads", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "extension", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "path", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "size", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}
}
