node{
    stage("Pull repo"){
        git "git@github.com:chaglare/packerdev.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}