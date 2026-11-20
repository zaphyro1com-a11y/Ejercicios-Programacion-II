#!/bin/bash

if [ -z "$1" ]; then
    echo "Uso: $0 <ruta_del_proyecto>"
    exit 1
fi

PROYECTO="$1"

mkdir -p "$PROYECTO"/{src,build}

cat > "$PROYECTO/src/Main.java" << 'EOF'
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
EOF

cat > "$PROYECTO/Makefile" << 'EOF'
SRC := $(wildcard src/*.java)

run:
	javac -d build $(SRC)
	java -cp build Main

clean:
	rm -rf build/*
EOF

touch "$PROYECTO/README.md"

echo "Proyecto Java creado en: $PROYECTO"