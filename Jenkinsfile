pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Fetch the latest code from the GitHub repository
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                // Use 'bat' for Windows environment to run Maven
                // This command compiles the code and executes JUnit tests
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            // Archive JUnit test results to display them in Jenkins UI
            junit '**/target/surefire-reports/*.xml'
        }
    }
}