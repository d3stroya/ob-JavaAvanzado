# Objetos y la directiva de menor conocimiento

## Abstracción
* Clases con métodos y propiedades abstractas, es decir, tiene una implementación parcial.
* Los métodos abstractos no tienen cuerpo porque se implementa en otra clase.
* Son clases que declaran como abstractas.
* No pueden instanciarse. Hay que crear una clase derivada (extiende de ella).
* Incluye también métodos concretos.

## Ley de Deméter o ley del menor conocimiento
Que los objetos estén pocos acoplados.
4 principios:
* Dentro de un método, puedo tener 4 tipos de relaciones:
  * Con el propio objeto
  * Con un argumento de la función
  * Con un objeto generado dentro del propio objeto
  * Invocar el propio objeto

No permite hacer: 
cosa.getValores().getElementos().getSuperficiales();
Porque hay clases dependiente de otras clases, lo cual hace más complejo el código.

Pero sí:
cosa.valores.elementos.superficiales;

## Data transfer object (DTO)
Permiten obtener información de varias clases en una sola.