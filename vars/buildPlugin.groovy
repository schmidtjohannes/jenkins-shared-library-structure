def call(Map config) {
    node {
        agent {
            label 'devops-jenkins-agent'
        }
        stage "Say Hi"
        sh "echo Hi ${config.url}"
        stage "Say Hi Again"
        sh "docker ps"
    }
}
