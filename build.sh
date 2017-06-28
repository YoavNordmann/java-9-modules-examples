#!/bin/bash

#Run command line in order to rerun every time a file changes:
#find . -name '*.java' | entr ./build.sh

JAVA9_BIN=/usr/lib/jvm/java-9-ea-oracle/bin/
set -x #echo on

/bin/rm -rf target/mlib
mkdir -p target/mlib
mkdir -p target/classes
#
#
######Compile and Package Neighbour Common
$JAVA9_BIN/javac -d target/classes `find neighbour-common -name *.java`
$JAVA9_BIN/jar -c -f target/mlib/neighbour-common.jar -C target/classes .
/bin/rm -rf target/classes
#
#
######Compile and Package Neighbour Hood
$JAVA9_BIN/javac -p target/mlib -d target/classes `find neighbour-hood -name *.java`
$JAVA9_BIN/jar -c -f target/mlib/neighbour-hood.jar -C target/classes .
/bin/rm -rf target/classes
#
#
######Run Neighbourhood Main File to see some output
$JAVA9_BIN/java -p target/mlib -m neighbour.hood/org.nordmann.neighbour.hood.Main
#
#
######Compile and Package Smallville
 $JAVA9_BIN/javac -p target/mlib -d target/classes `find smallville -name *.java`
 $JAVA9_BIN/jar -c -f target/mlib/smallville.jar -C target/classes .
 /bin/rm -rf target/classes
#
#
######Run Smallville Main File to see some output
 $JAVA9_BIN/java -p target/mlib -m smallville/org.nordmann.smallville.Main
