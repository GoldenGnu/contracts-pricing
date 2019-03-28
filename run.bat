rmdir /s /q %~dp0src
rmdir /s /q %~dp0gradle
java -jar openapi-generator-cli.jar  generate -i https://api.swaggerhub.com/apis/bahrmichael/contracts-appraisal/2.0.0 -g java -c config.json
pause