node() {
    }
    stage('git clone') {
        git url: 'https://github.com/Srk-771/Sample-Application.git'
    }
    stage('pollscm') {
        pollSCM: '* * * * *'
    }
    stage('maven build') {
        sh 'mvn pom.xml clean install'
        sh 'pwd'

    }
}