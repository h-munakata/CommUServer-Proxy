classpath=".:/home/vstone/lib/*\
:/home/vstone/vstonemagic/*\
:/usr/local/share/OpenCV/java/*\
"

OPTION="-Dfile.encoding=UTF8 -Djava.library.path=/usr/local/share/OpenCV/java/"

echo "java -classpath $classpath $OPTION main/main $1"
java -classpath "$classpath" $OPTION main/main $1