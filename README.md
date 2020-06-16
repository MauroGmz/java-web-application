# Aplicación Java Sobre Web - 2020
* Profesor: Alejandro Vazquez
* Alumno: Mauro Gómez


## Actividades
#### **spring-bot**

Ejercicio 9: se cambió el puerto or defecto que incluye Spring. 
Cuando se modifica el puerto en `application.properties`, se puede notar el cambio en el log cuando la aplicación spring inicia:

~~~~
Tomcat initialized with port(s): 5050 (http)
~~~~
#### **JPA**
Correr la clase principal `Ejercicio10Application` ubicada en `src/main/java/clasejpa/ejercicios`. Se utilizó una base de datos H2 Y el resultado se imprime en el log de spring. 

#### **API Telegram**
Ejecutar la clase `TelegramSpringApplication` ubicada en `src/main/java/ejerciciotelegrambot/ejercicios`. Se utilizó una base de datos H2 para guardar los usuarios. 
Se crearon los siguientes comandos que deberán ser escritos en el chat con el bot:

|Comando|Descripción|
|-------|-----------|
|`/myname`| Devuelve el nombre de pila del usuario|
|`/mylastname`| Devuelve el apellido del usuario|
|`/myfullname`| Devuelve el nombre completo del usuario de Telegram|
|`/saveuser`| Guarda un usuario en la base de datos y se lo mostrará en el chat (el usuario deberá ingresarse por consola)|
|`/userslist`| Se muestra en el chat una lista de los usuarios en la base de datos|
|`/findbyid`| Busca un usuario a través del id (hardcodeado para prueba)|
|`/findlastname`| Busca un usuario por el apellido (hardcodeado para prueba)|

