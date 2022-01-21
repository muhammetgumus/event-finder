# Event Finder Api
## Event Finder Api for Brandenburg Area


### Steps to Setup

**1. Clone the Application**

```bash
https://github.com/muhammetgumus/event-finder.git
```
<br>

**2. Create Mysql Database**
```
You can create database manually or using docker-compose up automatically mysql container that contains proper table will be created 
```
<br>

**3. Change Mysql username and password as per your installation**

+ open `src/main/resources/application.properties` or `.env` file that inside the base directory 

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation or `MYSQL_URL , MYSQL_ROOT_PASSWORD , MYSQL_DATABASE` values

<br>

**4. Build and run**

You can easily build and run the project using **docker-compose up** command while you are at base folder that contains **docker-compose.yml**

Alternatively you may run the project without using docker. So that you just need to clone the project and provide the mysql database and configuration by yourself.

> Note: `If you want to successfully run the project you need to provide mysql connection before the application up.`<br>
> Note: `According to your OS or docker-machine ip you may or may not change the urls that contain` **192.168.99.100**

The app will start running at <http://localhost:8080>.

### Explore the API

The api provides the following endpoints.

    POST /api/v1/all
    
    POST /api/v1/findById
    
    POST /api/v1/findByName
    
    POST /api/v1/findByOrganizer
    
    POST /api/v1/findByPlace
    
    POST /api/v1/findByPostalCode
    
    POST /api/v1/findByStreet
    
    POST /api/v1/findByTime
    
    POST /api/v1/findByDateBetween
 
For more information about about requests and responses you may check the <http://BASE_URL:8080/swagger-ui-custom.html>. 
