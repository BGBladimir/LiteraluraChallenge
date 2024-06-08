**Literalura Challenge**  
Te damos la bienvenida al proyecto literAlura, una aplicación desarrollada en Java y construida sobre el framework Spring Boot, diseñada para facilitar la gestión de libros y autores de forma eficaz y sencilla. Este proyecto representa una respuesta al desafío del challenge de Alura, en el cual fuimos desafiados a desarrollar una aplicación para administrar una base de datos de libros y autores utilizando tecnologías modernas.

**Descripción del Proyecto**
El propósito del proyecto literAlura es asistir a los entusiastas de la literatura en la búsqueda, registro y listado de libros y autores. Además, proporciona características avanzadas como la identificación de autores vivos en un año específico y la clasificación de libros por idioma.

**Funcionamiento del Programa**

***Obtención de Datos:*** El programa toma libros de la API GutenDex. Conversión a Objetos Java: Los datos obtenidos de la API se convierten en objetos Java utilizando la clase JsonParser. Procesamiento: Los datos se procesan para asegurarse de que los libros y autores no se dupliquen en la base de datos. Almacenamiento: Los libros y autores procesados se guardan en una base de datos SQL compatible (PostgreSQL, MySQL, MariaDB, SQL Server, H2).

**Requerimientos**

- ***Buscar libro por título:*** Encuentra libros por su título.
- ***Listar libros registrados:*** Muestra todos los libros registrados en la base de datos.
- ***Listar autores registrados:*** Muestra todos los autores registrados en la base de datos.
- ***Listar autores vivos en un determinado año:*** Encuentra autores que estaban vivos en un año específico.
- ***Listar libros por idioma:*** Filtra libros por su idioma.

**Tecnologías Utilizadas**

- Java 11+
- Spring Boot 2.6.4
- Spring Data JPA
- PostgreSQL, MySQL, MariaDB, SQL Server, H2
- Jackson
- Maven

**Prerrequisitos**

- Java 11 o superior
- Maven 3.6 o superior
- Una base de datos SQL (PostgreSQL, MySQL, MariaDB, SQL Server, H2)
