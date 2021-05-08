pipeline {
    agent any
    tools { 
        maven 'maven-3.8' 
        jdk 'jdk1.8' 
    }
    stages {

        stage ('Build') {
            steps {
                withMaven(maven: 'maven-3.8') {
                    sh 'mvn clean install'
                    }   
                 }
           }
        stage ('Test Stage') {
            steps {
                withMaven(maven: 'maven-3.8') {
                    sh 'mvn test'
                } 
            } 
         }
        stage ('Cucumber Reports') {
            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonRepositoryDirectory: 'target'   
                }   
        }   
        }
    }
}
