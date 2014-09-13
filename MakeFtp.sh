#creado por mayo :D
echo "Descargando vsftpd..."
sudo apt-get install vsftpd

echo "Configurando ftp..."
sudo rm /etc/vsftpd.conf
sudo touch /etc/vsftpd.conf
sudo mkdir /var/ftp
sudo echo "listen=YES" >> /etc/vsftpd.conf
sudo echo "anonymous_enable=YES" >> /etc/vsftpd.conf
sudo echo "local_enable=NO" >> /etc/vsftpd.conf
sudo echo "anon_max_rate=104857" >> /etc/vsftpd.conf
sudo echo "dirmessage_enable=YES" >> /etc/vsftpd.conf
sudo echo "listen_port=21" >> /etc/vsftpd.conf
sudo echo "anon_root=/var/ftp" >> /etc/vsftpd.conf
sudo mount --bind $HOME /var/ftp

echo "Iniciando ftp..."
sudo service vsftpd restart

echo "Creando carpetas del Chat"

mkdir $HOME/ITSaChat/
mkdir $HOME/ITSaChat/Archivos
mkdir $HOME/ITSaChat/Interno
mkdir $HOME/ITSaChat/Interno/Historial

echo "Listo!"
zenity --info --text "Usted ya tiene su server ftp corriendo en la direccion!\n\t\t"

