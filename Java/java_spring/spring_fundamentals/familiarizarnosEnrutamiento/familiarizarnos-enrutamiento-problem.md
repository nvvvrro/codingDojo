# Familiarizarnos con Enrutamiento

Para esta actividad, deberá practicar el enrutamiento en Spring Boot.

El objetivo es dominar la escritura de las anotaciones de nivel de método **@RequestMapping** y las anotaciones de nivel de clase **@RequestMapping.**

### Objetivos

- Practicar creando aplicaciones Spring Boot.
- Practicar anotaciones @RestController.
- Dominar @RequestMapping.

## Actividades

- Crear un controlador llamado "CodingController". Para las primeras 3 rutas, utilizar la anotación **@RequestMapping.**
- Haga que una solicitud GET a "http://localhost:8080/coding" muestre un texto que diga "¡Hola Coding Dojo!".
- Haga que una solicitud GET a "http://localhost:8080/coding/python" muestre un texto que diga "¡Python/Django fue increíble!".
- Haga que una solicitud GET a "http://localhost:8080/coding/java" muestre un texto que diga "¡Java/Spring es mejor!".
- Crear otro controlador llamado "DojoController". Para las rutas a continuación, utilice la anotación **@PathVariable.**
- Haga que una solicitud GET a "http://localhost:8080/dojo" muestre un texto que diga "¡El Dojo es increíble!".
- Haga que una solicitud GET a "http://localhost:8080/burbank-dojo" muestre un texto que diga "El Dojo Burbank está localizado al sur de California".
- Haga que una solicitud GET a "http://localhost:8080/san-jose" muestre un texto que diga "El Dojo SJ es el cuartel general".
