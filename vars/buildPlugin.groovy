def call(Map config) {
    node {
        stage "Say Hi"
        sh "echo Hi ${config.url}"
        stage "Say Hi Again"
        sh "docker ps"
    }
}
