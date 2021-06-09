node() {
    }
    stage('git clone') {
        git url: 'https://github.com/Srk-771/Web-App.git'
    }
    stage('pollscm') {
        poll: '* * * * *'
    }
    stage('maven build') {
        sh 'mvn pom.xml clean install'
        sh 'pwd'

    }
}