SET H2URL=jdbc:h2:~/terasoluna
SET H2USER=sa

REM �R���\�[��
java -cp h2.jar org.h2.tools.Console -url %H2URL% -user %H2USER%

pause

