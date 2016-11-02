ALTER TABLE projects
ADD COLUMN cost INT DEFAULT 0;

UPDATE projects SET cost = (SELECT SUM(salary) FROM developers WHERE id_project = 1) WHERE id_project = 1;
UPDATE projects SET cost = (SELECT SUM(salary) FROM developers WHERE id_project = 2) WHERE id_project = 2;
UPDATE projects SET cost = (SELECT SUM(salary) FROM developers WHERE id_project = 3) WHERE id_project = 3;
UPDATE projects SET cost = 10000 WHERE id_project = 4;

