pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                // Le 'call' aide Windows à ne pas quitter le script après Maven
                bat 'call mvn clean test'
            }
        }
    }
}