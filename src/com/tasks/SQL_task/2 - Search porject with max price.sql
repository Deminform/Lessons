SELECT projects.name_project, developers.id_project, SUM(salary) AS TotalPrice FROM projects JOIN developers ON developers.id_project = projects.id_project
GROUP BY developers.id_project, projects.name_project ORDER BY TotalPrice DESC LIMIT 1 ;
