# spring-mybatis-transaction
Spring MyBatis Transaction
==========================
  - Handles MyBatis Transaction

Server Info
===========
  - URL : http://localhost:8080/spring-mybatis-transaction/
  - Service : PersonService (Transaction Handle Here)
  - Database : mybatis_test
  - Username : root
  - Password : root

Explanation
===========
  Here, we are trying to handle the database transaction using spring and mybatis.
According to wikipedia, database transaction should provide an “all-or-nothing” proposition, 
stating that each work-unit performed in a database must either complete in its entirety or 
have no effect whatsoever.

Exception Response
==================
2016-03-09 17:19:31,589 [IndexController] ERROR com.ashim.springmybatis.controller.IndexController:29 - org.springframework.dao.DataIntegrityViolationException: 
### Error querying database.  Cause: com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Column 'name' cannot be null
### The error may exist in TestingMapper.xml
### The error may involve com.edw.springmybatis.mapper.TestingMapper.insert-Inline
### The error occurred while setting parameters
### SQL: insert into testing (name, address)         values ( ?, ? )
### Cause: com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Column 'name' cannot be null
; SQL []; Column 'name' cannot be null; nested exception is com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Column 'name' cannot be null