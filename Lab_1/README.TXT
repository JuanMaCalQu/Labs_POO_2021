------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Lab_1
PURPOSE OF PROJECT: Learn about the basic knowledge in Object Oriented Programming through Greenfoot.
VERSION or DATE: 1.0 (4/2/2021)
HOW TO START THIS PROJECT:
AUTHORS: Adriana Velasquez, Juan Manuel Calderon, Daniela Ramírez
USER INSTRUCTIONS: 
2. Defina la imagen denominada rivets como imagen de fondo.
3. Identifique todos los actores que son necesarios para este juego.
4. Cree una subclase de `World` denominada `RobotWorld` mediante la imagen denominada rivets.
5. Cree una subclase de actor denominada `Robot`. Utilice la imagen man01 para representar el robot.
6. Cree una subclase de actor denominada `Wall`. Utilice la imagen brick para representar la pared.
7. Cree una subclase de actor denominada `Block`. Utilice la imagen Block para representar el bloque.
8. Cree una subclase de actor denominada `Scorepanel`. Utilice la imagen ScorePanel.
9. Cree una subclase de actor denominada `Pizza`. Utilice la imagen Pizza.
10. Cree una subclase de actor denominada `Home`. Utilice la imagen house-03.
11. Compile el proyecto.
12. Agregue una instancia de `Robot` a la ventana principal.

PARTE 2

1. Agregue su nombre como el autor de la clase `RobotWorld`.
2. Modifique el constructor `RobotWorld` para que cree un mundo de 800 X 600.
3. Modifique el método de actuación de bloque de modo que rote constantemente en el sentido de las agujas del reloj a una velocidad de 2.
4. Compile el proyecto.
5. Agregue una instancia de la clase `Block` y ejecute el proyecto.


Parte 3

1. Utilice `addObject` en el constructor de clase `RobotWorld` para agregar un robot en la parte superior izquierda del mundo (X: 48,Y: 50).
2. Utilice `addObject` en el constructor de clase `RobotWorld` para crear una fila de ladrillos dejando un hueco del ancho del bloque (X, Y): (48, 50), (52, 147), (159, 147), (266, 147), (587, 147), (692, 147), (791, 147).
3. Utilice `addObject` en el constructor de clase `RobotWorld` para agregar un bloque verde en el hueco (X, Y): (427, 145)
4. Utilice `addObject` en el constructor de `RobotWorld` para agregar una instancia de Home en la parte inferior derecha (X, Y): (751, 552).
5. Utilice `addObject` en el constructor de `RobotWorld` para agregar una instancia de `Scorepanel` en la parte inferior izquierda (X, Y): (71, 554).
6. Utilice `addObject` en el constructor de `RobotWorld` para agregar 5 instancias de `Pizza` (X, Y): (720, 46), (433, 38), (183, 302), (682, 312), (417, 537).
7. Cree un método `prepareScenario` bajo el constructor y transfiera todas las sentencias `addObject` al método prepare. Agregue una llamada a un método al método `prepareScenario` en el constructor.
8. Compile el escenario.
