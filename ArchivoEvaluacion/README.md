# GPSMapApp - Analisis de Seguridad (MobSF)

## Descripcion
Aplicacion de Android que muestra Ubicacion en tiempo real mediante Google Maps, evaluada con MobSF.

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
