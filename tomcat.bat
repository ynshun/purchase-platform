@ echo off
set rootDir=%cd%
cd %rootDir%
call mvn tomcat7:redeploy
pause
::exit