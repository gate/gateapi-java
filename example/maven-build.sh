#!/usr/bin/env sh
set -eu
# Build the adjacent candidate SDK first, then compile the actual example sources.
# install is local Maven installation; it does not publish a release or run trades.
example_script_dir=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
mvn -f "$example_script_dir/../pom.xml" -DskipTests -Dgpg.skip=true install
mvn -f "$example_script_dir/pom.xml" clean package
printf '%s\n' 'Example built. Read README.md before executing a trading command.'
