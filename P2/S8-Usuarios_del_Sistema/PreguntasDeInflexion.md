# Preguntas De Inflexión
## 6. ¿Por qué ArrayList< Usuario> acepta objetos Administrador?
Los ArrayList pueden aceptan clases hijas de la clase con la que fueron instanciados debido a que cada clase hija es una clase padre en parte y debido tambien al polimorfismo.

## 7. ¿Qué método se ejecuta al llamar mostrarInformacion()?
Se llama al metodo super.mostrarInformacion(), ya que la funcion es en parte la misma que la del padre.

## 8. ¿Qué diferencia hay entre el tipo de la variable y el tipo real del objeto?
Tipo de la variable (o tipo estático / declarado): Es el tipo con el que se declara la variable en el código. Define la "lupa" o la interfaz con la que el compilador ve al objeto; determina qué métodos y atributos son accesibles durante la compilación.

Tipo real del objeto (o tipo dinámico / de instanciación): Es la clase que se utilizó realmente al crear el objeto usando el operador new en la memoria. Define cómo se comportará el objeto al ejecutar los métodos (gracias al polimorfismo).

## 9. ¿Por qué SistemaUsuarios representa agregación?
Porque SistemaUsuarios agrega a toda clase que sea de tipo Usuario es decir puede contener a Administrador, Desarrollador y cliente varias veces.

## 10. ¿Qué datos deberían permanecer en Usuario y cuáles en las hijas
Los datos como la nombre y correo deben permanecer en usuario, mientras que otros datos como los permisos podrian permanecer solo en las clases hijas.
