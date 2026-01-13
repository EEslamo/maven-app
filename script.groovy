def buildApp() {
    echo 'Building the application...'
    sh 'mvn package'
}

def buildImage() {
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'DOCKERHUB_USERNAME', passwordVariable: 'DOCKERHUB_PASSWORD')]) {
        sh '''
            docker build -t eeslamo003/jenkins-app:2.0 .
            echo $DOCKERHUB_PASSWORD | docker login -u $DOCKERHUB_USERNAME --password-stdin
            docker push eeslamo003/jenkins-app:2.0
            '''
    }
}

def deployApp() {
    echo 'Deploying the application...'
}

return this
