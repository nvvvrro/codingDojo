# Guardia del Zoológico: Parte 1
Una guardia de zoológico le ha pedido ayuda para crear una manera de realizar un seguimiento a los niveles de energía de sus animales. En particular, ella tiene dificultades haciendo un seguimiento a los mamíferos. Cada mamífero debe tener un nivel de energía (predeterminado de 100). Todos deben poder mostrar su nivel de energía cuando se les pregunte a través del método **displayEnergy**, que debe mostrarlo en pantalla y devolver el valor del nivel de energía.

Una vez hecho esto, ella ha pedido que también se cree una clase **Gorilla** a parte, que puede tirar cosas a las personas **throwSomething()** pero perderá energía (-5) cada que lo hace. El Gorilla también puede comer bananos **eatBananas()** y recuperará energía (+10). El Gorilla también puede trepar a la cima **climb()** y perderá energía (-10).

Ella ha pedido que le demuestre que la clase funciona como se espera haciendo que el **Gorilla** lance algo tres veces, coma bananos dos veces y trepe a la cima una vez, luego debe Imprimir la energía del **Gorilla**.

### Objetivos
- Implementar paquetes para el espacio de trabajo de su proyecto.
- Implementar herencia.

## Actividades
- Crear una clase Mammal que tenga un energyLevel y un  método **desiplayEnergy()**. El método **displayEnergy()** debe imprimir el nivel de energía del animal y devolverlo.
- Crear una clase a parte Gorilla que puede **throwSomething(), eatBananas() y climb()**.
- Para el método **throwSomething()**, hacer que imprima un mensaje en pantalla indicando que el gorila ha lanzado algo, al mismo tiempo que disminuye su nivel de energía en 5.
- Para el método **eatBananas()**, hacer que imprima un mensaje en pantalla indicando la satisfacción del gorila e incrementar su nivel de energía en 10.
- Para el método **climb()**, hacer que muestre un mensaje en pantalla indicando que el gorila ha trepado a la cima de un árbol y disminuir su nivel de energía en 10.

Crear una clase **GorillaTest**, para instanciar al gorila y hacer que lance algo tres veces, coma bananos dos veces y trepe a un árbol una vez.