# Teléfonos

En esta actividad vamos a utilizar clases **Abstract e Interface** para crear 2 tipos de teléfonos: iPhone y Galaxy.

### Objetivos:

- Definir clases.
- Definir Interfaces.
- Implementar clases que utilicen clases abstractas e interfaces.

## Actividades:

- Crear una clase abstracta **Phone**.

**Phone.java**

    public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
    this.versionNumber = versionNumber;
    this.batteryPercentage = batteryPercentage;
    this.carrier = carrier;
    this.ringTone = ringTone;
    }
    // Método abstracto. Este método será implementado por las subclases
    public abstract void displayInfo();
    // getters y setters removidos para resumir. Por favor implementarlos por usted mismo.
    }

- Crear una interfaz **Ringable** que contenga los siguientes métodos:
  - **ring():** Este método retorna un String.
  - **unlock():** Este método retorna un String.

**Ringable.java**

    public interface Ringable {
    // tu código aquí
    }

- Crear las clases **IPhone y Galaxy**. Ambas clases deben extender/heredar de la clase abstracta **Phone** e implementar de la interfaz **Ringable.**

**IPhone.java**

    public class IPhone extends Phone implements Ringable {
        public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
            super(versionNumber, batteryPercentage, carrier, ringTone);
        }
        @Override
        public String ring() {
        // tu código aquí
        }
        @Override
        public String unlock() {
        // tu código aquí
        }
        @Override
        public void displayInfo() {
        // tu código aquí
        }
    }

**Galaxy.java**

    public class Galaxy extends Phone implements Ringable {
        public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
            super(versionNumber, batteryPercentage, carrier, ringTone);
        }
        @Override
        public String ring() {
        // tu código aquí
        }
        @Override
        public String unlock() {
        // tu código aquí
        }
        @Override
        public void displayInfo() {
        // tu código aquí
        }
    }

- Implementar los métodos **(ring, unlock, displayInfo)** de las clases **IPhone y Galaxy** de acuerdo al archivo siguiente archivo **PhoneTester**:

(https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/Screen_Shot_2018-03-05_at_9.07.25_PM.png)
