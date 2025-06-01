# Database
Sample H2 database
## 1. How to start
* Download H2 sources from https://h2database.com/html/download.html
* Unzip into user's working folder
* Start local server like https://h2database.com/html/cheatSheet.html (see "Server mode")
  * H2-server starts from `/h2/bin/h2.bat` or `h2.sh`
  * Concole should be opened in browser like this: https://h2database.com/html/quickstart.html
* Run the project App.java
  * It creates DB-scheme, tables and so on
  * In `service.DBService.run()` the record is written into DB, and then SELECT-query is executed (see logs).