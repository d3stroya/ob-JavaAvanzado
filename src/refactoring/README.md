# Código limpio
Código fácilmente entendible y modificable.
Tiene 3 factores:
* Focalizado: para solventar problemas concretos.
* Simple
* Comprobable/testable: fácilmente verificable, preferiblemente, automáticamente.

## Refactorización
Proceso de cambiar software para mejorar el código sin alterar el comportamiento.
No está admitido añadir nuevas funcionalidades durante la refactorización.
Técnicas habituales:
* Red Green/ Test drive develpment. Tiene 3 estados:
  * Red: código de pruebas (test) que fallan
  * Green: código que no falla
  * Refactor: mejorar el código para hacerlo elegante sin que falle