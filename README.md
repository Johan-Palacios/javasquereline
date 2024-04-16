# Lines in Java using Swing
# Description es
Boock: Java cómo programar, 10ed - Deitel & Deitel 2016
Ejercicios del caso de estudio de GUI y gráficos 

[Link al Codigo](https://github.com/Johan-Palacios/javasquereline)
## Ejercicio 4.1
Cree el diseño que se muestra en la captura de pantalla izquierda de la figura 4.20. Este diseño dibuja
líneas que parten desde la esquina superior izquierda, y se despliegan hasta cubrir la mitad superior iz-
quierda del panel. Un método es dividir la anchura y la altura en un número equivalente de pasos
(nosotros descubrimos que 15 pasos es una buena cantidad). EI primer punto final de una línea siempre
estará en la esquina superior izquierda (0,0). EI segundo punto final puede encontrarse partiendo desde
la esquina inferior izquierda, y avanzando un paso vertical hacia arriba, y uno horizontal hacia la dere-
chas Dibuje una línea entre los dos puntos finales. Continúe avanzando un paso hacia arriba y a la de-
recha, para encontrar cada punto final sucesivo. La figura deberá escalarse de manera apropiada con-
forme usted cambie el tamaño de la ventana.

![image](https://github.com/Johan-Palacios/javasquereline/assets/77251405/e2f35e04-c9d5-40aa-b471-0bcea1b52f53)

## ShowCase ✨
![image](https://github.com/Johan-Palacios/javasquereline/assets/77251405/9f0ab94b-f093-4889-88a8-5b4100498834)

## Build 📦

```bash
mvn compile && mvn exec:java

```
