databaseChangeLog = {

	changeSet(author: "juan (generated)", id: "1491263091012-1") {
		addForeignKeyConstraint(baseColumnNames: "titulo_base_id", baseTableName: "docente", constraintName: "FK6CFBBE12A9A93CF9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "titulo", referencesUniqueColumn: "false")
	}
}
