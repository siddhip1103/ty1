<?php

$a=$_GET["n1"];
$ht=$b=explode(",",$a);

//display

echo "<Array of high temp is:>";
foreach ($b as $c)
          echo $c."\t";
echo"<br>";

$sum=0;
$cn=count($b);
foreach($b as $c)
       $sum+=$c;
       
$avg=($sum/$cn);
rsort($b);
$k=array_Slice($b,0,5);
sort($ht);
$m=array_Slice($ht,0,5);



echo "Avg high temp is: $avg &deg c";
echo"<br>";
echo "Five warmest temp are:";
foreach($k as $k1)
          echo $k1."\t\t";
echo"<br>";

echo"Five coolest temp are:";
foreach($m as $m1)
            echo $m1."\t\t";
            
            
?>                          



     
