# Lead Gen Business

### Objetivos:
1. Practica tus consultas SQL.

Completa las consultas SQL a continuación utilizando la base de datos lead-gen-business-new y la siguiente estructura.


#### **Nota**
>Si está por delante, le recomendamos encarecidamente que trabaje en esta tarea, ya que esto realmente lo ayudaría a comprender cómo funciona GROUP BY y cuán poderoso puede ser MySQL. Si ya ha pasado más de 2 días completos estudiando ERD y MySQL, simplemente omita esta tarea y regrese más tarde cuando haya terminado con el bootcamp.

>Si ya tiene una base de datos llamada lead-gen-business, continúe y elimine esa base de datos y vuelva a crearla importando el archivo lead-gen-business-new.sql. La base de datos que se crea será diferente a la del archivo morepractice.sql que usamos durante los videos. 

>*Sugerencia: Aquí hay un ejemplo de una consulta que selecciona datos entre un rango de fechas*

>**SELECT Date,TotalAllowance FROM Calculation WHERE EmployeeId=1 AND Date >= '2011/02/25' AND Date < '2011/02/28'**

### **Consultas**


1. ¿Qué consulta ejecutaría para obtener los ingresos totales para marzo de 2012?

2. ¿Qué consulta ejecutaría para obtener los ingresos totales recaudados del cliente con una identificación de 2?

3. ¿Qué consulta ejecutaría para obtener todos los sitios que posee client = 10?

4. ¿Qué consulta ejecutaría para obtener el número total de sitios creados por mes por año para el cliente con una identificación de 1? ¿Qué pasa con el cliente = 20?

5. ¿Qué consulta ejecutaría para obtener el número total de clientes potenciales generados para cada uno de los sitios entre el 1 de enero de 2011 y el 15 de febrero de 2011?

6. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada uno de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011?

7. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada cliente cada mes entre los meses 1 y 6 del año 2011?

8. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales que hemos generado para cada uno de los sitios de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011? Solicite esta consulta por ID de cliente. Presente una segunda consulta que muestre todos los clientes, los nombres del sitio y el número total de clientes potenciales generados en cada sitio en todo momento.

9. Escriba una sola consulta que recupere los ingresos totales recaudados de cada cliente para cada mes del año. Pídalo por ID de cliente.

10. Escriba una sola consulta que recupere todos los sitios que posee cada cliente. Agrupe los resultados para que cada fila muestre un nuevo cliente. Se volverá más claro cuando agregue un nuevo campo llamado 'sitios' que tiene todos los sitios que posee el cliente. (SUGERENCIA: use GROUP_CONCAT)

*Nota: Puede descargar este archivo PDF que muestra los resultados esperados de las preguntas anteriores - Expected Result (Leads)*