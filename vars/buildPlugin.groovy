def call(Map config) {
    node {
        agent devops-jenkins-agent
        stage "Say Hi"
        sh "echo Hi ${config.url}"
        stage "Say Hi Again"
        sh "docker ps"
    }
}
