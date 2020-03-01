pipeline {
   agent any

   stages {
      stage('pull code') {
         steps {
         	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '0c2f7cd4-b265-4a78-9b8f-eaadaba84c9f', url: 'git@github.com:youcyousyunn/eshop.git']]])
         }
      }
      stage('build project') {
         steps {
        	sh label: '', script: 'mvn clean package'
         }
      }
      stage('publish project') {
         steps {
         	echo 'publish project'
         }
      }
   }
}

