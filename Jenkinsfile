def gv
pipeline {
    agent any

    tools {
        maven 'maven-3.9'
    }

    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'pipeline/script.groovy'
                }
            }
        }

        stage('build-maven') {
            steps {
                script {
                    gv.buildApp()
                    sh 'mvn package'
                }
            }
        }
        stage('build-image') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'DOCKERHUB_USERNAME', passwordVariable: 'DOCKERHUB_PASSWORD')]) {
                        sh '''
                            docker build -t eeslamo003/jenkins-app:2.0 .
                            echo $DOCKERHUB_PASSWORD | docker login -u $DOCKERHUB_USERNAME --password-stdin
                            docker push eeslamo003/jenkins-app:2.0
                        '''
                    }
                }
            }
        }
        stage('deploy-maven') {
            steps {
                script {
                    gv.deployApp()
                    
                }
            }
        }
    }
}
