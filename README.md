# PrototipoBasedeDatosJava
Este es un prototipo de una base de datos en el que se puede evidenciar como las clases de java interactúan entre si, tomando un modelo referencia de inventario de hardware y software de una empresa de tecnología.

# Este prototipo gestiona un sistema CRUD (SQL).
# Este prototipo utliza el diseño de software MVC:
  El modelo vista controlador (MVC) es un patrón de diseño de software que se utiliza para estructurar el código de una aplicación. El objetivo principal del patrón MVC es separar la lógica de la aplicación en tres componentes principales:

  Modelo (Model): Este componente es responsable de gestionar los datos de la aplicación. El modelo define la estructura de los datos y cómo se accede y se modifica la información.

  Vista (View): Este componente se encarga de presentar los datos del modelo al usuario. La vista define cómo se muestran los datos y cómo se interactúa con ellos.

  Controlador (Controller): Este componente se encarga de recibir y procesar las solicitudes del usuario. El controlador interactúa con la vista y el modelo para actualizar los datos y responder a las acciones del usuario.

  En el patrón MVC, la vista y el controlador se comunican a través de una interfaz de programación de aplicaciones (API) que proporciona el modelo. Esto significa que la vista y el controlador no tienen acceso directo al modelo y no pueden modificarlo sin pasar por el controlador.
  
# Recursos para poder ejecutar el proyecto: 
  
  
 1) JDK-17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
 2) Apache NetBeans: https://netbeans.apache.org/download/nb14/
 3) XAMMP (BASE DATA): https://www.apachefriends.org/es/index.html


# Instalación:

1) Instalar los recursos necesarios.
2) Descargar o clonar este repositorio.
3) Abrir XAMMP, ejecutar e iniciar Apache y MySQL.
4) Ir a MySQL (http://localhost/phpmyadmin/), crear una base de datos llamada "reto5" e importar la base de datos que se encuentra en el repositorio (PrototipoBasedeDatosJava/DataBase/reto5.sql).
5) Abrir Apache NetBeans (Recomendable la versión-17) y abrir el proyecto (Reto6).
6) Comprobar que Netbeans corra con JDK-17 el proyecto.
7) Comprobar que el proyecto Tenga las librerías  mysql-connector-java-8.0.29.jar , Junit 4.13.2 y JDK 17 
8) En caso de no tener dichas librerías puede encontrarlas en la carpeta "librerias" que se encuentra en el proyecto (Reto6\Librerias) e instalarlas desde NetBeans al proyecto (Hacer este paso solo en caso de no encontrar las librerías ).
9) Ir a la clase conexion.java (Reto6/SourcePackages/controlador/conexion.java) y asegurarse de que las variables "user" y "password" estan igual a como usted configuro MySQL  y que la variable "url" tenga la ruta a la base de datos ej: (String url ="jdbc:mysql://localhost:3306/reto5";). En caso de no haber llamado "reto5" la base de datos, cambiar el nombre "reto5" por el nombre que usted le puso.
10) Ejecutar el proyecto desde el botón de "play" o pulsando "F6".



# Test y Pruebas unitarias.

Este proyecto cuenta con test y pruebas unitarias gracias a que se hace uso de la libreria JUnit 1.13.2.
En el archivo Pruebas.java (Reto6/TestPackages/<defaultpackage>/Pruebas.java) podra probar algunos test que he generado, si quiere puede generar sus propios test haciendo uso de la etiqueta "@Test".
  
  
  
Se están probando nuevas librerías para poder implementar en el proyecto.
  
  
  
  
  
# Si quieres aprender sigue mi canal: https://www.youtube.com/channel/UC0MwhrWoo_vBfO5yyWEMdvA
  
  Algunas listas de reproduccion de mis trabajos:
  1) https://www.youtube.com/playlist?list=PLUzHPkQscM7LlaUa4qEd9sILxfghSo0jC
  2) https://www.youtube.com/playlist?list=PLUzHPkQscM7KgYprVWFUUvsjyCw_tLieO 
  3) https://www.youtube.com/playlist?list=PLUzHPkQscM7KSK17ysaVsfApApHFuy8VS
  4) https://www.youtube.com/playlist?list=PLUzHPkQscM7ID_lMObNCX4KktGpu09_f9
  5) https://www.youtube.com/playlist?list=PLUzHPkQscM7IRLqBKJsxFlEbrk5b-WPTi
  
  


