echo running server...
title Server.
java -Xmx1024m -classpath bin;deps/jython.jar;deps/log4j-1.2.15.jar;deps/mina-core-1.1.7.jar;deps/slf4j-api-1.5.3.jar;deps/slf4j-log4j12-1.5.3.jar;xpp3-1.1.4c.jar;deps/xstream-1.3.1-20081003.103259-2.jar;deps/xpp3-1.1.4c.jar com.rs2hd.Main
pause
