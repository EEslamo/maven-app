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
                    echo "this message for confirming that the pipeline has been triggered automatically"
                    echo "another line to confirm webhook trigger"
                }
            }
        }

        stage('build-maven') {
            steps {
                script {
                    echo "Building maven in ${BRANCH_NAME} branch..."
                    sh 'mvn package'
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
