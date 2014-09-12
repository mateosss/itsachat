#creado por mayo :D
echo "Descargando vsftpd..."
sudo apt-get install vsftpd

echo "Configurando ftp..."
rm /etc/vsftpd.conf
touch /etc/vsftpd.conf
echo "listen=YES" >> /etc/vsftpd.conf
echo "anonymous_enable=YES" >> /etc/vsftpd.conf
echo "local_enable=YES" >> /etc/vsftpd.conf
echo "dirmessage_enable=YES" >> /etc/vsftpd.conf
echo "use_localtime=YES" >> /etc/vsftpd.conf
echo "xferlog_enable=YES" >> /etc/vsftpd.conf
echo "connect_from_port_20=YES" >> /etc/vsftpd.conf
echo "secure_chroot_dir=/var/run/vsftpd/empty" >> /etc/vsftpd.conf
echo "pam_service_name=vsftpd" >> /etc/vsftpd.conf
echo "rsa_cert_file=/etc/ssl/certs/ssl-cert-snakeoil.pem" >> /etc/vsftpd.conf
echo "rsa_private_key_file=/etc/ssl/private/ssl-cert-snakeoil.key" >> /etc/vsftpd.conf

echo "Iniciando ftp..."
sudo service vsftpd restart

echo "Listo!"
zenity --info --text "Usted ya tiene su server ftp corriendo en la direccion!\n\t\t"

