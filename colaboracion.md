Parte 7: Investigación sobre colaboración en equipo con Git y GitHub 

En esta parte, cada alumno deberá investigar y responder a las siguientes preguntas en un documento colaboracion.md. Se recomienda consultar la documentación oficial de Git y GitHub, así como otras fuentes fiables.

Preguntas de investigación:

 1. ¿Qué es un repositorio remoto y en qué se diferencia de uno local? 
Un repositorio remoto es aquel que se guarda en la nube y puede modificarse por 	distintas personas. La principal diferencia del remoto con el local, es que no se permite la colaboración de manera directa hasta que los cambios se guarden mediante comandos.

2. ¿Qué es un "fork" en GitHub y cómo se usa en proyectos colaborativos? 
Un fork es una opción dentro de GitHub, una forma de copia de un repositorio público de un usuario. Sirve y se utiliza para que varias personas puedan añadir su código propio sin afectar al repositorio original.

3. ¿Qué es un "pull request" (PR) y cuál es su propósito? Describe el flujo de trabajo típico.
Un pull request es una solicitud para fusionar cambios de una rama o fork a otra., luego esa solicitud queda al pendiente de ser aceptada o no para poder fusionarse.
En un flujo de trabajo el desarrollador se encarga de crear una nueva rama, se realizan cambios y los confirma, luego sube sus cambios y desde GitHub se crea un pull request hacia la rama principal del repositorio. Este pull request es revisado por otros desarrolladores y son los encargados de decidir si se acepta o no el pull. Si es aprobado se fusionan los cambios de esa rama a la principal.


4. ¿Qué son los "issues" y los "proyectos" en GitHub? ¿Para qué sirven? 
Los issues son herramientas en GitHub que permiten buscar errores, sugerir mejoras, gestionar tareas dentro de un repositorio. Los proyectos son tableros en los cuales se organizan tareas para planificar y gestionar el desarrollo.

5. Explica la importancia de las ramas en un entorno de trabajo colaborativo. ¿Cómo se suelen organizar las ramas en proyectos grandes (ejemplo: main, dev, feature)? 
Las ramas dentro de un ámbito de trabajo colaborativo son muy importantes, dado que son capaces de permitir un buen ritmo de trabajo separado los unos de los otros, evitando conflictos. 
Las ramas se organizan en:
Main: Es la versión principal y estable.
Dev: Se prueban los cambios antes de implementarse en el main.
Feature: Se desarrollan características, y son ramas que se eliminan luego de fusionarse.
Hotfix: Son ramas que se encargan de solucionar errores urgentes, derivan del main, y se fusionan en el main y el dev luego de solucionar el error.
