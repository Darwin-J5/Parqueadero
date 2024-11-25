# 🚗 Sistema de Gestión de Parqueadero
## Descripción del Proyecto
Este es un sistema para la gestión de un parqueadero, diseñado utilizando el paradigma de programación orientada a objetos. El sistema permite la interacción entre usuarios, empleados y vehículos, proporcionando funcionalidades como:

- Gestión de espacios de parqueo.
- Registro y control de vehículos.
- Administración de reservas.
- Gestión de clientes (regulares y visitantes).
- 
El proyecto está estructurado modularmente siguiendo el diagrama UML y emplea GitFlow para la gestión del desarrollo.
# Clases del Sistema
## Persona

Clase base para representar a cualquier individuo (clientes o empleados).
## Empleado

Subclase de Persona. Representa a los empleados del parqueadero.
Especializaciones:
- Supervisor: Gestiona los pisos y las reservas de puestos.
- Cajero: Procesa los pagos.
## ClienteRegular

Subclase de Persona. Representa clientes con una suscripción activa.
## Visitante

Subclase de Persona. Representa usuarios esporádicos sin suscripción.
## Parqueadero

Administra los espacios de parqueo y la interacción con empleados y clientes.
## Espacio

Representa un espacio de estacionamiento individual dentro del parqueadero.
## Reserva

Gestiona la reserva de espacios por parte de los clientes.
## Vehiculo

Clase base para representar a los vehículos.
Especializaciones:
- Automovil: Vehículo con puertas.
- Motocicleta: Vehículo con cilindraje.
- Camion: Vehículo con peso y tamaño.
## Contrato

Representa la relación laboral entre el parqueadero y un empleado.
## Suscripcion

Relacionada con los clientes regulares que tienen un plan activo.

