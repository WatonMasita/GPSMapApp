# GPSMapApp - Analisis de Seguridad (MobSF)

## Descripcion
Aplicacion de Android que muestra Ubicacion en tiempo real mediante Google Maps, evaluada con **MobSF (Mobile Security Framework)** utilizando **Analisis tanto estatico como el dinamico**
El analisis estatico nos permitio poder identificar las vulnerabilidades de configuracion y claves expuestas, mientras que el analisis dinamico nos confirma el comportamiento de la app en estado de ejecucion, monitoreando el trafico de red, permisos y ejecucion en un emulador rooteado.

## Vulnerabilidades Identificadas
- App firmada con certificado de depuracion.
- Clave de API de Google Maps expuesta.
- Actividades Exportadas sin proteccion.
- Permisos 'allowBackup' habilitado.

## Mejoras Implementadas.
- Certificado de release.
- Eliminacion del modo debug.
- Encriptacion de claves.
- Revision de los permisos.

## Documentacion Habilitada
- [Vulnerabilidades](vulnerabilities.md)
- [Buenas Practicas](best_practices.md)
- [Consejos de Seguridad](security_tips.md)
- [Programa de Mejora de Seguridad](security_improvement_program.md)
- [Reporte de Vulnerabilidades](vulnerability_report.pdf)

## Consejos de Ejecucion Segura
1. Clonar el repositorio.
2. Abrir el Proyecto en la App AndroidStudio.
3. Verificar que el 'debuggable' este desactivado.
4. Compilar con un certificado de release.


## Link Reporte PDF ModSF
- Al subir el pdf al repositorio GitHub presenta error al momento de verlo o descargarlo asi que decidi por subirlo a una carpeta de onedrive. Adjunto el Link
https://alumnossantotomas-my.sharepoint.com/:f:/g/personal/r_quevedo2_alumnos_santotomas_cl/ErDPpOI30HVHlBTetCWXI7gB4ID4xPe9q3lutucNuX9qEg?e=lmXRrc

