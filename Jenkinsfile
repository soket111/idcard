pipeline {
    agent any

    stages {
        stage('Git Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/soket111/idcard.git'
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Run Tests with SQLite') {
            steps {
                bat 'mvn test -Dspring.profiles.active=test'
            }
        }

        stage('MySQL Backup') {
            steps {
                bat 'docker exec idcard-mysql mysqldump -u root -pHello@123 B-THOUNG_Soket-db > backup.sql'
            }
        }

        stage('Deploy using Ansible') {
            steps {
                bat 'echo Deploy using Ansible playbook'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESS'
        }
        failure {
            echo 'BUILD FAILED'
        }
    }
}