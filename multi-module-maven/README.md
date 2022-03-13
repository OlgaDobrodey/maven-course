- mvn help:effective-pom (super POM)
- mvn dependency:help
- mvn dependency:tree -Dverbose (tree with explanations)

docker run -d -p 8081:8081 --name nexus sonatype/nexus3

docker exec -it nexus cat /nexus-data/admin.password  - show wao genereted password