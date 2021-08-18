classpath=".\
:./bin/*\
:./lib/*\
:/home/vstone/lib/*\
:/home/vstone/vstonemagic/*\
"

behaviors="jp/co/mycommu/*.java"

echo "javac -encoding utf-8 -classpath $classpath main/main.java $behaviors"
javac -encoding utf-8 -classpath  "$classpath"  main/main.java $behaviors

