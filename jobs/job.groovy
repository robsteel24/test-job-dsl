pipelineJob('test') {
  definition {
    cps {
      script("""
        pipeline {
          agent any
          stages {
            stage ('test') {
              steps {
                echo "hello"
              }
            }
          }
        }""".stripIndent())
    }
  }
}