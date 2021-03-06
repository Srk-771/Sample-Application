node() {

    stage('git clone') {
        git url: 'https://github.com/Srk-771/Sample-Application.git'
    }
    stage('pollscm') {
        properties([pipelineTriggers([pollSCM('* * * * *')])])
    }
    stage('maven build') {
        sh 'mvn clean install'
        sh 'pwd'

    }
}
