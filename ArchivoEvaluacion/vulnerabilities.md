# Vulnerabilidades Destacadas - GPSMapApp

## 1. Certificado de Depuracion
**Descripcion:** La Aplicacion esta firmada con un certificado de depuracion.
**Riesgo:** Alta. Permite modificar el APK o falsificar las versiones.
**Solucion:** Firmar la app con una clave de produccion.

## 2. Modo debug Habilitado
**Descripcion:** El atributo 'android:debuggable=true' esta activo.
**Riesgo:** Alta. Permite acceso mediante depuradores.
**Solucion:** Estableces 'android:debuggable=false' en produccion.

## 3. Copia de Seguridad Permitida
**Descripcion:** Se encontro 'android:allowBackup=true'.
**Riesgo:** Media. Los datos del usuario pueden extraese por ADB
**Solucion:** Configurar 'android:allowBackup=false'.

## 4. Actividades Exportadas sin Proteccion
**Descripcion:** Algunas actividades se marcam como 'exported=true'.
**Riesgo:** Media. Otras apps pueden acceder a ellas.
**Solucion:** Establecer 'exported=false' o protegerlas con permisos.

## 5. API Key Expuesta
**Descripcion:** La clave 'google_maps_key' se encuentra en el codigo fuente.
**Riesgo:** Media. Puede usarse para consumir el servicio de mapas sin una autorizacion.
**Solucion:** Almacenar la clave en un servidor seguro o en variables de entorno.
