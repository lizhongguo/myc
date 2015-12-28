python pre.py
java org.antlr.Tool c.g
java org.antlr.Tool cTree.g
javac *.java
java cm > input.s
nasm -g -f elf64 input.s
ld -s -o input input.o
