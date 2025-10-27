# Buenas Practicas Implementadas

- Se utiliza 'ACCESS_FINE_LOCATION' solo estrictamente cuando sea necesario para la funcion de GPS.
- Se evita el uso de permisos innecesarios.
- Las conexiones de red se realizan mediante **HTTPS** seguro.
- Se planea usar ofuscacion de codigo **Proguard/R8**.
- Se restringira el acceso a Activities mediante 'exported=false'.
- Se reemplazara el certificado de depuracion por uno de **release**.
- Se eliminaron claves sensibles del codigo fuente **(API Keys)**
  
  
