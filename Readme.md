# Steps to get started
1. `docker-compose up`
1. configure gogs
1. configure jenkins
   1. install recommended plugins
   1. configure docker in global tools
1. Build the primed maven image in jenkinsifle/build_primed_image_for_ci.sh

https://dzone.com/articles/dockerizing-jenkins-2-setup-and-using-it-along-wit

Details about the [jenkins docker image](https://github.com/jenkinsci/docker/blob/master/README.md).

Details about the [gogs docker image](https://github.com/gogs/gogs/tree/master/docker).


Run [docker outside of docker](https://container-solutions.com/running-docker-in-jenkins-in-docker/) with jenkins and a [later blog post](https://getintodevops.com/blog/the-simple-way-to-run-docker-in-docker-for-ci)

https://forums.docker.com/t/mounting-using-var-run-docker-sock-in-a-container-not-running-as-root/34390

use [tags](https://jenkins.io/blog/2018/05/16/pipelines-with-git-tags/) to alter pipeline execution https://jenkins.io/blog/2018/05/16/pipelines-with-git-tags/

# Documentation

* https://jenkins.io/doc/pipeline/steps/
* https://jenkins.io/doc/book/pipeline/syntax/

# Blog
* http://www.baeldung.com/jenkins-pipelines (scripted pipeline sample)
* BlazeMeter
  * https://www.blazemeter.com/blog/how-to-use-the-jenkins-declarative-pipeline?utm_source=blog&utm_medium=BM_blog&utm_campaign=how-to-use-the-jenkins-scripted-pipeline (declarative)
  * https://www.blazemeter.com/blog/how-to-use-the-jenkins-scripted-pipeline (scripted)

# sample jenkins files
* https://stackoverflow.com/questions/46669535/how-to-define-parallel-stages-in-a-declarative-jenkinsfile
  * parallel
  * options
  
* https://github.com/jfrog/project-examples
  * sample for artifactory
  
* https://github.com/funkwerk/jenkins-workflow
  * contains some samples
  
  
# Commands
- docker-compose up --build  jenkins
- docker-compose up -d jira  master atlassian  
# Run Jira
- https://riptutorial.com/jira/topic/9049/starting-a-local-jira-test-instance
