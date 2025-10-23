# 🌌 StarWarsAPI – Java API Consumption & JSON File Generator

> 🧭 This project corresponds to the **Java: Consuming APIs, Writing Files, and Handling Errors** course
> from the [Alura](https://www.aluracursos.com/) [ONE](https://www.oracle.com/mx/education/oracle-next-education/) program.
> It is the final challenge of the **Java Object-Oriented Programming G9 – ONE** formation track.

---

## 🧠 Project Overview

**StarWarsAPI** is a simple Java console application that connects to the **Star Wars API (SWAPI)** to fetch data about the saga’s movies (Episodes I–VI).

The app demonstrates how to:

* Consume public APIs using **`java.net.http`**
* Parse JSON responses with **Gson**
* Handle exceptions gracefully
* Save API data to a **local JSON file**

---

## 🧩 Project Structure

```
src/
├── ConsultaPelicula.java      → Fetches movie data from the SWAPI API
├── GeneradorDeArchivo.java    → Saves fetched movie data as a JSON file
├── Pelicula.java              → Record representing the movie data model
└── Principal.java             → Main entry point of the program
```

---

## ⚙️ Features Implemented

* Connects to the **SWAPI API** (`https://swapi.py4e.com/api/films/{id}/`)
* Retrieves detailed data for Star Wars movies (I to VI)
* Handles invalid input and missing movie data
* Converts API responses into Java objects using **Gson**
* Saves movie data as a formatted `.json` file
* Uses **try-with-resources** for safe file writing
* Demonstrates exception handling with `try-catch` blocks

---

## 💻 Example Usage

### 🪐 Input

```
Escriba el número de la película de Star Wars que quiere consultar:
1
```

### 📤 Output (in console)

```
Pelicula[title=A New Hope, episode_id=4, director=George Lucas, producer=Gary Kurtz, release_date=1977-05-25]
Archivo JSON generado correctamente.
```

### 📁 Output File

`A New Hope.json`

```json
{
  "title": "A New Hope",
  "episode_id": 4,
  "opening_crawl": "It is a period of civil war...",
  "director": "George Lucas",
  "producer": "Gary Kurtz, Rick McCallum",
  "release_date": "1977-05-25"
}
```

---

## 🧾 Learning Objectives

Through this project, you practiced:

* ✅ Consuming REST APIs in Java
* ✅ Converting JSON to Java objects (and vice versa)
* ✅ Writing JSON data to local files
* ✅ Handling runtime and input exceptions
* ✅ Applying clean code principles and modular design

---

## 🛠️ Technologies Used

* **Java 17+**
* **Gson** (Google JSON library)
* **Java.net.http**
* **IntelliJ IDEA**
* **SWAPI (Star Wars API)**

---

## 🚀 How to Run

1. Clone the repository

   ```bash
   git clone https://github.com/GuillenA7/Star-Wars-API-Java-Challenge-Alura-ONE-.git
   ```

2. Open in your preferred IDE (IntelliJ, Eclipse, VS Code).

3. Run the `Principal.java` class.

4. Enter a movie number between **1 and 6** when prompted.

---

## 🧑‍💻 Author

**Bruno Darío Fernández Ellerbach (Instructor: Alura ONE Program)**

Adapted and practiced by *Jose Adrian Guillen Lamas*

as part of the **Java Object-Oriented Programming G9 – ONE** training.

---

## 📚 License

This project is for educational purposes as part of the Alura ONE learning path.

Feel free to clone, modify, and extend it for your own learning.

---

> ⭐ *“APIs are the bridges of modern software — connect, explore, and create.”*
