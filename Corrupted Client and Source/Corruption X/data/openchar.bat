@echo off
goto input

:input
set /p NAME=Please enter the character you wish to open: 
IF Exist savedgames\%NAME%.xml (
write savedgames\%NAME%.xml
exit
) ELSE (
cls
echo Character %NAME% does not exist, be sure to use underscores.
goto input
)