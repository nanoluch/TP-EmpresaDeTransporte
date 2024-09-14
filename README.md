# Empresa de Transporte

## Situación
Necesito hacerme cargo de la entrega de paquetes que actualmente cuenta con la problemática de ver cómo voy a redistribuir los paquetes en los distintos medios de transporte que tengo en mi empresa.

Se busca desarrollar las funcionalidades que me permitan ofrecerle al medio de transporte un paquete y que el medio de transporte diga si lo puede llevar o no.

La empresa actualmente está compuesta por los siguientes medios de transporte:
- Bicicletas
- Automóviles
- Camiones

Se saben las dimensiones de cada paquete a distribuir y, por lo tanto, se cuenta con su alto, ancho y profundo. Dichos datos son necesarios para calcular el volumen. Por último, se tiene el peso de este.

## Restricciones o Definiciones:

### Bicicleta:
- Se mueve dentro de la ciudad.
- Puede enviar dos paquetes de hasta 0.125 m³ y un máximo de 15 kg.
  
  **NOTA:** Si no tengo destino, el primer paquete me define el destino hacia dónde va la bicicleta.

### Automóvil:
- Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
- Puede llevar hasta 2 m³ de carga y hasta 500 kg.

### Camión:
- Abarca todas las ciudades necesarias.
- Puede llevar hasta 20 m³ de carga y un máximo de 16 toneladas.

## Requerimientos

a) Generar la estructura de proyecto adecuada.
b) Implementar la totalidad de las clases que involucran la solución al problema.
c) Implementar casos de prueba que validen la totalidad de los requerimientos.
