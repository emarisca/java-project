pipeline {
    agent any
    tools {
        maven "MAVEN"
    }
    environment {
        NEXUS_VERSION = "nexus3"
        NEXUS_PROTOCOL = "http"
        NEXUS_URL = "localhost:8081"
        NEXUS_REPOSITORY = "java-project"
        NEXUS_CREDENTIAL_ID = "NEXUS_CRED"
    }
    stages {
        stage("Clone code from GitHub") {
            steps {
                script {
                    git branch: 'main', credentialsId: 'githubwithpassword', url: 'https://github.com/emarisca/java-project';
                }
            }
        }
    }
    stage("Maven Build") {
        steps {
            script {
                sh "mvn package -DskipTests=true"
            }
        }
    }
}