CALCULADORA JAVA - MVC

REQUISITOS
- Tener instalado un JDK (Java 17 o posterior).
- Tener VS Code y la extension Extension Pack for Java.

COMO EJECUTAR EN VS CODE
1. Descomprime CalculadoraMVC.zip.
2. Abre la carpeta CalculadoraMVC en VS Code.
3. Abre CalcMVC.java.
4. Presiona el boton Run o Ejecutar que aparece sobre el metodo main.

TAMBIEN PUEDES EJECUTAR DESDE LA TERMINAL
Abre la terminal integrada en la carpeta del proyecto y ejecuta:

javac *.java
java CalcMVC

FUNCIONAMIENTO
- La calculadora inicia con resultado 0.
- Escribe un numero entero y pulsa Multiplicar.
- El numero escrito se multiplica por el resultado actual.
- Pulsa Limpiar para regresar el resultado a 0.

ESTRUCTURA MVC
- CalcModel.java: almacena el resultado y realiza la multiplicacion.
- CalcView.java: construye la ventana y sus componentes.
- CalcController.java: conecta los botones con el modelo.
- CalcMVC.java: crea los objetos e inicia la aplicacion.

Nota: esta version sigue el ejemplo del PDF: realiza multiplicaciones sucesivas
con numeros enteros. Por ejemplo, si escribes 5 y luego 3, el resultado sera 15.
