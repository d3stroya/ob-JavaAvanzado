# REST
Un servicio REST es una aplicación web que cumple una serie de patrones determinados.
* Utilizar verbos HTTP: un tipo de petición que enviamos a un servidor utilizando el protocolo HTTP
  * GET: obtiene información/un recurso (imagen, texto, html,...) de un servidor
  * POST: envía información al servidor
  * PATCH: actualiza un recurso que ya existe enviándole únicamente los datos que han cambiado
  * PUT: actualiza un recurso que ya existe enviándole todos los datos del recurso, incluyendo los que se han cambiado.
  * DELETE: elimina un recurso que ya existe
* En la url se usan nombres en plural, no verbos
* Se versionan manteniendo versiones anteriores. Así quien esté usando la v1 puede seguir usándola y no se rompe su aplicación.
  * http://www.dominio.tld/api/v1/users
  * http://www.dominio.tld/api/v2/users
