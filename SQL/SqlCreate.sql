CREATE USER admin WITH
	LOGIN
	SUPERUSER
	CREATEDB
	CREATEROLE
	INHERIT
	REPLICATION
	CONNECTION LIMIT -1
	PASSWORD 'xxxxxxx';

CREATE DATABASE "contentSimplierDb"
    WITH 
    OWNER = admin
    ENCODING = 'UTF8'
    LC_COLLATE = 'Czech_Czech Republic.1250'
    LC_CTYPE = 'Czech_Czech Republic.1250'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


	



