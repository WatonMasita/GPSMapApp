# Consejos de Seguridad Aplicados

- Desactivar 'android:debuggable' antes de compilar para produccion.
- Firmar la aplicacion con certificado de **release** seguro.
- No incluir claves de API, contraseñas ni tokens en el codigo fuente.
- Usar **HTTPS/TLS 1.2 o superior** para toda comunicacion externa.
- Restringir permisos a los minimos necesarios para el funcionamiento.
- Establecer 'android:allowBackup=false' para la proteccion de los datos locales.
- Implementar una valicadion de certificados.
