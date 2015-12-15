job('DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/signed/sandbox-jenkins.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}


job('example') {
    steps {
        shell('echo "first step"')
    }
    // configure the XCode builder plugin as second step
    configure { project ->
        project / builders << 'au.com.rayh.XCodeBuilder' {
            // add necessary elements here
        }
    }
    steps {
        shell('echo "last step"')
    }
}
