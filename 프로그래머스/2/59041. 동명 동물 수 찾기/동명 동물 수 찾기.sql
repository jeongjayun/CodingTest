-- 코드를 입력하세요

SELECT NAME
     , COUNT(*) AS COUNT
  FROM ANIMAL_INS
 WHERE NAME IS NOT NULL
 GROUP BY NAME
HAVING COUNT(*) >= 2
 ORDER BY NAME
 
-- SELECT A.*
--   FROM (SELECT NAME
--              , COUNT(NAME) AS COUNT
--           FROM ANIMAL_INS
--          GROUP BY NAME) A
--  WHERE COUNT >= 2
--  ORDER BY NAME