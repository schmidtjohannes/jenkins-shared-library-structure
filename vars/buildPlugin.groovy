def call(Map config) {
    node {
        sh 'echo Hi ${config.url}'
    }
}
