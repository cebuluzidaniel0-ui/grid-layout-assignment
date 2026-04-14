pipeline {
    agent any

    tools {
        // Use the Maven configuration named 'M3' defined in your Jenkins settings
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull the latest code from the GitHub repository
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // 'bat' is required for Windows, 'call' ensures the process finishes correctly
                bat 'call mvn clean test'
            }
        }
    }
}