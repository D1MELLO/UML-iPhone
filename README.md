# 📱 UML iPhone Simulation (Java OOP)

This repository contains a Java project that simulates basic functionalities of an **iPhone**, created as part of a UML modeling and Object-Oriented Programming (OOP) exercise from the **Digital Innovation One (DIO)** Java course.

## 📚 About

The goal of this project is to practice Java OOP principles by modeling a simplified version of an iPhone, based on UML class diagrams. The simulation includes functionalities such as making calls, browsing the internet, and playing music.

## 🧱 Main Concepts Applied

- Object-Oriented Programming (OOP)
  - Abstraction
  - Inheritance
  - Interfaces
  - Encapsulation
- UML Class Diagrams
- Clean code and modular structure

## 🛠️ Technologies Used

- Java 17
- IDE: IntelliJ IDEA
- Git and GitHub

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/D1MELLO/UML-iPhone.git

2. Open it in your favorite Java IDE.

3. Run the main method in the class you want to test, or instantiate the Iphone class and call its methods.

## Example Functionalities

- Make and receive calls
- Open a browser and display pages
- Play, pause, and select music

```mermaid
classDiagram
    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
