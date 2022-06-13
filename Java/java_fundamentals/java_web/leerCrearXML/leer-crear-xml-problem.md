# Leer y Crear XML
En esta actividad, leerá y describirá dos archivos XML.

## Crear
En su directorio preferido, cree un archivo **restaurant.xml.** Su trabajo es agregar un desayuno y una cena junto con el menú de almuerzo que tenemos de la lección anterior. Tenga en cuenta que la etiqueta **< lunchMenu>** ya no será la etiqueta raíz de su archivo. En lugar de esta, cree una elemento raíz apropiado para esta actividad.

## Leer
A continuación se muestra un archivo de ejemplo web.xml que usaremos para configurar servlets. Su trabajo es analizar este archivo y dar una hipótesis del propósito de cada etiqueta.

- **< display-name>**

- **< servlet>**

- **< servlet-name>**

- **< servlet-class>**

- **< servlet-mapping>**

- **< url-pattern>**

- **< welcome-file>**

    <?xml version="1.0" encoding="UTF-8"?>
    <web-app>
        <display-name>SimpleServletProject</display-name>
        
        <servlet>
            <servlet-name>simpleServlet</servlet-name>
            <servlet-class>org.codingdojo.tutorial.SimpleServlet</servlet-class>
        </servlet>
        
        <servlet-mapping>
            <servlet-name>simpleServlet</servlet-name>
            <url-pattern>/simpleServlet</url-pattern>
        </servlet-mapping>
        
        <servlet>
            <servlet-name>xmlServlet</servlet-name>
            <servlet-class>or.codingdojo.tutorial.XmlServlet</servlet-class>
        </servlet>
        
        <servlet-mapping>
            <servlet-name>xmlServlet</servlet-name>
            <url-pattern>/xmlServletpath</url-pattern>
        </servlet-mapping>
        
        <welcome-file-list>
        <welcome-file>index.html</welcome-file>
        </welcome-file-list>
    </web-app>

### Temas
- XML

## Actividades
-  Crear un menú de desayuno y cena para un restaurante.

- Analizar y dar una hipótesis de cada etiqueta del ejemplo anterior web.xml.

