workflowJob('Jekyll Pipeline') {
  definition {
    cpsScm {
      scm {
        git {
          createTag(false)
          remote {
            url ('https://github.com/skeenan947/skeenan.net')
          }
          branch('master')
        }
        scriptPath('Jenkinsfile')
      }
    }
  }
}
