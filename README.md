# BankAccount Project

A JavaFX application for managing bank accounts with user authentication.

## Features

- User login and sign-up functionality
- Account management (Checking Account support)
- Simple and clean JavaFX UI using FXML

## Technologies Used

- Java 22
- JavaFX 24
- FXML for UI layouts

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 22 or later installed
- JavaFX SDK 24 installed and configured

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/NoLimitJP/BankAccount-Project.git
   cd BankAccount-Project
Compile the project:

bash
Copy
Edit
javac --module-path lib --add-modules javafx.controls,javafx.fxml -d out src/**/*.java
Run the application:

bash
Copy
Edit
java --module-path lib --add-modules javafx.controls,javafx.fxml -cp out gui.App
Notes
Ensure your lib folder contains the necessary JavaFX SDK modules.

.class files output to the out directory.

The bin folder is excluded from the repository.

Contributing
Feel free to open issues or submit pull requests.

License
This project is licensed under the MIT License.

