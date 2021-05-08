node ("windows"){
    agent any
    tools { 
        maven 'maven-3.8.1' 
        jdk 'jdk1.8' 
    }
    stages {

        stage ('Build') {
            steps {
                    sh 'mvn clean install'
                 }
           }
        stage ('Test Stage') {
            steps {
                    sh 'mvn test'
            } 
         }
        stage ('Cucumber Reports') {
            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'   
            }
        }
    }
}
