workflowJob('Jekyll Pipeline') {
  definition {
    cpsScm {
      scm {
          git('https://github.com/skeenan947/skeenan.net')
          scriptPath('Jenkinsfile')
      }
    }
  }
}