workflowJob('Jekyll Pipeline') {
  definition {
    cpsScm {
      scm {
        git('https://github.com/skeenan947/skeenan.net') { node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('skeenan.net Jenkins')
            node / gitConfigEmail('ci@skeenan.net')
        }
        scriptPath('Jenkinsfile')
      }
    }
  }
}
