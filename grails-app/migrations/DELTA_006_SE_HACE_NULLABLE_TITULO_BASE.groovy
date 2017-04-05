databaseChangeLog = {

	changeSet(author: "juan (generated)", id: "1491359378414-1") {
		dropNotNullConstraint(columnDataType: "bigint", columnName: "titulo_base_id", tableName: "docente")
	}
}
