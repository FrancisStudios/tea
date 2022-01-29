@echo OFF
IF %1 == "!test?" GOTO test ELSE prod

:test
java -jar ../out/artifacts/Tea_jar/tea.jar D:/FRANCIS/PROGRAMMING/JAVA/tea/test/in/first.tea
GOTO _exit

:prod
java -jar tea.jar %1
GOTO _exit

:_exit