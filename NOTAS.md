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

## git rm --cached
Permite sacar cosas del area de staging...
Hace que mis ficheros ya no sean controlados por el SCM

## git rm 
Elimina el fichero:
    - De mi carpeta local: WORKSPACE
    - Del área de Staging
    - Del repo del SCM en la version actual


git config --global user.name "Ivan"
git config --global user.email ivan.osuna.ayuste@gmail.com


Reescribir la historia del proyecto


Estoy haciendo Funcionalidad 1
    trabajo...
    trabajo...
        Llamada de telefono.... Cambia una cosa en producción que está fallando
    Quiero guarda aquello... por que? COMMIT 1 - Parcial (No está acabado)
        LO SUBO PERO NO ESTA ACABADO PERO ME VOY A LA CAMA
    trabajo...
    trabajo...
    Quiero guarda aquello... por que? COMMIT 2 - Parcial (No está acabado)
        LO SUBO PERO NO ESTA ACABADO PERO ME VOY A LA CAMA
    trabajo...
    trabajo...
    Quiero guarda aquello... por que? COMMIT 3 - Parcial (No está acabado)
        LO SUBO QUE YA ESTA GUAY !!!! 
    ----> PUSH
    Los 3 commits, empaquetalos en uno único. con el mensaje:
        FUNCIONALIDAD R0098:
            Incorp...


