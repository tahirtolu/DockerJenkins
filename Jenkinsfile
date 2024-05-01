pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[url: 'https://github.com/tahirtolu/DockerJenkins']]
                )
                bat 'mvn clean install'
            }
        }

        stage('Build docker image'){
            steps{
                script{
                    docker.build("deneme2:${env.BUILD_NUMBER}")
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    docker.image("tahir:${env.BUILD_NUMBER}").run("-d -p 8085:8085 --name demo-container")
                }
            }
        }
    }

}