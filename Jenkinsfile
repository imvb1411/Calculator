pipeline {
    agent any
    tool name: 'Maven', type: 'maven'
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/imvb1411/Calculator.git'
                // sh './mvnw clean compile'mvn
                bat 'mvn clean compile'

            }
        }
    }
}
