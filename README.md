# Gestión de Reserva de Animales

## Descripción del Proyecto

Este proyecto consiste en la creación de una API para la gestión y mantenimiento de una reserva de animales. La API permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los animales de la reserva, así como consultas específicas según familia, tipo y país de origen. Además, se implementa un sistema de autenticación basado en **JWT** o **Basic Auth** para garantizar la seguridad de las operaciones privadas.

---

## Tecnologías Utilizadas en este proyecto

- **Backend**: Spring Boot (Java)
- **Base de Datos**: MySQL
- **Autenticación**: Spring Security (Basic Auth)
- **Herramientas de Desarrollo**: Visual Studio Code, Postman, Git y Github

---

## Requisitos del Sistema

- Java 17 o superior
- MySQL 8.x
- Maven
- Spring Boot

---

## Instalación y Configuración

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/jose30-back/reserva-natural.git
   cd reserva-natural
   ```

## Configurar la base de datos:

1. **Crear una base de datos en MySQL llamada reserva_natural.**
   **Configurar las credenciales en application.properties:**
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/reserva_natural
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   ```

## Ejecutar la aplicación:

    ``bash
    mvn spring-boot:run

## Acceder a la API:

    La API estará disponible en http://localhost:8080.

## Familias de Animales

Las familias mínimas requeridas son:

- **Félidos**: León, Tigre, Leopardo, etc.
- **Cánidos**: Zorro, Lobos, Chacales, etc.
- **Reptiles**: Cocodrilos, Serpientes, Iguanas, etc.
- **Mustélidos**: Nutria, Comadrejas, Tejones, etc.
- **Lepóridos**: Conejos y Liebres.

---

## Datos de Registro de un Ejemplar

Cada animal debe registrarse con los siguientes datos:

- **Nombre**: Nombre del animal.
- **Tipo**: Especie o tipo de animal.
- **Familia**: Familia a la que pertenece.
- **Género**: Género del animal (Macho/Hembra).
- **País de origen**: País de donde proviene el animal.
- **Fecha de ingreso**: Fecha en que el animal ingresó a la reserva.

## Endpoints Públicos

    Obtener todos los animales (paginados):
        Método: GET
        URL: /public/animals?page=0&size=20

    Obtener animales por familia (paginados):
        Método: GET
        URL: /public/animals/family/{family}?page=0&size=10

    Obtener animales por pais de origen sin paginacion
        Metodo: GET
        URL; /public/animals/country/{country}

    Obtener animales segun familia y tipo sin paginacion
        Metodo: GET
        URL: /public/animals/family/{family}/type/{type}

## Endpoints Privados (Requieren Autenticación basica)

    Añadir un nuevo ejemplar:
        Método: POST

        URL: /private/animals

        Body:
        json
        Copy

        {
          "nombre": "León",
          "tipo": "Panthera leo",
          "familia": "Félidos",
          "genero": "Macho",
          "paisOrigen": "África",
          "fechaIngreso": "2023-10-01"
        }

    Suprimir un ejemplar
        Metodo: DELETE
        URL: /private/animals/{id}


    Editar un ejemplar​
        Metodo: PUT
        URL: /private/animals/{id}

    Obtener la cantidad total de animales
        Metodo: GET
        URL: /private/animals/total

    Obtener un animal según su nombre
        Metodo: GET
        URL: /private/animals/{name}


Configura la base de datos:

    Abre el archivo application.properties y configura las credenciales de tu base de datos.

     Ejemplo para MySQL:
     properties
     Copy

    spring.datasource.url=jdbc:mysql://localhost:3306/reserva_animales
    spring.datasource.username=root
    spring.datasource.password=tu-contraseña

Compila el proyecto:

    mvn clean install

Ejecuta la aplicación:

    mvn spring-boot:run

Accede a la API en:

    http://localhost:8080

Autenticación

Basic Auth

    Usuario: admin

    Contraseña: admin123 (configurable en application.properties).

Contribuciones

Si deseas contribuir a este proyecto, sigue estos pasos:

    Haz un fork del repositorio.

    Crea una rama para tu contribución (git checkout -b feature/nueva-funcionalidad).

    Realiza tus cambios y haz commit (git commit -m "Añade nueva funcionalidad").

    Haz push a la rama (git push origin feature/nueva-funcionalidad).

    Abre un Pull Request.

Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
