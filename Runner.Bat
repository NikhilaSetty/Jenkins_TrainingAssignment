set "location=C:\Users\naralasettynikhila\eclipse-workspace\DemoCode"
call mvn -f %location%/pom.xml dependency:resolve
call mvn -f %location%/pom.xml compile
call mvn -f %location%/pom.xml test 
pause