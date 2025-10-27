# Vulnerabilidades Destacadas - GPSMapApp

## 1. Certificado de Depuracion
**Descripcion:** La Aplicacion esta firmada con un certificado de depuracion, lo cual nos indica que no esta lista para la distribucion en entornos productivos.

**Riesgo:** Alta. Permite modificar el APK o falsificar las versiones.

**Evidencia:** Reporte Estatico - Seccion "App Signing" Muestra firma con certificado de desarrollo.

**Solucion:** Firmar la app con un certificado de produccion antes de su publicacion. Tambien Generar un Keystore seguro y configurar el proceso de la firma en 'build.gradle' para versiones.

## 2. Modo debug Habilitado
**Descripcion:** El atributo 'android:debuggable=true' esta activo, lo que permite depurar la app con herramientas externas.
**Riesgo:** Alta. Permite acceso mediante depuradores o ADB, facilitando el analisis del codigo o posibles manipulaciones en el tiempo de ejecucion.
**Evidencia:** Reporte Estatico - "Manifest Analysis" Nos confirma 'debuggable=true'.
**Solucion:** Estableces 'android:debuggable=false' en produccion, desactivando el modo debug.

## 3. Copia de Seguridad Permitida
**Descripcion:** Se encontro 'android:allowBackup=true', que permite a los usuarios o atacantes con acceso fisico poder extraer datos de la aplicacion mediante ADB.
**Riesgo:** Media. Los datos del usuario pueden extraese por ADB desde el almacenamiento local del dispositivo.
**Evidencia:** Reporte Estatico - "Manifest Finding" muestra 'allowBackup=true'.
**Solucion:** Configurar 'android:allowBackup=false', para si impedir la exportacion de los datos del usuario.

## 4. Actividades Exportadas sin Proteccion
**Descripcion:** Algunas actividades se marcam como 'exported=true' sin el requerimiento de permisos o autenticacion.
**Riesgo:** Media. Otras apps pueden acceder o ejecutar pantallas internas de GPSMapApp.
**Evidencia:** Reporte Estatico - "Exported Activities" Lista de actividades publicas no protegidas.
**Solucion:** Establecer 'exported=false' o protegerlas con permisos.

## 5. API Key Expuesta
**Descripcion:** La clave 'google_maps_key' se encuentra en el codigo fuente.
**Riesgo:** Alta. Puede usarse para consumir el servicio de mapas sin una autorizacion mediante un atacante y generar costos en la cuenta asociada.
**Evidencia:** Reporte Estatico - "Hardcoded Secrets" Muestra la clave completa.
**Solucion:** Eliminar la clave que esta en el codigo fuente y almacenarla en un backend seguro o tenerle restriccion en Google Cloud Console por el dominio, Firma SHA-1 o paquete.

## 6. Permisos Sensibles de Ubicacion
**Descripcion:** La app nos solicicta los permisos 'ACCESS_FINE_LOCATION' y 'ACCESS_COARSE_LOCATION', estos se estan utilizando de manera correcta pero se deben gestior de manera cuidadosa.
**Riesgo:** Baja. Si esto se maneja de manera incorrecta, podrian exponer la ubicacion del usuario.
**Evidencia:** Reporte Dinamico - En este se observan llamadas a 'getLastKnowLocation()' durante la ejecucion de la app.
**Solucion:** Soliticar estos permisos unicamente cuando sean necesarios y poder explicar su uso al usuario, evitando guardar o compartir las coordenadas sin su consentimiento.


