SELECT companies.name_com Company, customers.name_cus Customer, projects.cost Cost FROM companies
JOIN customers ON companies.id_com = customers.id_com
JOIN projects ON projects.id_cus = customers.id_cus
WHERE projects.cost = (SELECT MIN(cost) FROM projects WHERE companies.id_com = projects.id_com);
