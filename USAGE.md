# Usage / Sample commands

1. Compile (Windows):
   javac -d out src\edu\ccrm\cli\*.java src\edu\ccrm\domain\*.java src\edu\ccrm\service\*.java src\edu\ccrm\io\*.java src\edu\ccrm\util\*.java src\edu\ccrm\config\*.java

2. Run:
   java -cp out edu.ccrm.cli.Main

3. CLI flow to create screenshots:
   - Choose 1 -> add 2 sample students
   - Choose 2 -> list students (verify)
   - Choose 5 -> Export Students (creates data/exported_students.csv)
   - Choose 6 -> Backup Exported File (creates backups/backup_YYYYMMDD_HHMMSS/...)

4. Sample test data files are in /data (students.csv, courses.csv, etc).
