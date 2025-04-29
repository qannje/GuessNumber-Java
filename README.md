# Number Guessing Game (Java)

A simple console-based number guessing game written in Java. The player has a limited number of attempts to guess a randomly generated number within a specified range.

## Features

- Configurable number of attempts and range
- Input validation
- Replay option
- Simple structure with multiple classes

## How to Play

1. Run the program.
2. Guess a number between 1 and 100.
3. You'll get hints like "higher" or "lower".
4. You have 10 attempts by default.
5. Enter `101` to quit the game at any time.

## Project Structure
```
project-root/
│
├── src/
│   └── main/
│       └── java/
│           ├── Main.java
│           └── game/
│               ├── GameRunner.java
│               └── NumberGuessingGame.java
│
└── README.md
```

## How to Run

Compile and run the program using a terminal or your favorite IDE:

```bash
javac src/main/java/Main.java
java -cp src/main/java Main
```
