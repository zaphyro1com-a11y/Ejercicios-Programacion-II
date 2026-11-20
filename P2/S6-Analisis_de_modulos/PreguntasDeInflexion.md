# Preguntas de reflexión
## 6. ¿Por qué Modulo[] se declara como atributo del analizador?
Se declara asi para que el programa sepa que lo que recibira no es un solo objeto sino un arreglo del objeto "Modulo". Si no se hace asi el programa produciria un error al compilar.

## 7. ¿Qué representa cada posición del arreglo?
Cada posicion del arreglo representa un objeto de la clase "Modulo", cada uno puede ser diferente o igual pero dentro de nuestro programa el objetivo es que sean instancias de clase diferentes.

## 8. ¿Por qué un módulo puede existir sin el analizador?
Un modulo puede existir sin necesidad del analizador ya que un "Analizador" necesita varios "Modulos" para funcionar no alrevez. Por ejemplo, un proyecto puede necesitar de un solo modulo y no seria necesario usar un analizador para saber el avanze del proyecto, pero si un proyecto tiene mas de un modulo el analizador si seria necesario.

## 9. ¿Qué relación existiría si solo se recibiera Modulo[] en un método?
En ese caso la relacion seria de Dependencia ya que la clase "Analizador" usaria a la clase "Modulo" de forma temporal.

## 10. ¿Qué retorna buscarModulo() si no encuentra coincidencia
Si nuestra función "buscarModulo" no encuentra un objetivo entonces devuelve un puntero null, lo que significa que el objeto que reciba el valor de la funcion estara vació. Esto nos ayuda a identificar si la funcion cumplio su proposito o no. 