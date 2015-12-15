job('DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/signed/sandbox-jenkins.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
