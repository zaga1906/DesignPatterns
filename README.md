# DesignPatterns
Proyecto para interiorizar los patrones de diseño (Creacionales, Estructurales y de Comportamiento)

## Patrones creacionales
**1. Abstract Factory**: </br>
![image](https://user-images.githubusercontent.com/97688379/163654908-8b3532f7-638f-4786-a805-74215719ac90.png)</br>
Permite producir familias de objetos relacionados sin especificar sus clases concretas.</br></br>
**2. Builder**: </br>
![image](https://user-images.githubusercontent.com/97688379/163654913-ea4d6d5c-0ade-4c7d-b909-97939f808516.png)</br>
Permite construir objetos complejos paso a paso. Este patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.</br></br>
**3. Factory Method**: </br>
![image](https://user-images.githubusercontent.com/97688379/163654923-84168095-f3de-42ff-be87-1657572db106.png)</br>
Proporciona una interfaz para la creación de objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.</br></br>
**4. Prototype**: </br>
![image](https://user-images.githubusercontent.com/97688379/163654928-d5d97353-8096-4830-a226-6c4fe0b7e745.png)</br>
Permite copiar objetos existentes sin que el código dependa de sus clases.</br></br>
**5. Singleton**: </br>
![image](https://user-images.githubusercontent.com/97688379/163654934-b00f5770-5377-48d5-9879-42565427c5c0.png)</br>
Permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.</br></br>

## Patrones estructurales
**1. Adapter**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655005-5ba9f79e-ec85-4d8f-aa52-b407fca67dc8.png)</br>
Permite la colaboración entre objetos con interfaces incompatibles.</br></br>
**2. Bridge**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655009-ace71d25-db74-47f2-a633-d9432015ebce.png)</br>
Permite dividir una clase grande o un grupo de clases estrechamente relacionadas, en dos jerarquías separadas (abstracción e implementación) que pueden desarrollarse independientemente la una de la otra.</br></br>
**3. Composite**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655012-f402883e-1974-494e-9b1d-94fcf6e4007c.png)</br>
Permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.</br></br>
**4. Decorator**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655017-38e970f6-6359-4c94-9c04-fbbc5d4350a8.png)</br>
Permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.</br></br>
**5. Facade**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655025-91df5826-a6f9-44dc-a2dc-677bc9e5c06f.png)</br>
Proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases.</br></br>
**6. Flyweight**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655028-7e8001e1-7f3b-4079-a369-8a3c68383811.png)</br>
Permite mantener más objetos dentro de la cantidad disponible de memoria RAM compartiendo las partes comunes del estado entre varios objetos en lugar de mantener toda la información en cada objeto.</br></br>
**7. Proxy**: </br>
![image](https://user-images.githubusercontent.com/97688379/163655032-f3f5411f-a7ad-4664-8a34-cc431d1224fb.png)</br>
Permite proporcionar un sustituto o marcador de posición para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original.</br></br>

## Patrones de comportamiento
**1. Chain of Responsibility**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655201-bbfc4591-c844-47d1-9aa1-b27942e3697c.png)</br>
Permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.</br></br>
**2. Iterator**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655206-48daf0cc-1c1a-413b-b5c6-73010cec59eb.png)</br>
Permite recorrer elementos de una colección sin exponer su representación subyacente (lista, pila, árbol, etc.).</br></br>
**3. Memento**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655212-ab663e93-ade3-4924-ad58-0966853ed361.png)</br>
Permite guardar y restaurar el estado previo de un objeto sin revelar los detalles de su implementación.</br></br>
**4. State**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655216-8cdc27a9-378d-45fc-8c7c-2f71a0b38f4d.png)</br>
Permite a un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara su clase.</br></br>
**5. Template Method**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655227-2645bcd7-a7cb-4714-9482-779869b7d4e6.png)</br>
Define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.</br></br>
**6. Command**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655234-9d58f12a-203f-4c1a-b7c1-4dbb770d651f.png)</br>
Convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. Esta transformación te permite parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.</br></br>
**7. Mediator**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655247-1a6f0dd4-f1b9-4eac-b63c-39618e9857d2.png)</br>
Permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.</br></br>
**8. Observer**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655256-99c466d9-ad16-48e6-8337-cc91e59cb1d6.png)</br>
Permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.</br></br>
**9. Strategy**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655263-8795a3eb-5408-4a08-bf9b-8dc6acf1071a.png)</br>
Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.</br></br>
**10. Visitor**:  </br>
![image](https://user-images.githubusercontent.com/97688379/163655274-4980d024-1bdb-4ae0-9076-6d01c107d0a1.png)</br>
Permite separar algoritmos de los objetos sobre los que operan.</br></br>
