ALTER TABLE developers
ADD COLUMN salary INT DEFAULT 0;

UPDATE developers SET salary = 1700 WHERE id_dev = 1;
UPDATE developers SET salary = 1950 WHERE id_dev = 2;
UPDATE developers SET salary = 2500 WHERE id_dev = 3;
UPDATE developers SET salary = 2100 WHERE id_dev = 4;
UPDATE developers SET salary = 1200 WHERE id_dev = 5;
UPDATE developers SET salary = 3000 WHERE id_dev = 6;
