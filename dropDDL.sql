ALTER TABLE PRAVAXSKUPINAPRAV DROP CONSTRAINT FK_PRAVAXSKUPINAPRAV_fk_skupinaprav
ALTER TABLE PRAVAXSKUPINAPRAV DROP CONSTRAINT FK_PRAVAXSKUPINAPRAV_fk_prava
ALTER TABLE UZIVATEL DROP CONSTRAINT FK_UZIVATEL_fk_skupinaprav
DROP TABLE word_type CASCADE
DROP TABLE PRAVA CASCADE
DROP TABLE PRAVAXSKUPINAPRAV CASCADE
DROP TABLE UZIVATEL CASCADE
DROP TABLE SKUPINAPRAV CASCADE
