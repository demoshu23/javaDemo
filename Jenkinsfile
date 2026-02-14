pipeline {
    agent any

    // Specify tools configured in Jenkins (Global Tool Configuration)
    tools {
        // Use exact names from Manage Jenkins → Global Tool Configuration
        maven 'maven-3'     // example: change to match your Maven tool name
    }

    environment {
        // Ensure Maven uses UTF-8
        MAVEN_OPTS = "-Dfile.encoding=UTF-8"
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone your Git repo
                git branch: 'main', url: 'https://github.com/demoshu23/javaDemo.git'
            }
        }

        stage('Build') {
            steps {
                // Build project using Maven
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests
                sh 'mvn test'
            }
        }
        stage('Email notification'){
            mail bcc: '', body: 'Notify me when pipeline fails or pass', cc: '', from: '', replyTo: '', subject: 'Jenkins pipeline', to: 'shuaws1979@gmail.com'
        }
    }

    post {
        always {
            // Archive generated JARs
            archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: false

            // Record JUnit test results
            junit 'target/surefire-reports/*.xml'
        }

        success {
            echo 'Build succeeded!'
        }

        failure {
            echo 'Build failed. Check logs for details.'
        }
    }
}
