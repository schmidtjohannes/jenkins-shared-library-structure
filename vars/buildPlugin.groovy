def call(Map config) {
    pipeline {
        agent {
            label 'devops-jenkins-agent'
        }
        stages {
            stage('Say Hi') {
                steps {
                    echo "Hi ${config.url}"
                }
            }
            stage('Say Hi Again') {
                steps {
                    sh "docker ps"
                }
            }
        }
    }
}
