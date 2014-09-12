<img src='https://dl.dropboxusercontent.com/u/105638235/logo.png' width='128' height='128' title=''>

Paquete de íconos MarkYoun utilizado, puede descargar el archivo de gráficos vectoriales de:
https://dl.dropboxusercontent.com/u/105638235/Iconos.svg

#ITSaChat


Software de Chat para envío de mensajes, archivos y muy pronto videconferencia.

Pasos para usar como servidor:   

1. Descargar Serve  
2. Descargar Archivo sh, y ejecutar como superusuario, esto creará un servidor ftp en su ip y con el puerto 21
2. Iniciar Servidor  
3. Conectarse con los clientes configurados a la ip del servidor  

##Características del programa

- Utiliza envío de mensajes sin ningún tipo de encriptación y a pesar de que esto es realmente inseguro, al estar destinado a un uso de aula y no tan privado, permite que desde cualquier dispositivo conectado a la red con un cliente de telnet pueda ingresar al chat (*como un celular por ejemplo*)

- Es capaz de enviar archivos siempre que el servidor ftp esté abierto

- El servidor cuando se cierra guarda el historial de conversaciones y lo sube al servidor ftp si este está disponible

- Tiene un sistema por el cual los mensajes que envía el cliente son *"decodificados"* por el servidor, por ejemplo si el usuario envía el String

		/usuario Nombre2

	al servidor según el nombre que haya entablado con ese usuario le llegará el string:

		NombreAsignado > /usuario Nombre2

	lo cual hará que muestre a los demás usuarios

		El usuario NombreAsignado ha cambiado su nombre a Nombre2

	y ahora cuando este envíe mensajes aparecerá con su nuevo nombre.

##Lista de comandos

####Comandos del Cliente
En todos los comandos da lo mismo usar mayúsculas o minúscula en las palabras clave, todos estos comandos no son necesarios si se cuenta con el cliente oficial ya que hay botón para cada cosa :

- Cambiar nombre de usuario: */usuario NuevoUsuario*

- Enviar mensaje privado a otro usuario (las comillas si van): */privado "otrousuario" mensaje que se le desee enviar*

- Los archivos quedan subidos al servidor ftp para acceder a ellos luego, este servidor está obligado a tener las rutas */ITSaChat/Archivos/* y */ITSaChat/Interno/Historial/*

- Enviar un archivo, **esto necesita tener el cliente oficial**: */archivo /carpeta1/carpeta2/archivo.jpg*

- Activar y desactivar micrófono y cámara respectivamente(En proceso) **esto necesita tener el cliente oficial**:
	- */micOn*
	- */micOff*
	- */camOn*
	- */camOff*

- Salir del chat: */salir*

####Comandos del Server
- Establecer el servidor ftp a los que los usuarios deben comunicarse, para esto el servidor debe tener como nombre *Server*:
	
		/setftp direccionIpFtp puertoFtp

##Que hace cada clase del paquete Lógica

####Cliente

- **Client:** Maneja el socket Cliente-Server y deriva algunos comandos básicos como /archivo.

####Server
- **S2C:** Quiere decir *Server to Client* y maneja las conexiones individuales con cada cliente, hay una de estas clases instanciadas en el server por cada cliente
- **Server:** Maneja todas las conexiones con los clientes, los S2C, y ejecuta los comandos si es que se mandó alguno

####Clases Compartidas

- **MensajeFormateado**: Es una clase muy importante que es igual en ambos proyecotos, lo que hace es transformar el código del cliente a algo más atractivo y distintivo a la vista, agregando colores, tamaños y botones a los diferentes comandos que se ejecutan. genera los botones de los archivos que se envían.

- **Client/ServerProperties**: Posee las propiedades más importantes del server y el cliente dependiendo el proyecto en el que se encuentra,   Es una clase abstracta, y no hay mucho más que decir.

- **FTP:** Es la clase abstracta que se encarga de subir y descargar archivos del servidor ftp, y nada más.
