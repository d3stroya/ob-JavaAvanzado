# Formato del código limpio
* Intentar que las clases no tengan más de 200-300 líneas.
* Visualizar el código como un periódico:
  * Titular
  * Entradilla
  * Desarrollo: primero lo más genérico y luego los detalles
* Longitud máxima de una línea: 80 caracteres. Con POO es difícil: entre 80 y 100.
* Ámbitos ficticios: ayuda a ver que una función acaba.
* Reglas de equipo: tenemos que ser buenos compañeros, no impondremos nuestro estilo, sino que respetaremos
  las reglas acordadas en equipo.

## Vertical
* Separación vertical entre conceptos: Dejar una línea en blanco para separar conceptos.
* Densidad vertical: implica una asociación cerrada, es decir, lo que sea del mismo tipo va junto.
* Distancia vertical: las funciones relacionadas entre sí deben estar cerca unas de otras.
  * Declaración de variables: siempre juntas. Excepción en bucles: se declaran en el propio bucle.
  * Las funciones dependientes deben estar cerca. Las dependientes estarán por debajo de la que la llame y cerca de ella.
  * Afinidad: La funcionalidad de la función dependiente debe ser similar. También se consigue con sobrecarga de métodos.
  * Orden vertical: cuanto más abajo, más complejidad.

## Horizontal
* Separación horizontal: Se usa para diferenciar elementos para darle claridad. No se separa entre nombre de función
  y parámetro, poque está muy relacionados.
* Densidad horizontal
* Alineamiento horizontal: dar a las funciones un formato como si fueran una tabla. Lo correcto es no usarlo.
* Indentado: tabuladores para dar sensación de profundidad para visualizarlo más claro.


