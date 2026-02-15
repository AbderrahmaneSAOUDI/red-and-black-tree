#!/bin/bash
# Create bin directory if it doesn't exist
mkdir -p bin

# Compile
javac -d bin -sourcepath src/main/java src/main/java/Main.java

# Run
if [ $? -eq 0 ]; then
    java -cp bin Main
fi
