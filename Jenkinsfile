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
                }
            }
        }
        stage('build-image') {
            steps {
                script {
                    gv.buildImage()
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
