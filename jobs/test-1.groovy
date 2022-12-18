#!/usr/bin/env groovy

pipelineJob('test-1') {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {
            stage ('echo') {
              steps {
                echo "Hello World 1"
              }
            }
          }
        }'''.stripIndent())
    }
  }
}