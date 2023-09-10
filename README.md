# Contadores-anidadoEste código en Java presenta un ejemplo de bucles anidados (bucles dentro de otros bucles) que utilizan tres contadores diferentes para controlar el flujo del programa. A continuación, se describe lo que hace el código paso a paso:

Se declaran e inicializan tres variables de contador: contadorUno, contadorDos y contadorTres.

contadorUno se inicia en 0.
contadorDos se inicia en 10.
contadorTres se inicia en 20.
Se inicia un bucle exterior controlado por contadorUno mediante un bucle while. Este bucle se ejecutará mientras contadorUno sea menor que 5.

Dentro del bucle exterior, se inicia un bucle anidado controlado por contadorDos mediante otro bucle while. Este bucle se ejecutará mientras contadorDos sea mayor que 5.

Dentro del bucle anidado, se inicia un bucle do-while controlado por contadorTres. El bucle do-while se ejecutará al menos una vez y luego continuará mientras contadorTres sea mayor que 10.

Dentro del bucle do-while anidado, se realizan las siguientes acciones:

Se imprime el valor de contadorUno, contadorDos y contadorTres.
Se decrementa contadorTres.
Se actualiza contadorDos en función del valor de contadorTres. Si contadorTres es par, se le resta 2 a contadorDos; de lo contrario, se le resta 1 a contadorDos.
Una vez que contadorTres sea menor o igual a 10, se sale del bucle do-while anidado y se continúa con el bucle anidado controlado por contadorDos.

Después de que se complete el bucle anidado controlado por contadorDos, se incrementa contadorUno en el bucle exterior.

Se restablece el valor de contadorDos a 10 antes de volver a ejecutar el bucle anidado controlado por contadorDos. Esto asegura que contadorDos siempre comience en 10 en cada iteración del bucle exterior.

El programa continuará ejecutándose hasta que contadorUno alcance el valor de 5. Durante la ejecución, los valores de contadorUno, contadorDos y contadorTres se imprimirán en la consola en cada iteración de los bucles, lo que permite observar cómo cambian estos valores a medida que se ejecutan los bucles anidados.

En resumen, este código demuestra la anidación de bucles y cómo los contadores se utilizan para controlar el flujo de ejecución en diferentes niveles de anidación.
