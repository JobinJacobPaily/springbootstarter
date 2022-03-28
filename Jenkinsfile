pipeline {
    
    agent any 
    stages {
        
     stage('Build') {
        
       steps{
           git branch: 'main', url: 'https://github.com/jobinjacobpaily-tracesafe/springbootstarter.git'
            sh '''pwd
               echo "installing the dependencies"
                mvn install
                 mvn clean package'''
       }
       
    }
    
    stage('Dockerization') {
       steps {
        sh 'sudo docker system prune -f'
        sh 'sudo docker build -t jenkins_file . -f Dockerfile-2'
       }
    }
    
    
    stage('Running Container') {
        
      steps{
          
            script {
                echo "hello"
               def exist = sh (returnStdout: true, script :"sudo docker ps -a | wc -l").trim()
                echo "hello"
                echo "exist ${exist}"
                if(exist != "1") {
                   def running = sh (returnStdout:true, script : "sudo docker ps -f name=starter | wc -l").trim()
                   echo "running ${running}"
                   if(running != "1") {
                       sh 'sudo docker stop starter'
                   }
                   sh 'sudo docker rm starter'
                   }
            }
            sh 'sudo docker ps -a'
            
            sh 'sudo docker run --name starter --network=host -d jenkins_file'
      }
    }
    }
    
    post {
        failure {
            sh 'echo "build failed"'
        }
        success {
            sh 'echo "SUCCESS"'
        }
    }
}
