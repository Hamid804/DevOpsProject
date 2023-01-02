pipeline {
    agent any
    triggers {
    	pollSCM '* * * * *'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building...Hamid'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing...Hamid'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying...Hamid'
            }
        }
    }
}