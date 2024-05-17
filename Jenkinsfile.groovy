pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/vinutha18-m/nodejs-app.git'
                sh 'npm install'
            }
        }

        stage('Test') {
            steps {
                sh 'npm test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'npm run deploy'
            }
        }
    }
}