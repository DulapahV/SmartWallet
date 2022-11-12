build:
	mvn clean compile assembly:single -e
	@echo java -jar .\target\MyStudyPlan-1.0-jar-with-dependencies.jar > MyStudyPlan.bat
	@echo pause >> MyStudyPlan.bat
run: build
	java -jar .\target\MyStudyPlan-1.0-jar-with-dependencies.jar
clean:
	mvn clean
	@del MyStudyPlan.bat

.PHONY: run build