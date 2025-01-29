### **Ejercicio 4.6** 

   1. Realizar el ejercicio 1 de Conjuntos de los "Ejercicios básicos con Kotlin" (Ejercicio 3.3.1) orientado a objetos.

   2. Te proporciono algunas pistas de una posible solución:

      ```
      /**
      * Clase Compra
      * @param cliente cliente que realizo la compra
      * @param dia dia de la compra
      * @param monto monto de la compra
      * @constructor Crea una compra con cliente, dia y monto
      */
      ```
      ```
      /**
       * Clase Cliente
       * @param nombre nombre del cliente
       * @param domicilio domicilio del cliente
       * @constructor Crea un cliente con nombre y domicilio
       */
       ```
      ```      
      /**
       * Clase Domicilio
       * @param calle calle del domicilio
       * @param numero numero del domicilio
       * @constructor Crea un domicilio con calle y numero
       */
      ```
      
   3. La clase Domicilio tendrá un método llamado dirCompleta()que retornará el domicilio completo con la calle y el número.

   4. Las clases Compra, Cliente y Domicilio se establecerán como data class, es decir, delante de class incluirán el modificador data en la declaración de dichas clases.

   5. Para entender mejor que es una data class, visualizar el siguiente enlace: [Data classes](https://revilofe.github.io/section1/u04/teoria/PROG-U4.3.-kotlinPOO/#data-classes)

      ```
      /**
       * Clase RepositorioCompras
       * @constructor Crea un repositorio de compras
       */
      ```

   6. La clase `RepositorioCompras` tendrá un método para agregar una compra al repositorio y un método domicilios para retornar los domicilios de cada cliente al cual se le debe enviar una factura de compra.
      Esta función retorna una estructura que contenga cada domicilio una sola vez.
