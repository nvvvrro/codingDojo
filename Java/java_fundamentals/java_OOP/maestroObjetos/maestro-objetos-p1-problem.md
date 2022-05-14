# Maestro de Objetos: Parte 1

Un club local de D&D le ha pedido que les ayude creando unos objetos que ellos podrían utilizar con un simple programa de Java para hacer seguimiento a sus jugadores. Para empezar, a ellos les gustaría tener solo **Human** en esta campaña en particular. Los **Human** pueden seleccionar varias clases **(Wizard, Ninja, Samurai)**.

Ellos quieren que los **Human** tengan 4 propiedades: **strength, intelligence, stealth y health**. El valor predeterminado para cada una de las propiedades debe ser 3, excepto para Health, esta debe ser 100. Cada **Human** debe tener la habilidad de **attack**, en donde se disminuirá la salud de cualquiera que sea atacado en la cantidad de puntos de **Strength** que tenga el atacante.

También quieren ver si usted puede crear una clase que puedan usar antes de cualquier cosa, entonces solo hay que implementar la clase **Human**.

### Objetivos

- Implementar paquetes para el espacio de trabajo de su proyecto.
- Implementar herencia.

## Actividades

- Crear una clase Human.
- Agregar los atributos de strength, stealth y intelligence con un valor predeterminado de 3.
- Agregar el atributo health con un valor predeterminado de 100.
- Agregar el método attack(Human) y reducir el atributo health del humano atacado por los puntos de strength del humano atacante.

Crear la clase HumanTest para probar estos métodos.
