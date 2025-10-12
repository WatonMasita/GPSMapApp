# GPSMapApp
Evaluacion Semana 8

# GPSMapApp es una aplicacion android que permite
- Ver la ubicacion actual en Google Maps. (En emulador sera en una ubicacion simulada si se ejecuta en un dispositivo externo muestra tu ubicacion actual)
- Muestra una marcador de una ubicacion predefinida (en este caso seria el Instituto Profesional Santo tomas de Ovalle)
- En la pagina de inicio tambien hay un boton de descargar que descarga una imagen mediante URL y la actualiza y muestra en un imagenView sin perdujidar la funcionalidad de esta misma.

# Requisitos para su Uso
- Tener android Studio instalado
- algun dispositivo fisico o emulador instalado (recomendable un dispositivo fisico para ver la funcionalidad de ubicacion actual)
- API KEY de Google Maps
- Conexion a Internet para la descarga de la imagen

# Como Ejecutar la App
1. Clonar el repositorio y abrir en android studio.
2. Agregar tu Api key de Google maps en /res/values/string.xml, verificar que este bien colocada ya que esta misma se utiliza en el android manifest para su funcionalidad en la app
3. Ejecutar la app en un dispotivo o emulador
4. Probar sus diferentes funcionalidades
- Mostrar Ubicacion -> Ubicacion Actual
- Google Map -> Marcador de ubicacion predefinida o marcada
- Descargar Image -> muestra una imagen mediante una URL
