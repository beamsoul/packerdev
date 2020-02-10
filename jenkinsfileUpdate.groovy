node{
    stage("Pull Repo") {
        git "https://github.com/beamsoul/packerdev.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}