#!/bin/bash
if [ $# -eq 1 ]; then
    JAVA_HOME=$1
fi

ulimit -c unlimited

export LD_LIBRARY_PATH=`pwd`
make all

$JAVA_HOME/bin/javac JVMKiller.java
$JAVA_HOME/bin/java --enable-native-access=ALL-UNNAMED JVMKiller
