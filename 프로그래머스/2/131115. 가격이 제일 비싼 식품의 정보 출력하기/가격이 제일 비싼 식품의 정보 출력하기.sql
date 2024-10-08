SELECT 
      PRODUCT_ID,
      PRODUCT_NAME,
      PRODUCT_CD,
      CATEGORY,
      PRICE
  FROM (
    SELECT
      RANK() OVER(ORDER BY PRICE DESC) AS R,
      PRODUCT_ID,
      PRODUCT_NAME,
      PRODUCT_CD,
      CATEGORY,
      PRICE
    FROM FOOD_PRODUCT   
  )A
  WHERE A.R =1
