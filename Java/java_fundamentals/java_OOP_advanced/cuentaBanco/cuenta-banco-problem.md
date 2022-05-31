# Cuenta de Banco

Vamos a crear la clase BankAccount. Esta clase recreará algunas de las transacciones más comunes que normalmente ocurren en una cuenta de banco como mostrar su número de cuenta, monto en cuenta corriente y de ahorros, monto total. Por supuesto, hay métodos que invocar, tanto como depositar un cheque, verificar saldo, retirar dinero.

### Objetivos

- Practicar variables principales.
- Practicar métodos de instancia, getters y setters.
- Implementar variables y métodos estáticos.

## Actividades

- Crear una clase BankAccount.
  La clase debe tener los siguientes atributos: (string) número de cuenta, (double) saldo cuenta corriente, (double) saldo cuenta de ahorros.
- Crear una variable (static) que contenga el número de cuentas creadas hasta el momento.
- Crear una variable (static) que rastree la cantidad de dinero almacenado en cada cuenta creada.
- Crear un método privado que retorne un número de 10 dígitos aleatorios para el número de cuenta.
- En el constructor, llamar al método privado anterior, así cada usuario tendrá un número de cuenta de 10 dígitos aleatorios.
- En el constructor, asegurarse de incrementar el contador de cuentas creadas.
- Crear un método getter para el saldo de la cuenta corriente del usuario.
- Crear un método getter para el saldo de la cuenta de ahorros del usuario.
- Crear un método que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros, asegúrese de aumentar el total de dinero almacenado.
- Crear un método para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
- Crear un método para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
- Los usuarios no deberían poder configurar ningún atributo de la clase
