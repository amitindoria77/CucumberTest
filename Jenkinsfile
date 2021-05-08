pipeline
    agent any
    tools { 
        maven 'Maven 3.8.1' 
        jdk 'jdk8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        stage ('Build') {
            steps {
                withMaven(maven: 'maven-3.8.1') {
                    sh 'mvn clean install'
                                                }   
                  }
           }      
      
   }
