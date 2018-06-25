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