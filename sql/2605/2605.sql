SELECT prod.name, prov.name FROM products prod 
JOIN  providers prov ON prod.id_providers=prov.id
JOIN categories cat ON prod.id_categories=cat.id
WHERE cat.id=6;