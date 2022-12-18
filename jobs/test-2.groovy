#!/usr/bin/env groovy

pipelineJob('test-2') {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {
            stage ('echo') {
              steps {
                echo "Hello World 2"
              }
            }
          }
        }'''.stripIndent())
    }
  }
}