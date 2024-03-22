use univTulle;


SELECT m.libelle
FROM Modules m
INNER JOIN Suivre s ON m.idModule = s.idModule
INNER JOIN Etudiant e ON s.ine = e.ine
WHERE e.nom = 'BROWN' AND e.prenom = 'Lucie';

SELECT m.libelle
FROM Modules m
WHERE m.idModule NOT IN (
    SELECT s.idModule
    FROM Suivre s
    INNER JOIN Etudiant e ON s.ine = e.ine
    WHERE e.nom = 'BROWN' AND e.prenom = 'Lucie'
);

SELECT m.libelle, COUNT(s.ine) AS nombre_etudiants
FROM Modules m
LEFT JOIN Suivre s ON m.idModule = s.idModule
GROUP BY m.libelle;

SELECT AVG(note) AS moyenne_evaluation_1
FROM Passer
WHERE numEval = 1;

SELECT AVG(p.note) AS moyenne_lucie
FROM Passer p
INNER JOIN Suivre s ON p.ine = s.ine
INNER JOIN Etudiant e ON s.ine = e.ine
WHERE e.nom = 'BROWN' AND e.prenom = 'Lucie';

SELECT e.nom, e.prenom, AVG(p.note) AS moyenne_droit_romain
FROM Passer p
INNER JOIN Suivre s ON p.ine = s.ine
INNER JOIN Etudiant e ON s.ine = e.ine
INNER JOIN Modules m ON s.idModule = m.idModule
WHERE m.libelle = 'Droit Romain'
GROUP BY e.nom, e.prenom;

SELECT e.numEval, e.dateEval
FROM Evaluation e
LEFT JOIN Passer p ON e.numEval = p.numEval
LEFT JOIN Etudiant etu ON p.ine = etu.ine
WHERE etu.nom = 'GENPRI' AND etu.prenom = 'Erwan'
AND p.ine IS NULL;











