pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/imvb1411/Calculator.git'
                // sh './mvnw clean compile'mvn
                bat 'mvn clean compile'

            }
        }
        stage('Test') {
            steps {
                // sh './mvnw test'
                bat 'mvn test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}