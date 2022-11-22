all: build run

build:
	mvn clean compile assembly:single -e

ifeq ($(OS),Windows_NT)
run:
	java -jar .\target\MyStudyPlan-1.0-jar-with-dependencies.jar
else
run:
	java -jar ./target/MyStudyPlan-1.0-jar-with-dependencies.jar
endif

clean:
	mvn clean

.PHONY: all run build