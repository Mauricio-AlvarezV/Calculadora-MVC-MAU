# Calculadora MVC

Calculadora de escritorio desarrollada en Java Swing con el patron **Modelo-Vista-Controlador (MVC)**. Permite sumar, restar y multiplicar dos numeros, incluidos valores decimales.

## Requisitos

- JDK 8 o superior.
- No requiere bibliotecas externas.

## Ejecutar

Desde la carpeta raiz del proyecto:

```bash
javac -d out src/*.java
java -cp out CalcMVC
```

En Linux también puedes ejecutar los dos comandos anteriores desde una terminal. En Windows funcionan igual si `javac` y `java` estan agregados al PATH.

## Estructura

```text
CalculadoraMVC/
├── src/
│   ├── CalcMVC.java
│   ├── CalcModel.java
│   ├── CalcView.java
│   └── CalcController.java
├── README.md
└── .gitignore
```

- **CalcModel:** realiza las operaciones matematicas usando `BigDecimal` para admitir decimales.
- **CalcView:** contiene la ventana, los campos de entrada, el campo de resultado y los botones.
- **CalcController:** recibe los eventos de los botones, solicita el calculo al modelo y actualiza la vista.
- **CalcMVC:** crea los componentes y arranca la aplicacion.

## Casos de uso

### CU-01. Sumar dos numeros
- **Actor:** Usuario.
- **Precondiciones:** La calculadora esta abierta.
- **Flujo principal:**
  1. El usuario escribe el primer numero.
  2. El usuario escribe el segundo numero.
  3. Selecciona **Suma (+)**.
  4. Presiona **Resultado**.
  5. El sistema muestra la suma en el campo Resultado.
- **Flujo alternativo:** Si alguno de los campos esta vacio o contiene texto no numerico, el sistema muestra un mensaje de error.

### CU-02. Restar dos numeros
- **Actor:** Usuario.
- **Precondiciones:** La calculadora esta abierta.
- **Flujo principal:**
  1. El usuario captura los dos numeros.
  2. Selecciona **Resta (-)**.
  3. Presiona **Resultado**.
  4. El sistema muestra el primer numero menos el segundo.
- **Flujo alternativo:** Si la entrada no es numerica, se muestra un mensaje de error.

### CU-03. Multiplicar dos numeros
- **Actor:** Usuario.
- **Precondiciones:** La calculadora esta abierta.
- **Flujo principal:**
  1. El usuario captura los dos numeros.
  2. Selecciona **Multiplicacion (*)**.
  3. Presiona **Resultado**.
  4. El sistema muestra el producto.
- **Flujo alternativo:** Si la entrada no es numerica, se muestra un mensaje de error.

### CU-04. Limpiar la calculadora
- **Actor:** Usuario.
- **Precondiciones:** La calculadora esta abierta.
- **Flujo principal:**
  1. El usuario presiona **Limpiar**.
  2. El sistema borra los dos numeros y el resultado.
  3. El sistema elimina la operacion seleccionada y deja el foco en el primer campo.

### CU-05. Intentar calcular sin seleccionar una operacion
- **Actor:** Usuario.
- **Precondiciones:** La calculadora esta abierta y no se ha seleccionado una operacion.
- **Flujo principal:**
  1. El usuario captura los numeros.
  2. Presiona **Resultado**.
  3. El sistema solicita seleccionar una operacion.

## Flujo general

1. Capturar dos numeros.
2. Elegir suma, resta o multiplicacion.
3. Presionar Resultado.
4. Consultar el resultado o presionar Limpiar para comenzar de nuevo.
