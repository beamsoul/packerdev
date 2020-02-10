node{
    stage("Pull Repo") {
        git "https://github.com/beamsoul/packer.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}