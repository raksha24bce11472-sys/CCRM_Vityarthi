@echo off
echo Compiling Java sources...
javac -d out src\edu\ccrm\cli\*.java src\edu\ccrm\domain\*.java src\edu\ccrm\service\*.java src\edu\ccrm\io\*.java src\edu\ccrm\util\*.java src\edu\ccrm\config\*.java
if errorlevel 1 pause & exit /b 1
echo Running main...
java -cp out edu.ccrm.cli.Main
pause
