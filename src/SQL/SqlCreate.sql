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

CREATE TABLE word_type (ID INTEGER NOT NULL, word_type VARCHAR(255), PRIMARY KEY (ID));
CREATE TABLE PRAVA (ID INTEGER NOT NULL, NAZEV VARCHAR(255), PRIMARY KEY (ID));
CREATE TABLE PRAVAXSKUPINAPRAV (ID INTEGER NOT NULL, fk_prava INTEGER, fk_skupinaprav INTEGER, PRIMARY KEY (ID));
CREATE TABLE UZIVATEL (ID INTEGER NOT NULL, JMENO VARCHAR(255), PRIJMENI VARCHAR(255), fk_skupinaprav INTEGER, PRIMARY KEY (ID));
CREATE TABLE SKUPINAPRAV (ID INTEGER NOT NULL, PRIMARY KEY (ID));
ALTER TABLE PRAVAXSKUPINAPRAV ADD CONSTRAINT FK_PRAVAXSKUPINAPRAV_fk_skupinaprav FOREIGN KEY (fk_skupinaprav) REFERENCES SKUPINAPRAV (ID);
ALTER TABLE PRAVAXSKUPINAPRAV ADD CONSTRAINT FK_PRAVAXSKUPINAPRAV_fk_prava FOREIGN KEY (fk_prava) REFERENCES PRAVA (ID);
ALTER TABLE UZIVATEL ADD CONSTRAINT FK_UZIVATEL_fk_skupinaprav FOREIGN KEY (fk_skupinaprav) REFERENCES SKUPINAPRAV (ID);

ALTER TABLE public.prava ADD COLUMN wf integer;



CREATE SEQUENCE public.wf_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.wf_id_seq
    OWNER TO postgres;
    
    
    
    
    

CREATE TABLE public.wf
(
    objekt character varying COLLATE pg_catalog."default" NOT NULL,
    stav character varying COLLATE pg_catalog."default" NOT NULL,
    nazev character varying COLLATE pg_catalog."default" NOT NULL,
    dostupne_stavy character varying COLLATE pg_catalog."default" NOT NULL,
    id integer NOT NULL DEFAULT nextval('wf_id_seq'::regclass),
    wf integer,
    CONSTRAINT wf_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.wf
    OWNER to postgres;
    
    
    INSERT INTO public.wf(
	objekt, stav, nazev, dostupne_stavy, id)
	VALUES ('Prava', 'zalozeno', 'Založeno', 'aktivni,neaktivni', 1);
INSERT INTO public.wf(
	objekt, stav, nazev, dostupne_stavy, id)
	VALUES ('Prava', 'aktivni', 'Aktivní', 'neaktivni', 2);
INSERT INTO public.wf(
	objekt, stav, nazev, dostupne_stavy, id)
	VALUES ('Prava', 'neaktivni', 'Neaktivní', 'aktivni', 3);
	
	
	ALTER TABLE public.prava
    ADD CONSTRAINT wf_fkey FOREIGN KEY (wf)
    REFERENCES public.wf (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;
    
    
    
    
CREATE INDEX fki_wf_fkey
    ON public.prava(wf);


	



