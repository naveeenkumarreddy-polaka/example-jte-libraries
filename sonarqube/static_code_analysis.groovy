void call(){
  println "sonarqube: static_code_analysis()"
  bat "mvn package sonar:sonar"
  Println "static analysis  Done"
}

