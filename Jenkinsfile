pipeline {
    agent any

    tools {
        maven 'maven-3.9'
    }

    stages {
        stage('test') {
            steps {
                script {
                    echo "Testing the application in ${BRANCH_NAME} branch"
                }
            }
        }

        stage('build-maven') {
            steps {
                script {
                    echo "Building maven in ${BRANCH_NAME} branch..."
                }
            }
        }
        
        stage('deploy-maven') {
            steps {
                script {
                    echo "Deploying the application in ${BRANCH_NAME} branch..."
                }
            }
        }
    }
}
