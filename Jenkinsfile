pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
    }
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
                    docker.build("tahir:${env.BUILD_NUMBER}")
                }
            }
        }

        stage('Run docker container'){
            steps{
                script{
                    docker.image("tahir:${env.BUILD_NUMBER}").run("-d -p 6565:6565 --name demo-container")
                }
            }
        }
    }
}
