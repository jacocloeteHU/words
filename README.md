# words
lingo words application
[![codecov](https://codecov.io/gh/jacocloeteHU/words/branch/master/graph/badge.svg?token=01QIR7QIV6)](https://codecov.io/gh/jacocloeteHU/words)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.lingo%3Awords&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.lingo%3Awords)

<br/>
Voor auto  deployment heb ik heroku gebruikt waar de lingo game app gebruik van maakt.<br/>

https://lingo-words.herokuapp.com/<br/>

sample api <br/>
https://lingo-words.herokuapp.com/words ophalen van alle woorden.<br/>
https://lingo-words.herokuapp.com/words/length/5    (5 - 7) <br/>
https://lingo-words.herokuapp.com/word            ophalen van random woord met random length <br/>
https://lingo-words.herokuapp.com/word/length/5     (5 - 7) ophalen van random woord met fixed length <br/>
https://lingo-words.herokuapp.com/word/check/varen  voor het checken van een valid woord<br/>

Er is voor static analysis gebruik gemaakt van Checkstyle, en sonarqube.<br/>
Codecov is gebruikt voor het bepalen van de codecoverage.<br/>
Jacoco is ook gebruikt voor het controleren van de codecov.<br/>
Unit en integratie tests zitten in de tests folder. <br/>
Springboot annotations zijn gebruikt voor depenency injection. <br/>
Packages worden ook automatisch gebuild bij CI en CD.<br/>
