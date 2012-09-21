@echo off
cd .
"C:\Program Files\Java\jdk1.6.0_21\bin\javac.exe" -cp lib/clientlibs.jar; -deprecation -d bin -sourcepath src src/*.java
pause
