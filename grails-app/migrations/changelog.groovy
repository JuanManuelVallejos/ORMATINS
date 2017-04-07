databaseChangeLog = {
    include file : "DELTA_001_SE_CREAA_CLASE_DOCENTE.groovy"
    include file : "DELTA_002_SE_AGREGAN_ATRIBUTOS_A_DOCENTE.groovy"
    include file : "DELTA_003_SE_AGREGAN_DATOS_PERSONALES_DOCENTE.groovy"
    include file : "DELTA_004_SE_HACEN_NULLABLES_CAMPOS_DOCENTE.groovy"
    include file : "DELTA_005_BLANK_CAMPO_TITULO_BASE_DOCENTE.groovy"
    include file : "DELTA_006_SE_HACE_NULLABLE_TITULO_BASE.groovy"
    include file : "DELTA_007_UPFILELOADER.groovy"
}
