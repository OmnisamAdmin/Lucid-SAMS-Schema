#!/bin/bash

# This script can be executed on windows by using GitBash or Cygwin
mvn clean install -DskipTests -Pbuild-xsd,generate-schemas;
mvn install -DskipTests