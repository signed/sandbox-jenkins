folder('best-service-ever'){

}


mavenJob('best-service-ever/DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/signed/sandbox-jenkins.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    mavenInstallation('mvn_3.3.9')
    jdk('jdk8u66')

    goals('clean verify')
}

folder('secure-service'){

}

mavenJob('secure-service/DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/signed/sandbox-jenkins.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    mavenInstallation('mvn_3.3.9')
    jdk('jdk8u66')

    goals('clean verify')


    configure {
        it / reporters << 'hudson.maven.reporters.MavenMailer' {
            recipients("dummy")
            dontNotifyEveryUnstableBuild(false)
            sendToIndividuals(false)
            perModuleEmail(true)
        }
    }
}


