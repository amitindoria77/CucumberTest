pipeline
   
   agent any
   
   stages {
       
       stage ('Compile Stage') {
       
          steps {
          
                withMaven(maven: 'maven-3.8.1') {
                    sh 'mvn clean install'
                }
                
              }
           } 
            
         stage ('Test Stage') {
       
          steps {
          
                withMaven(maven: 'maven-3.8.1') {
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
