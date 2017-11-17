@ echo off
set rootDir=%cd%
cd %rootDir%
call mvn clean package docker:build
pause
::exit