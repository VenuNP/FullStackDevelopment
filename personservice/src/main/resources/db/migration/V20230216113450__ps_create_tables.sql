CREATE TABLE IF NOT EXISTS Persons(
id bigint(10) PRIMARY Key,
name varchar(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS ADDRESS(
id bigint(10) PRIMARY Key,
location varchar(255) NOT NULL,
type enum('HOME','OFFICE') NOT NULL,
active tinyint(1) DEFAULT 1 NOT NULL,
person_id bigint(10) NOT NULL,
key `location_idx` (location),
key `person_id_fk` (person_id),
CONSTRAINT person_id_fk FOREIGN KEY (person_id) REFERENCES Persons(id)
)

-- Travel App

CREATE TABLE IF NOT EXISTS Cities(
id bigint(10) PRIMARY Key Auto Increment,
name varchar(255) NOT NULL
)


CREATE TABLE IF NOT EXISTS Buses(
id bigint(10) PRIMARY Key  Auto Increment,
type enum('LUXURY','VOLVO','DELUX') NOT NULL,

)

CREATE TABLE IF NOT EXISTS Travels(
id bigint(10) PRIMARY Key  Auto Increment,
bus_id bigint(10) DEFAULT NULL,
source_city_id bigint(10) DEFAULT NULL,
destination_city_id bigint(10) DEFAULT NULL,
Fair FLOAT(10,2),
start_time DATETIME DEFAULT CURRENT_TIMESTAMP,
end_time DATETIME DEFAULT CURRENT_TIMESTAMP,
key `bus_id_fk` (bus_id),
key `source_city_id_fk` (source_city_id),
key `destination_city_id_fk` (destination_city_id),
CONSTRAINT bus_id_fk FOREIGN KEY (bus_id) REFERENCES Buses(id),
CONSTRAINT source_city_id_fk FOREIGN KEY (source_city_id) REFERENCES Cities(id),
CONSTRAINT destination_city_id_fk FOREIGN KEY (destination_city_id) REFERENCES Cities(id)

)

insert into Cities(name)  values('HYD');
insert into Cities(name)  values('VJD');


insert into Buses(type)  values('DELUX');
insert into Buses(type)  values('LUXURY');
insert into Buses(type)  values('VOLVO');

insert into Travels(bus_id,source_city_id,destination_city_id,Fair) values(1,1,2,150)
insert into Travels(bus_id,source_city_id,destination_city_id,Fair) values(2,1,2,250)
insert into Travels(bus_id,source_city_id,destination_city_id,Fair) values(3,1,2,350)



insert into Travels(bus_id,source_city_id,destination_city_id,Fair) values(1,2,1,170)
insert into Travels(bus_id,source_city_id,destination_city_id,Fair) values(2,2,1,270)






    
