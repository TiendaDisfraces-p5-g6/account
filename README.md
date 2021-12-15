# Proyecto de Ciclo IV: Tienda de alquiler de Disfraces
Este proyecto está enfocado en la creación de una página web que permita de forma sistemática el alquiler de disfraces y en una versión siguiente de manera adicional el
alquiler de trajes, el valor agregado está en la personalización de los disfraces, adicional a la opción de alquiler de prendas en stock

### Microservicio: solicitudes
para la realizacion de este microservicio se utilizo el framework spring boot, con el lenguaje de programacion java, las pruebas correspondientes se realizaron en postman

### Contenido de Este repositorio: 

 1. Se tiene una carpeta llamada src/main/java/com la cual incluye las carpetas: controllers, exceptions, models y repositories

 2. Se tiene el archivo llamada pom.xml el cual es un archivo que contiene información sobre el proyecto y los detalles de configuración utilizados por Maven para construir el proyecto.
 
 3. Se creo un archivo dockerfile el cual es un archivo de texto plano que contiene una serie de instrucciones necesarias para crear una imagen en un contenedor

 4. Se tienen un archivo que permite iniciar un servidor web de manera local el cual es mvnw.

 ### Requerimientos 
      ```
        groupId: org.springframework.boot
 	artifactId: spring-boot-starter-parent
	version: 2.5.7		

	groupId: com.g6
	artifactId: accountBack
	version: 0.0.1-SNAPSHOT
	
        java version: 8
	
	groupId: org.springframework.boot
	artifactId: spring-boot-starter-data-mongodb
	
        groupId: org.springdoc
        artifactId: springdoc-openapi-ui
        version: 1.5.2
                
        groupId: io.springfox
	artifactId: springfox-swagger2
	version: 2.9.2
	
	groupId: io.springfox
	artifactId: springfox-swagger-ui
	version: 2.9.2
        
        groupId: org.springframework
	artifactId: spring-context
	version: 5.3.13
	
	plugin:
	groupId: org.springframework.boot
	artifactId: spring-boot-maven-plugin
      ```

### Ejecución del proyecto

para ejecutar el proyecto en local:

1. Se descarga el proyecto comprimido de GitHub

2. Al tener el proyecto en el ordenador, por la consola de comandos de ingresa al proyecto utilizando el comando cd:
   ```
    cd proyecto_p5Final
   ```
3. se debe ingresar el siguiente comando para ejecutar el proyecto en local(computador personal o servidor):

   ```
     ./mvnw spring-boot:run
   ```
4. cuando se hagan cambios en local es necesario ingresar el siguiente comando y se ejecuta posteriormente:
   ```
     ./mvnw package
     ./mvnw spring-boot:run
   ```

El proyecto se encuentra en un contenedor docker en la plataforma heroku:

https://accountbak.herokuapp.com/

### Pruebas

La ejecución de los casos de prueba se hizo por medio de la aplicacion postman:

https://go.postman.co/workspace/My-Workspace~e1b3bbc5-068f-4b94-81a3-673a8a8700d5/collection/17863004-693e54c9-35ec-4caa-9790-63e40106306d
