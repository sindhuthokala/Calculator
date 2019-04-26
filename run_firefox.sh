#!/usr/bin/env bash

rm -rfv ./reports/firefox
mkdir -p ./reports/firefox

katalon_opts='-browserType="Firefox" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/OnlyProdWealthyRetirement"'
docker run --rm -v $(pwd)/Calculator:/katalon/katalon/source:ro -v $(pwd)/reports/firefox:/katalon/katalon/report -e KATALON_OPTS="$katalon_opts" katalonstudio/katalon
