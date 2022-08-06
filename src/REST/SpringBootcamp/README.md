# Crear aplicación REST
1. Crear un fichero de config para Jersey y decirle dónde están los controladores > Crear paquete config y clase JerseyConfig
   1. Los controladores reciben las peticiones por HTTP y va a procesarlas.
   2. Añadir anotación @ApplicationPath("/")
   3. Añadir anotación @Component
   4. Hacer que la clase herede de ResourceConfig
   5. Crear paquete controllers
   6. Crear constructor. Dentro irá el código: dónde están los controladores.
2. Crear controlador BootcampersControllers
   1. Añadir anotacoines @Component y @Patch("/")
   2. Crear método: implementar @GET y añadir función
3. Modelo: contiene la información de los datos.
   1. Crear paquete models
   2. Crear clase Bootcamper (el modelo va en singular). También se conoce como POJO (Plain Old Java Object)
   3. Crear los atributos, constructores y getters y setters
4. Servicio: comunica controlador con modelo, son la parte lógica del servicio REST. Crear paquete services.
   1. Añadir anotación @Service
   2. Implementar: 
      1. ArrayList de usuarios
      2. Función que devuelva la lista de usuarios
      3. Función que añada usuarios
5. Implementar atributos, constructores y métodos en el controlador
   1. Métodos:
      1. Añadir tipo de petición (@GET)
      2. Indicar @Patch("")
      3. Agregar anotación @Produces("")
      4. Implementar función
 