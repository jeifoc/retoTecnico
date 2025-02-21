# Instrucciones para Ejecutar el JAR

Este proyecto fue desarrollado en **Java 8** y usa **Maven** para la gestión de dependencias y construcción del JAR.

## **Requisitos Previos**
1. **Java 8** instalado y configurado en el `PATH`
2. **Apache Maven** instalado.

## **Compilación y Generación del JAR**
Desde la raíz del proyecto (donde se encuentra el `pom.xml`), ejecutar:

```sh
mvn clean package
```

Esto generará un archivo JAR en la carpeta `target/`:

```
target/reto-tecnico-animales.jar
```

## **Ejecución del JAR**
### **Ejecutar con Argumentos**
Ejecutar el siguiente comando desde la raíz del proyecto:

```sh
java -jar target/reto-tecnico-animales.jar "Max|TERRESTRE|Ladrido" "Whiskers|TERRESTRE|Maullido" "Sky|VOLADOR|Graznido" "Nemo|ACUÁTICO|Glup"
```

### **Ejecutar con Argumentos desde un Archivo**
Si los argumentos son extensos, se pueden almacenar en un archivo `input.txt`:

#### 1. Crear el archivo `input.txt` con los datos:
```txt
Max|TERRESTRE|Ladrido
Whiskers|TERRESTRE|Maullido
Sky|VOLADOR|Graznido
Nemo|ACUÁTICO|Glup
```

#### 2. Ejecutar el JAR con los datos del archivo:
```sh
java -jar target/reto-tecnico-animales.jar $(cat input.txt)
```


