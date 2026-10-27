#!/usr/bin/env sh
set -eu
# Resolve the same adjacent candidate from Maven local; do not silently use an old public SDK.
example_script_dir=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
mvn -f "$example_script_dir/../pom.xml" -DskipTests -Dgpg.skip=true install
"$example_script_dir/../gradlew" -p "$example_script_dir" build
printf '%s\n' 'Example built. Read README.md before executing a trading command.'
