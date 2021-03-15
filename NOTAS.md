# Instalación de GIT

## En ubuntu/debian:
```sudo apt install git```

## En centOS/fedora/redhatEL:
```sudo yum install git```

## En windows: tengo que descargar el programa de instalación y ejecutarlo... siguiente....
De esta página descargo GIT: https://git-scm.com

# Creación de un repositorio de GIT:

Ejecutamos git init DENTRO de la carpeta RAIZ del directorio que alberga mi código fuente:
```git init```

# Dentro de git...
Tenemos una carpeta con nuestro código: /home/ubuntu/environment/curso
Hay una carpeta con el repositorio:     /home/ubuntu/environment/curso/.git


### Qué hay en mi carpeta de mi código?
El código fuente de mi aplicación, en su última versión (por defecto) en la rama en la que me encuentre

### Qué hay en mi repositorio?
El código fuente de mi aplicación, en todas sus versiones en todas las ramas

Las cosas(ficheros) los llevaremos de nuestra carpeta al repo, o al revés

La carpeta de mi código es lo que en git se denomina WORKSPACE

En git hay una cosa más por ahí en medio... AREA DE STAGING

WORKSPACE               AREA DE STAGING         REPO (la carpeta .git)
------------------>>>>------------------>>>>>-------------------------------------------
ficheros                                        Commits (paquetes de código sellados)
   en 
directorios
                <<<<<<<<<<<<???????<<<<<<<<<<<<<<                        


# git status 
Nos da el estado del WORKSPACE

#git add
Marcar un archivo/carpeta para seguimiento.

git add NOMBRE_FICHERO

Por defecto trabajan de forma recursiva

git add NOMBRE_CARPETA
git add *   # Este no incluye carpetas ocultas
git add .   # Este incluye carpetas ocultas


