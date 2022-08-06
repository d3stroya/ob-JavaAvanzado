# Código limpio
## ¿Qué es el código incorrecto?
Aquel que contiene deficiencias que dan lugar a un mal procesamiento de los datos 
(no se producen los resultados esperados por fallos).
* Deficiencias de implementación: mucho consumo de CPU, de memoria, 
de acceso a disco,... Por ejemplo, bucles sin sentido, vectores demasiado grandes.
* Lleva implícitos unos costes: Un fallo en fase de desarrollo cuesta 100$; 
en fase testing, 1500$; en fase de producción, 10000$.
* Errores reales: 
  * cohete autodestruido por un comando mal ejecutado. 
  * Freno bloqueado en Toyota por un retardo (debido a un bucle mal ejecutado).
  * Cuestan vidas
* Costes indirectos:
  * Mala experiencia de usuario --> habla mal de mí --> tengo más costes/menos beneficios.

Debemos tener una buena actitud hacia el cambio, ya que el software va evolucionando.

## Proceso de desarrollo del software
Pasos que hay que seguir a la hora de desarrollar.
* Estudio
* Diseño
* Implementación
* Pruebas
* Sugerencias de mejoras
* Implementación de mejoras
* Evaluar mejoras
* Vuelta al inicio

## Reglas de diseño (de Uncle Bob)
Debemos dejar el código mejor de lo que estaba. 
También nos aseguraremos de que el nuestro sea el mejor, que no se pueda mejorar.

* Keep it simple
* Si hay un problema, buscar la raíz del problema y ponerle solución.
* Preferencia del polimorfismo frente a condicionales
* Prevenir la sobreconfiguración
* Principio de menor conocimiento: las clases solo deben conocer sus clases directas. Para ello se usan patrones.
* Coherencia: hacer lo mismo siempre de la misma forma. 
Nombrar variables y métodos con nombres descriptivos. Los métodos serán verbos. Cuando sea posible, pasarles por parámetro objetos.
* Evitar la dependencia lógica: que los métodos no dependan del estado interno de la clase.
* No usar condicionales negativos
