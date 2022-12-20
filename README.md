# api-rest-open-client

Creé un nuevo proyecto desde 0 en SpringBoot desplegado en Railway y comience creando una base de datos PostgreSQL y Mysql. con varables de entorno fijas en Railway
para economizar recurso las las tablas de las bases luego de unos min del despliegue son borradas 

https://documenter.getpostman.com/view/4963699/2s8YzS1j99

<a href="https://api-rest-open-client-production.up.railway.app/cliente/todosclientes" target="_blank"> Todos los Clientes</a>

<a href="https://api-rest-open-client-production.up.railway.app/cliente/3" target="_blank">cliente 3</a>


### Railway




```properties
	spring_profiles_active=prod
	PROD_DB_HOST=containers-us-west-168.railway.app
	PROD_DB_PORT=7303
	PROD_DB_NAME=railway
	PROD_DB_PASSWORD=Nycb62Gq4KlYhhUBjmCR
	PROD_DB_USERNAME=root
	
	MYSQLDATABASE=railway
	MYSQLHOST=containers-us-west-168.railway.app
	MYSQLPASSWORD=Nycb62Gq4KlYhhUBjmCR
	MYSQLPORT=7303
	MYSQLUSER=root
	
```