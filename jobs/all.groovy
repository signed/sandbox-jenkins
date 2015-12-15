job('DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/signed/sandbox-jenkins.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven {
            goals('clean')
            goals('verify')
            mavenInstallation('mvn_3.3.9')
        }
    }
}
