pipeline {
    agent any
    tools { 
        maven 'maven-3.8' 
        jdk 'jdk1.8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = $PATH"
                    echo "M2_HOME = $M2_HOME"
                ''' 
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}
