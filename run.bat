rmdir /s /q %~dp0src
rmdir /s /q %~dp0gradle
java -jar openapi-generator-cli-4.0.0.jar generate --skip-validate-spec -i https://api.swaggerhub.com/apis/rihanshazih/contracts-appraisal/1.2.0/swagger.json -g java -c config.json
pause