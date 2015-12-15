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


def project = 'Netflix/asgard'
def branchApi = new URL("https://api.github.com/repos/${project}/branches")
def branches = new groovy.json.JsonSlurper().parse(branchApi.newReader())
branches.each {
    def branchName = it.name
    def jobName = "${project}-${branchName}".replaceAll('/','-')
    job(jobName) {
        scm {
            git("https://github.com/${project}.git", branchName)
        }
    }
}