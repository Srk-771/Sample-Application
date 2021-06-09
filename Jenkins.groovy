import hudson.plugins.git.*;

def scm = new GitSCM("https://github.com/Srk-771/Sample-Application.git")
scm.branches = [new BranchSpec("master")];

def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "Jenkinsfile-build.groovy")

def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "Course-Web-App")
job.definition = flowDefinition

parent.reload()
