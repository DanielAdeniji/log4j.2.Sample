setlocal

set "_classMain=log4j2.hello"

set "_javaFolder=C:\Program Files\Java\jdk-11.0.3\bin\"

set "_libHibernate=C:\downloads\hibernate.org\hibernate\v5.4.2\hibernate-release-5.4.2.Final\hibernate-release-5.4.2.Final\lib\required"

set "_libLog4JBase=C:\downloads\apache\log4j\v2.11.2\extract\apache-log4j-2.11.2-bin"

rem In log4JV2, we no longer need log4j-slf4j-impl-2.11.2.jar
rem set "_libLog4J=%_libLog4JBase%\log4j-core-2.11.2.jar;%_libLog4JBase%\log4j-api-2.11.2.jar;%_libLog4JBase%\log4j-slf4j-impl-2.11.2.jar;"

set "_libLog4J=%_libLog4JBase%\log4j-core-2.11.2.jar;%_libLog4JBase%\log4j-api-2.11.2.jar"

"%_javaFolder%\java" -cp bin;%_libHibernate%/*;%_libLog4J% %_classMain%

endlocal