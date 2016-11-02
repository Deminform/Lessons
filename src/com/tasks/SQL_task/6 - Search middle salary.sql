SELECT AVG(salary) Salary, projects.name_project Project FROM developers JOIN projects
ON developers.id_project = (SELECT projects.id_project FROM projects WHERE cost = (SELECT MIN(cost) FROM projects))
WHERE projects.name_project = (SELECT projects.name_project FROM projects WHERE cost = (SELECT MIN(cost) FROM projects))
GROUP BY projects.name_project;
