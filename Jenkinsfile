pipeline {
    agent any
    
    stages {
        stage('clone') {          
            steps {
                git branch: 'dev', credentialsId: 'imvb14', url: 'https://github.com/imvb1411/Calculator.git'
                // sh './mvnw clean compile'mvn
            }
        }
        stage('build'){
            steps {
                bat 'mvn clean compile'
            }
        }
    }
}
