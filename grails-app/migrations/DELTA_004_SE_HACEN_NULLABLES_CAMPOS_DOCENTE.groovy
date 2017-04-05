databaseChangeLog = {

	changeSet(author: "juan (generated)", id: "1491355170028-1") {
		addNotNullConstraint(columnDataType: "bigint", columnName: "titulo_base_id", tableName: "docente")
	}
}
