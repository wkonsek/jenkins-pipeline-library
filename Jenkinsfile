pipeline {
  agent any
  stages {
    stage('1') {
      steps {
        script {
          sh(returnStdout: true, script: "git tag --contains").trim()
        }
        
      }
    }
  }
}