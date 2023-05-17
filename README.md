# 14/05/2023 RR9_UnconfirmedTitle

### Harry Potter and the Patronus Protection Program 🦌✨
### Harry Potter and the Sorcerer's Sorting Scroll: Digital Defence Against the Dark Arts  🧙‍📜🔮
### Harry Potter and the Quantum Quills: Merging Magic and Muggle Science
### Harry Potter and the Digital Defense Against the Dark Arts
What if I told you that magic is real? What if I told you that wizards, witches, and everything from the world of Harry Potter is real, and they need you now?

In our fast-paced, modern world, they can't solve everything with spells and potions anymore. That's why now more than ever, Hogwarts School of Witchcraft and Wizardry needs a little bit of Muggle technology, to make the management of this enormous castle less of a headache. Of course, since witches and wizards have no idea about technology, you'll disguise your API as a set of more wizard-friendly spells, so that it's more intuitive for the target audience.

Let the techno... ahem, magic, begin!

## Description

This is a Spring Boot application for managing information about Hogwarts in the Wizarding World. The application uses Spring APIs, JPA Repository, and PostgreSQL database.

## Getting Started
To get started with this project, you will need to have the following tools installed on your local machine:

- Java 11 or higher
- Apache Maven
- PostgreSQL database

## API Endpoints
The following API endpoints are available in the application:

- GET /rooms: A list of all rooms is returned.
- POST /rooms: A new room can be added.
- GET /rooms/{roomId}: The room with the specified ID is returned.
- DELETE /rooms/{roomID}: The room with the specified ID is deleted.
- PUT /rooms/{roomId}: The room with the specified ID is updated.
- GET /rooms/available: A list of all available rooms is returned.
- GET /rooms/rat-owners: A list of rooms, residents of which have no cats or owls, is returned.

| HTTP Method | Endpoint            | Description                                              |
|-------------|---------------------|----------------------------------------------------------|
| POST        | /rooms              | Add a new room.                                          |
| GET         | /rooms              | Retrieve a list of all rooms.                            |
| GET         | /rooms/{roomId}     | Retrieve a specific room by its ID.                       |
| PUT         | /rooms/{roomId}     | Update a specific room by its ID.                         |
| DELETE      | /rooms/{roomId}     | Delete a specific room by its ID.                         |
| GET         | /rooms/available    | Retrieve a list of all available rooms.                   |
| GET         | /rooms/rat-owners   | Retrieve a list of rooms with residents having no cats or owls. |


| HTTP Method                                        | Endpoint            | Description                                              |
|----------------------------------------------------|---------------------|----------------------------------------------------------|
| ![badge](https://img.shields.io/badge/POST-yellow) | `/rooms`              | Add a new room.                                          |
| ![badge](https://img.shields.io/badge/GET-blue)    | `/rooms`              | Retrieve a list of all rooms.                            |
| ![badge](https://img.shields.io/badge/GET-blue)    | `/rooms/{roomId}`     | Retrieve a specific room by its ID.                       |
| ![badge](https://img.shields.io/badge/PUT-success) | `/rooms/{roomId}`     | Update a specific room by its ID.                         |
| ![badge](https://img.shields.io/badge/DELETE-red)  | `/rooms/{roomId}`     | Delete a specific room by its ID.                         |
| ![badge](https://img.shields.io/badge/GET-blue)    | `/rooms/available`    | Retrieve a list of all available rooms.                   |
| ![badge](https://img.shields.io/badge/GET-blue)    | `/rooms/rat-owners`   | Retrieve a list of rooms with residents having no cats or owls. |


## Technologies Used
- **Spring Boot**
- **Spring APIs**
- **JPA Repository**
- **PostgreSQL database** 
