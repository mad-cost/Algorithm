-- 코드를 입력하세요
select FH.FLAVOR
from FIRST_HALF AS FH JOIN ICECREAM_INFO AS II ON FH.FLAVOR = II.FLAVOR
where TOTAL_ORDER > 3000 AND INGREDIENT_TYPE = 'fruit_based'
ORDER BY FH.TOTAL_ORDER DESC ;