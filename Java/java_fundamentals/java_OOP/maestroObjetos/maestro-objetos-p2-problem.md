# Maestro de Objetos: Parte 2

Al club le gustó mucho su trabajo y le han pedido desarrollar un poco más las opciones del personaje. Quieren agregar las clases de Ninja, Wizard y Samurai pero también quieren que cualquier modificación hecha en la clase Human se extienda a estas.

Adicional a esto, cada clase tendrá algunas características únicas:

La clase **Wizard** debe tener el valor predeterminado de salud de 50 y de inteligencia en 8; un método llamado curar, que permite curar a quién lo haya invocado en una cantidad igual a la inteligencia del mago y un método llamado bola de fuego que disminuye la salud en 3\*inteligencia del **Wizard** de cualquiera que sea atacado.

La clase **Ninja** debe tener un valor predeterminado de sigilo de 10; un método robar que roba la salud de otro humano igual al número de puntos que tenga el **Ninja** en su nivel de sigilo y un método para escaparse que disminuye su salud en 10.

La clase **Samurai** debe tener una salud predeterminada de 200, un método llamado golpe mortal que ataca un objeto y disminuye su salud a 0, pero también reduce la salud del **Samurai** a la mitad, un método llamado meditar que cura al Samurai en la mitad de puntos que tenga de salud y un método llamado cuántos que devuelve el número actual del Samurai.

### Objetivos

- Implementar paquetes para el espacio de trabajo de su proyecto.
- Implementar herencia.

## Actividades

- Crear las clases **Wizard, Ninja y Samurai**, todas ellas extienden de la clase **Human**.
- Wizard: Establecer un valor predeterminado de **healt en 50**.
- Wizard: Establecer un valor predeterminado de **intelligence en 8**.
- Wizard: Agregar un método **heal(Human)** que aumentará la salud del otro Human en los puntos de **intelligence** que tenga el Wizard.
- Wizard: Agregar un método **fireBall(Human)** que disminuye la salud del otro Human en los puntos **de intelligence \* 3** que tenga el Wizard.
- Ninja: Establecer un valor predeterminado de **stealth en 10**.
- Ninja: Agregar un método **steal(Human)** que roba la cantidad de puntos que tenga el Ninja en stealth de la salud del otro Human y los agrega a la health del Ninja.
- Ninja: Agregar un método **runAway()** que reduce su salud en 10.
- Samurai: Establecer un valor predeterminado de **health en 200**.
- Samurai: Agregar un método **deathBlow(Human)** que asesina al otro Human y reduce la **health** del Samurai a la mitad.
- Samurai: Agregar un método **meditate()** que curará al Samurai en la mitad de puntos que tenga de **health**.
- Samurai: Agregar un método **howMany()** que devuelve el número actual del Samurai.
