<html>
<body><?php
$f1=fopen("demo.txt","r+");
$size=filesize("demo.txt");
echo"$size</br>";
for($i=0;$i<filesize("demo.txt");$i++){
$f2=fgetc($f1);
echo"$f2";}
fclose($f1);
?>
</body></html>